package com.liu.service.Imp;

import com.liu.service.UpImgService;
import com.liu.utils.Upload_util;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
import java.util.regex.Pattern;

import static com.liu.utils.Upload_util.*;

@Service("UpImgService")
public class UpImgServiceImp implements UpImgService {


    @Value("${cbs.filesPath}")
    public String mParentPath;

    @Override
    public String upimage(String imgstr) {
        String laststr = "";

        laststr = Upload_util.getlaststr(imgstr.split(",")[0]);

        int    typeflag = 1;
        String time     = get_now_time();
        String path     = get_filepath(typeflag);
        File dest       = new File(mParentPath+path+"stuup_"+time+ UUID.randomUUID()+"."+laststr);

        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdir();

        if(ImgtoFile(imgstr,dest.getAbsolutePath()))
            return dest.getAbsolutePath();
        else
            return null;
    }

    @Override
    public String upload_file(MultipartFile file) {
        String filename = file.getOriginalFilename();
        String filetype = filename.substring(filename.lastIndexOf(".")+1);
        String time     = Upload_util.get_now_time();
        int    typeflag = get_flag(filetype);
        String path     = get_filepath(typeflag);

        if(file.isEmpty()||typeflag==0)
            return null;
        File dest = new File(mParentPath+path+"stuup_"+time+UUID.randomUUID()+"."+filetype);

        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdir();

        if (transformTofile(file,dest))
        {
            return dest.getAbsolutePath();
        }
        else
            return null;
    }
}
