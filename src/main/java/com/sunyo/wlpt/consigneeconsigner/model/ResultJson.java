package com.sunyo.wlpt.consigneeconsigner.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultJson<T> implements Serializable{
    private static final long serialVersionUID = 1L;

    // 状态码 正确为200
    private String code = "200";
    // 描述
    private String msg = "";

    private String error;
    // 返回对象
    private T data;
    //返回的JWT
    private String jwtToken;

    public ResultJson() {
    }

    public ResultJson(String code) {
        this.code = code;
    }

    public ResultJson(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultJson(T data) {
        this.data = data;
    }

    public ResultJson(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
