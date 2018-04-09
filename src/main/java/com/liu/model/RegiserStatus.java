package com.liu.model;

public class RegiserStatus {
    private int status;

    public RegiserStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RegiserStatus{" +
                "status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
