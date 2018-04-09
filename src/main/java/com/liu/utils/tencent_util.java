package com.liu.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;
import org.springframework.context.annotation.Description;

/*
* @Author:liuwenjie
* @ClassName : QcloudDemo
*
* */
public class tencent_util{
    /*
    *
    *@Title getCosClient
    *@Description 腾讯云客户端连接
    *
    * 设置value key,配置连接客户端
    *
    * */
    public static COSClient getCOSClient(){
        long appid = 126;
        String secretId = "";
        String secretKey = "";
        String bucketName = "";

        Credentials cred  = new Credentials(appid,secretId,secretKey);

        ClientConfig clientConfig = new ClientConfig();

        clientConfig.setRegion("");

        COSClient cosClient = new COSClient(clientConfig,cred);
        return cosClient;
    }

    public static String uploadFile(String bucket_name,String  cospath,String realpath)
    {
        /*
        * 不知但文件返回的是什么,暂时认为是文件在网络的地址
        * todo 需要将数据的路径放在数据库
        * */
        UploadFileRequest uploadFileRequest = new UploadFileRequest
                (bucket_name,cospath,realpath);
        String uploadFileRet = getCOSClient().uploadFile(uploadFileRequest);
        return uploadFileRet;
    }


}