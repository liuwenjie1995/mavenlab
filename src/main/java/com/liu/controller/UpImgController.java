package com.liu.controller;

import com.liu.beans.UpDemo;
import com.liu.dao.DemoDao;
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
    @Autowired
    private DemoDao demoDao;

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
    public NorResponse<String> img_upload(@RequestParam Map<String,Object> params, HttpSession session)
    {

        String base64img = (String) params.get("picture");
        if(base64img==null)
            return new NorResponse<>(1,"上传失败,上传图片不存在",null);

        String imgpath = up_service.upimage(base64img);
        if(imgpath==null)
            return new NorResponse<>(1,"上传失败,未存储到服务器",null);
        else
            return new NorResponse<>(1,"success",imgpath);
    }

    @RequestMapping(value = "/dbupload.do")
    @ResponseBody
    //todo 将上传的文件名放置在数据库中
    public NorResponse<String> saveTosql(@RequestParam Map<String,Object> params, HttpSession session)
    {

//            "title":$("#title").val(),
//            "subtitle":$("#subtitle").val(),
//            "instruction":$("#instruction").val(),
//            "img1":img1,
//            "img2":img2,
//            "img3":img3,
//            "img4":img4,
//            "file":filepath
        @SuppressWarnings("uncheck")
        int userid = (int) session.getAttribute("userid");
        String title = (String) params.get("title");
        String subtitle = (String) params.get("subtitle");
        String instruction = (String)params.get("instruction");
        String img1path = (String)params.get("img1");
        String img2path = (String)params.get("img2");
        String img3path = (String)params.get("img3");
        String img4path = (String)params.get("img4");
        String filepath = (String)params.get("file");

//        this.userid = userid;
//        this.checkerid = checkerid;
//        this.title = title;
//        this.subtitle = subtitle;
//        this.instruction = instruction;
//        this.ischeck = ischeck;
//        this.filepath = filepath;
//        this.img1 = img1;
//        this.img2 = img2;
//        this.img3 = img3;
//        this.img4 = img4;

        UpDemo upDemo = new UpDemo(userid,
                                    0,
                                    title,
                                    subtitle,
                                    instruction,
                                    filepath,
                                    img1path,
                                    img2path,
                                    img3path,
                                    img4path);

        try {
            demoDao.save(upDemo);
        }catch (Exception e){

        return new NorResponse<>(0,"保存数据库失败",null);
        }
        return new NorResponse<>(0,"保存数据库成功","1");
    }

}
