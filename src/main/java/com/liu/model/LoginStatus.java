package com.liu.model;

public class LoginStatus {
    private int status;

    @Override
    public String toString() {
        return "LoginStatus{" +
                "status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LoginStatus(int status) {
        this.status = status;
    }
}
