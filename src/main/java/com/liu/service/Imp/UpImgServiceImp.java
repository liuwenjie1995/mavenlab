package com.liu.service.Imp;

import com.aliyun.oss.OSSClient;
import com.liu.service.UpImgService;

public class UpImgServiceImp implements UpImgService {
    @Override
    public String updateHead(String imgurl) throws Exception {
        if (imgurl==null)
        {
            throw new Exception("url不能为空");
        }
        return null;
    }
}
