package com.najie.exam.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import static java.lang.Character.UnicodeBlock.*;
import com.google.common.base.Strings;

@ApiModel("通用接口返回对象")
public class ResponseData<T>  {

    private final static int SUCCESS_CODE = 0;

    private final static String SUCCESS_MSG = "操作成功";

    private final static int ERROR_CODE = 1;

    /**响应状态*/
    @ApiModelProperty(value = "返回状态 0成功 其他均为异常状态", example = "1")
    public int code;

    /**响应消息*/
    @ApiModelProperty(value = "返回消息", example = "操作成功")
    private String message;

    /**响应数据*/
    @ApiModelProperty(value = "返回数据", example = "")
    private T data;

    public static <T> ResponseData<T> ok() {
        return new ResponseData<T>().setCode(SUCCESS_CODE).setMessage(SUCCESS_MSG);
    }

    public static <T> ResponseData<T> ok(T data) {
        return new ResponseData<T>().setCode(SUCCESS_CODE).setMessage(SUCCESS_MSG).setData(data);
    }

    public static <T> ResponseData<T> error(String message) {
        return new ResponseData<T>().setCode(ERROR_CODE).setMessage(message);
    }

    /**
     * 自定义相关参数
     */
    public static <T> ResponseData<T> custom(int code, String message) {
        return new ResponseData<T>().setCode(code).setMessage(message);
    }

    /**
     * 自定义相关参数
     */
    public static <T> ResponseData<T> custom(int code, String message, T data) {
        return new ResponseData<T>().setCode(code).setMessage(message).setData(data);
    }


    public int getCode() {
        return code;
    }

    public ResponseData<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseData<T> setMessage(String message) {
        this.message = checkStringContainChinese(message)?message:"服务操作失败，请重试或联系技术部开发小组！";
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseData<T> setData(T data) {
        this.data = data;
        return this;
    }


    private static boolean checkStringContainChinese(String checkStr){
        if(!Strings.isNullOrEmpty(checkStr)){
            char[] checkChars = checkStr.toCharArray();
            for(int i = 0; i < checkChars.length; i++){
                char checkChar = checkChars[i];
                if(checkCharContainChinese(checkChar)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkCharContainChinese(char checkChar){
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(checkChar);
        if(CJK_UNIFIED_IDEOGRAPHS == ub || CJK_COMPATIBILITY_IDEOGRAPHS == ub || CJK_COMPATIBILITY_FORMS == ub ||
                CJK_RADICALS_SUPPLEMENT == ub || CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A == ub || CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B == ub){
            return true;
        }
        return false;
    }


}
