package com.medicalSaleManagementSystem.authorization.resolvers;

import com.medicalSaleManagementSystem.authorization.annotation.CurrentUser;
import com.medicalSaleManagementSystem.config.Constants;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;


/**
 * 增加方法注入，将含有CurrentUser注解的方法参数注入当前登录用户
 * @author ScienJus
 * @date 2015/7/31.
 */

@Component
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Autowired
    private UserService userService;
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        //如果参数类型是User并且有CurrentUser注解则支持
        if (parameter.getParameterType().isAssignableFrom(User.class) &&
                parameter.hasParameterAnnotation(CurrentUser.class)) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        //取出鉴权时存入的登录用户Id
        Integer currentUserId = (Integer) webRequest.getAttribute(Constants.CURRENT_USER_ID, RequestAttributes.SCOPE_REQUEST);
        if (currentUserId != null) {
            //从数据库中查询并返回
            return  userService.findUserByEmpId(currentUserId);
            //return userRepository.findOne(currentUserId);
        }
        throw new MissingServletRequestPartException(Constants.CURRENT_USER_ID);
    }
}