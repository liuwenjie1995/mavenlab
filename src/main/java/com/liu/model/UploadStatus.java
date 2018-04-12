package com.liu.model;

public class UploadStatus {
    public String filepath;

    @Override
    public String toString() {
        return "UploadStatus{" +
                "filepath='" + filepath + '\'' +
                '}';
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public UploadStatus(String filepath) {

        this.filepath = filepath;
    }
}
