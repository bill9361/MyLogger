package com.bgb.logger.model;

import com.google.gson.GsonBuilder;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Result<T> implements Serializable
{
    private boolean success = true;
    private String message = "";
    private String other ;//其他信息
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this);
    }
}
