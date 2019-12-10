package com.medicalSaleManagementSystem.authorization.manager.impl;

import com.medicalSaleManagementSystem.authorization.manager.TokenManager;
import com.medicalSaleManagementSystem.authorization.model.TokenModel;
import com.medicalSaleManagementSystem.config.Constants;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component("redisTokenManager")
public class RedisTokenManager implements TokenManager {
    //注入redisTemplate
    @Resource(name="redisTemplate")
    private RedisTemplate<String, String> redisTemplate;

    public TokenModel createToken(int userId) {
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token);
        //存储到redis并设置过期时间
        String adminId=String.valueOf(userId);
        redisTemplate.boundValueOps(adminId).set(token, Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return model;
    }
    public TokenModel getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        //使用userId和源token简单拼接成的token，可以增加加密措施
        Integer admin_id = Integer.parseInt(param[0]);
        String token = param[1];
        return new TokenModel(admin_id, token);
    }
    public boolean checkToken(TokenModel model) {
        if (model == null) {
            return false;
        }
        String adminId=String.valueOf(model.getUserId());
        String token = redisTemplate.boundValueOps(adminId).get();
        if (token == null || !token.equals(model.getToken())) {
            return false;
        }
        //如果验证成功，说明此用户进行了一次有效操作，延长token的过期时间
        redisTemplate.boundValueOps(adminId).expire(Constants.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
        return true;
    }
    public void deleteToken(int userId) {
        String adminId=String.valueOf(userId);
        redisTemplate.delete(adminId);
    }
}