package com.medicalSaleManagementSystem.util;

import org.springframework.stereotype.Component;

@Component
public class ResponseUtil {

    /**
     * 生成一个 Response 对象
     * @return response 对象
     */
    public static Response newResponseInstance(){
        Response response = new Response();

        return response;
    }

}
