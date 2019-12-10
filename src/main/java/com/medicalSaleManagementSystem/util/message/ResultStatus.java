package com.medicalSaleManagementSystem.util.message;

/**
 *返回参数错误码枚举
 */
public enum ResultStatus {

    SUCCESS(200, "success"), //操作成功

        //  201 post对象创建出成功
        //  202 post 、put、delete、patch 请求已经被接受
        //  204 delete 、put、patch 操作已经成功执行，但是没返回数据
        //  301 get 资源已被移除
        //  303 get 重定向
        //  304 资源没有被修改

    ERROR(400, "Error"),       // 400 get、post 、put、delete、patch 参数列表错误

        // 401 get、post 、put、delete、patch 未授权

        // 403 get、post 、put、delete、patch 访问受限，授权过期

        // 404 get、post 、put、delete、patch 资源、服务未找到

        //405 get、post 、put、delete、patch 不允许的http方法


    INVALID_SERVICE(199, "invalid service"),//服务不可用

    SERVICE_EXCEPTION(500, "service exception"), //  系统内部出错

    UNKNOWN(999, "unknown"),//未知错误

    //搜索结果不存在
    USER_NOT_EXISTS(1401, "user not exists"),
    PERMISSION_DENIED(1402,"permission denied"),
    ARTICLE_NOT_EXIST(1403,"article not exist"),
    ARTICLE_HAS_BEEN_DELETED(1403,"article has been deleted"),
    //参数类型缺失
    PARAMETER_ILLEGAL(1501, "parameter illegal");

    private final int value;
    private final String reasonPhrase;

    private ResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }


    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}