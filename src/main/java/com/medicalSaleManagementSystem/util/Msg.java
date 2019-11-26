package com.medicalSaleManagementSystem.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 消息类
 *
 * <p>传递用户需要返回的数据，以及状态码和提示消息</>
 * <p>具体错误码，请参考错误码查询.xlsx</p>
 *
 * @author 林贤钦
 * @version 1.0
 * @since 0.1.0
 */
public class Msg implements Serializable {
    private static final long serialVersionUID = -9184987587173201422L;
    private int code;
    private String msg;
    private Map<String,Object> ext = new HashMap<>();

    /**
     * 往ext中添加数据
     *
     * @param key, value
     * @return this
     * @author 林贤钦
     */
    public Msg add(String key, Object value){
        this.getExt().put(key, value);
        return this;
    }

    /**
     * 创建一个业务执行成功的消息
     *
     * @param
     * @return this
     * @author 林贤钦
     */
    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功");
        return result;
    }

    /**
     * 创建一个业务执行出错的消息
     *
     * @param  msg 消息
     * @return this
     * @author 林贤钦
     */
    public static Msg fail(String msg){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

}
