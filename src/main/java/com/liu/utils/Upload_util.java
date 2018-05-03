package com.liu.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.regex.Pattern;

public class Upload_util {

    public static String get_now_time() {
        String time;
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        time = year+"y_"+month+"m_"+date+"d_"+hour +"h_";
        return time;
    }

    public static String get_filepath(int mType) {
        switch (mType) {
            case 2:
                return  "/uploadFile/";
            case 1:
                return  "/uploadImage/";
            default:
                return null;
        }
    }

    public static int get_flag(String filetype){

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

    public static boolean ImgtoFile(String imgstr,String imgFilePath)
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

    public static boolean transformTofile(MultipartFile file, File dest)
    {
        try
        {
            file.transferTo(dest);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public static String getlaststr(String content)
    {
        String laststr = "";
         content = content;
        if (Pattern.matches(".*png.*",content))
            laststr = "png";
        else if (Pattern.matches(".*jpg.*",content))
            laststr = "jpg";
        else if (Pattern.matches(".*jpeg.*",content))
            laststr = "jpeg";

        return laststr;
    }

}
