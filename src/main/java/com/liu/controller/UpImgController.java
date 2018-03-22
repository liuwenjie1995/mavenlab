package com.liu.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpImgController {
/*
    * 这个类是用于将文件上传和下载的
    * 目前文件的上传是将文件存在一个图库并将文件的地址保存在数据库
    * 需要时将从数据库中读取数据库文件和图片的地址，使用vue和异步
    * 将文件下载下来
    *
    * 保存文件的地址选择为使用腾讯云的对象存储方法，使用其api进行上传与下载
    *
    * 请注意，文件中需要编写一个利用时间和随机数进行确定唯一文件名的函数
     * */

}
