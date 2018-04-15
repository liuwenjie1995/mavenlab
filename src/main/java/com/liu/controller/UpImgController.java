package com.liu.controller;

import com.liu.model.LoginStatus;
import com.liu.model.NorResponse;
import com.liu.model.UploadStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author liuwenjie 
 *
 * **/

@Controller
public class UpImgController {


    @RequestMapping(value = "fileUpload.do",method = RequestMethod.GET)
    @ResponseBody
    public NorResponse<String> fileupload(MultipartFile file)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String filename = file.getOriginalFilename();
        String filetype = filename.split(".")[filename.split(".").length-1];
        String time     = df.format(new Date());
        int    typeflag = get_flag(filetype);
        String path     = get_filepath(typeflag);

        if(file.isEmpty()||typeflag==0)
            return new NorResponse<>(0,"未创建图片或文件!",null);

        File dest = new File(path+"stuup"+time+UUID.randomUUID()+"."+filetype);

        if(!dest.getParentFile().exists())
                dest.getParentFile().mkdir();

        if (transformTofile(file,dest))
        {
            return new NorResponse<>(1,"上传文件成功!",dest.getAbsolutePath());
        }
        else
            return new NorResponse< >(0,"上传文件失败",null);
    }

    @RequestMapping(value = "/imageupload.do")
    @ResponseBody
    public NorResponse<Integer> imgupload(@RequestParam Map<String,Object> params, HttpSession session)
    {
        String base64img    = (String) params.get("picture");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time         = df.format(new Date());
        int    typeflag     = 1;
        String path         = get_filepath(typeflag);

        File dest = new File(path+"stuup"+time+UUID.randomUUID()+"."+"jpg");

        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdir();

        if(base64img==null)
            return new NorResponse<>(1,"上传失败,上传图片不存在",0);
        else if(!ImgtoFile(base64img,dest.getAbsolutePath()))
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
        return new NorResponse<>(0,"保存数据库失败",null);
    }

    public int get_flag(String filetype){

        switch (filetype)
        {
            case "zip":
                return 2;
            case  "rar":
                return 2;
            case "jpg":
                return 1;
            case "png":
                return 1;
            default:
                return 0;
        }
    }

    private boolean transformTofile(MultipartFile file,File dest)
    {
        try
        {
            file.transferTo(dest);
            return true;

        }catch (IllegalStateException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public String get_filepath(int mType){
        switch (mType)
        {
            case 2:
                return System.getProperty("user.dir")+"/uploadFile/";
            case 1:
                return System.getProperty("user.dir")+"/uploadImage/";
            default:return null;
        }
    }

    public boolean ImgtoFile(String imgstr,String imgFilePath)
    {
        try{
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] b = decoder.decodeBuffer(imgstr.split(",")[1]);
            for (int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                    b[i]+=256;
            }
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
