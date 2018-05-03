package com.liu.controller;

import com.liu.model.NorResponse;
import com.liu.service.UpImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.util.*;
/**
 * @author liuwenjie 
 *
 * **/

@Controller
public class UpImgController {
    @Autowired
    public UpImgService up_service;

    @RequestMapping(value = "fileUpload.do",method = RequestMethod.POST)
    @ResponseBody
    public NorResponse<String> fileupload(MultipartFile file)
    {
        String final_path = up_service.upload_file(file);
        if(final_path==null)
             return new NorResponse< >(0,"上传文件失败",null);
        else
            return new NorResponse<>(1,"上传文件成功!",final_path);
    }

    @RequestMapping(value = "/imageupload.do")
    @ResponseBody
    public NorResponse<Integer> img_upload(@RequestParam Map<String,Object> params, HttpSession session)
    {

        String base64img = (String) params.get("picture");
        if(base64img==null)
            return new NorResponse<>(1,"上传失败,上传图片不存在",0);
        else if(!up_service.upimage(base64img))
            return new NorResponse<>(1,"上传失败,未存储到服务器",0);
        else
            return new NorResponse<>(1,"success",1);
    }

    //todo 将上传的文件名放置在数据库中
    public NorResponse<String> saveTosql(@RequestParam Map<String,Object> params, HttpSession session)
    {
        @SuppressWarnings("uncheck")
        String userid = (String) session.getAttribute("userid");
        String[] images = (String[])params.get("images");
        String file = (String)params.get("file");
        int demoid = 1;
        if(images!=null)
            for (String imgurl:images)
            {}


        return new NorResponse<>(0,"保存数据库失败",null);
    }

}
