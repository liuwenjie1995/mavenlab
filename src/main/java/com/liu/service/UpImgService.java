package com.liu.service;

import org.springframework.web.multipart.MultipartFile;

public interface UpImgService {
    String upimage(String imgstr);
    String  upload_file(MultipartFile file);
}
