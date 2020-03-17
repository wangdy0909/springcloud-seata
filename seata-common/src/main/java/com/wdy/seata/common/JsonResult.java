package com.wdy.seata.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JsonResult<T> {
    private int code = 0;
    private String message;
    private T result;

    public JsonResult() {
    }

    public static <T> JsonResult<T> ok() {
        JsonResult<T> result = new JsonResult();
        result.setMessage("success");
        return result;
    }

    public static <T> JsonResult<T> ok(T resultObj) {
        JsonResult<T> result = new JsonResult();
        result.setResult(resultObj);
        result.setMessage("success");
        return result;
    }

    public static <T> JsonResult<T> error(int errCode, String message) {
        JsonResult<T> result = new JsonResult();
        result.setCode(errCode);
        result.setMessage(message);
        return result;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.code == 0;
    }
}
