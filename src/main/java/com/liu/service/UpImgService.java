package com.liu.service;

import org.springframework.web.multipart.MultipartFile;

public interface UpImgService {
    boolean upimage(String imgstr);
    String  upload_file(MultipartFile file);
}
