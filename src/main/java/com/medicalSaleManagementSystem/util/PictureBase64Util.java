package com.medicalSaleManagementSystem.util;

import java.util.Base64;

/**
 * base64编码字符串与图片相互转换的工具
 *
 * @author ChoKhoOu
 * @version 1.0
 * @since 0.1.0
 */
public class PictureBase64Util {
    /**
     * 将base64编码字符串转换成图片
     *
     * @param imageBase64 Base64编码字符串
     * @return b1
     * @author ChoKhoOu
     */
    public byte[] base64ToPic(String imageBase64) {
        byte[] b1 = null;
        if("".equals(imageBase64)){
            return b1;
        }
        Base64.Decoder decoder = Base64.getDecoder();
        try{
            if (imageBase64.indexOf("data:image/jpeg;base64,") != -1) {
                b1 = decoder.decode(imageBase64.replaceAll("data:image/jpeg;base64,", ""));
            } else {
                if (imageBase64.indexOf("data:image/png;base64,") != -1) {
                    b1 = decoder.decode(imageBase64.replaceAll("data:image/png;base64,", ""));
                } else {
                    b1 = decoder.decode(imageBase64.replaceAll("data:image/jpg;base64,", ""));
                }
            }
            // 调整异常数据
            for (int i = 0; i < b1.length; ++i) {
                if (b1[i] < 0) {
                    b1[i] += 256;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return b1;
    }

    /**
     * 将图片转换成Base64编码字符串
     *
     * @param img 图片字节数组
     * @return
     * @author ChoKhoOu
     */
    public String picToBase64(byte[] img) {
        //TODO 实现图片转换成Base64编码字符串
        return null;
    }
}
