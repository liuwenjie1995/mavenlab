package com.liu.service.Imp;

import com.liu.service.UpImgService;
import com.liu.utils.uploaderutils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

import static com.liu.utils.uploaderutils.*;
import static com.liu.utils.uploaderutils.transformTofile;

@Service("UpImgService")
public class UpImgServiceImp implements UpImgService {
    @Override
    public boolean upimage(String imgstr) {

        int    typeflag = 1;
        String time     = get_now_time();
        String path     = get_filepath(typeflag);

        File dest = new File(path+"stuup_"+time+ UUID.randomUUID()+"."+"jpg");

        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdir();

        return ImgtoFile(imgstr,dest.getAbsolutePath());

    }

    @Override
    public String upload_file(MultipartFile file) {
        String filename = file.getOriginalFilename();
        String filetype = filename.substring(filename.lastIndexOf(".")+1);
        String time     = uploaderutils.get_now_time();
        int    typeflag = get_flag(filetype);
        String path     = get_filepath(typeflag);

        if(file.isEmpty()||typeflag==0)
            return null;

        File dest = new File(path+"stuup_"+time+UUID.randomUUID()+"."+filetype);

        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdir();

        if (transformTofile(file,dest))
            return dest.getAbsolutePath();
        else
            return null;
    }
}
