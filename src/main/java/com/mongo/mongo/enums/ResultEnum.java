package com.mongo.mongo.enums;

/**
 * Created by Wangpl
 * Time 2018/8/13 10:38
 */
public enum ResultEnum {
    SUCCESS(0, "成功"),
    ERROR(501, "错误")
    ;
    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
