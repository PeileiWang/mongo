package com.mongo.mongo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Created by Wangpl
 * Time 2018/8/13 10:16
 */
public class Result<T> {
    private int code;
    private String msg;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;


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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
