package com.medicalSaleManagementSystem.util;

import com.google.gson.Gson;

/**
 * @author
 * 返回结果集对象
 */

public class Result<T> {

    //返回错误码
    private Integer status;
    //返回token
    private String token;
    //返回信息
    private String message;
    //返回对象
    private T data;

    public Result(){
        this.status = ResultStatus.SUCCESS.value();
        this.message = ResultStatus.SUCCESS.getReasonPhrase();
    }

    public Result( ResultStatus resultStatus, T data){
        this.data = data;
        this.status = resultStatus.value ();
        this.message = resultStatus.getReasonPhrase ();

    }
    public Result(ResultStatus resultStatus){
        this(resultStatus,null);
    }

    public void setResult(ResultStatus resultStatus){
        this.status = resultStatus.value();
        this.message = resultStatus.getReasonPhrase();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStatus ( ) {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage ( ) {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }

    public T getData ( ) {
        return data;
    }

    public void setData ( T data ) {
        this.data = data;
    }
    public String toJson(){
        return new Gson().toJson(this);
    }
}
