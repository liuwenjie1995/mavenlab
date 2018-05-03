<!DOCTYPE html>
<html>
<head>
    <title>文件上传</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="/fileuploader/webuploader.css"/>
    <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
        <meta name="viewport" content="width=device-width" />
    </head>
    <body>
    <div style="height: 50px;background-color: #0f0f0f">
        <p style="color: white;padding-top: 5px;font-size: 30px">新建项目</p>
    </div>
    <div class=" container-fluid">
        <p id="result"></p>

        <div class="form-group col-lg-offset-1 col-lg-10">
            <label for="title">标题</label>
            <input type="text" class="form-control" id="title" placeholder="">
        </div>

        <div class="form-group col-lg-offset-1 col-lg-10">
            <label for="subtitle">简介</label>
            <textarea class="form-control" id="subtitle"></textarea>
        </div>

        <div class="form-group col-lg-offset-1 col-lg-10">
            <label for="instruction">介绍</label>
            <textarea class="form-control" id="instruction"  style="height: 150px"></textarea>
        </div>

        <div id="image_container" class="container col-lg-10 col-lg-offset-1" style="border:1px ">
            <div id="pic1" class="col-lg-3 col-md-3">
                <img id="img1" name="imglist" src="/images/uploadicon.jpg" width="200px" height="200px">
            </div>
            <div id="pic2" class="col-lg-3 col-md-3">
                <img id="img2" name="imglist" src="/images/uploadicon.jpg" width="200px" height="200px">
            </div>
            <div id="pic3" class="col-lg-3 col-md-3">
                <img id="img3" name="imglist" src="/images/uploadicon.jpg" width="200px" height="200px">
            </div>
            <div id="pic4" class="col-lg-3 col-md-3">
                <img id="img4" name="imglist" src="/images/uploadicon.jpg" width="200px" height="200px">
            </div>
            </div>

        </div>
        <div id="img_upload_container" style="margin-top: 20px; text-align: end" class="col-lg-offset-1">
            <input type="file" class="file btn-info" name="imgfile" id="showimg_btn" placeholder="选择上传图片" ><br>
        </div>
            <div id="uploadForm" class="col-lg-offset-1">
                <input id="upfile" type="file" name="file" class="file_bar btn-info"/>
                <button id="upload_img_btn" class="btn" style="margin-top: 20px">上传至服务器</button>
            </div>
    </body>

<script>

    var input = document.getElementById("showimg_btn");
    //检测浏览器是否支持FileReader
    if (typeof (FileReader) === 'undefined') {
        result.innerHTML = "抱歉，你的浏览器不支持 FileReader，请使用现代浏览器操作！";
        input.setAttribute('disabled', 'disabled');
    } else {
        //开启监听
        input.addEventListener('change', readFile, false);
    }
    //todo 这里的base64转换可以单独封装成一个函数
    function readFile() {
        var file = this.files[0];
        if (!/image\/\w+/.test(file.type)) {
            alert("只能选择图片");
            return false;
        }
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function (ev) {
            var initimg = "http://localhost:8080/images/uploadicon.jpg";
            base64Code = this.result;
            if($("#img1")[0].src === initimg)
            {
                $("#img1").attr("src",base64Code);
            }
            else if (document.getElementById("img2").src=== initimg)
            {
                $("#img2").attr("src",base64Code);
            }
            else if ($("#img3")[0].src === initimg)
            {
                $("#img3").attr("src",base64Code);
            }
            else if ($("#img4")[0].src === initimg)
            {
                $("#img4").attr("src",base64Code);
            }
            else
            {
                alert("上传图片数量已达到限制,请停止上传图片");
            }
        }
    }

    function uploadfImg(sendimg) {
        alert("uploading image");
        var imgpath=null;
        var addimg =sendimg;
        data={picture:addimg};
        $.ajax({
            type:"POST",
            url:"/imageupload.do",
            data:data,
            dataType:'json',
            async: false,
            success:function (data) {
                if(data["data"]!==null)
                {
                    alert(data["data"]);
                    imgpath =  data["data"];
                }
            }

        });
        return imgpath;
    }


    var upfileurl = "fileUpload.do";
    function uploadFile() {
        var filepath = null;
        var formData = new FormData();
        formData.append('file', $('#upfile')[0].files[0]);
        $.ajax({
            url:upfileurl,
            type: 'POST',
            cache: false,
            data: formData,
            processData: false,
            contentType: false,
            async: false,
            success:function (data) {
                if(data["data"]!==null)
                {
                    alert(data["data"]);
                    filepath =  data["data"];
                }
            }
        })
        return filepath;
    }


    $("#upload_img_btn").click(
        function () {
            var initimg = "http://localhost:8080/images/uploadicon.jpg";
            base64Code = this.result;

            var filepath = uploadFile();

            if($("#img1")[0].src !== initimg)
            {
                var img1 = uploadfImg($("#img1")[0].src);
            }
            if (document.getElementById("img2").src!== initimg)
            {
                var img2 = uploadfImg($("#img2")[0].src);
            }
            if ($("#img3")[0].src !== initimg)
            {
                var img3 = uploadfImg($("#img3")[0].src);
            }
            if ($("#img4")[0].src !== initimg)
            {
                var img4 = uploadfImg($("#img4")[0].src);
            }
            else
            alert("未选择图片");

            $.ajax({
                url:"/dbupload.do",
                type:'POST',
                data:{
                    "title":$("#title").val(),
                    "subtitle":$("#subtitle").val(),
                    "instruction":$("#instruction").val(),
                    "img1":img1,
                    "img2":img2,
                    "img3":img3,
                    "img4":img4,
                    "file":filepath

                },
                dataType:'json',
                success:function (data) {
                    if(data["data"]!=null)
                    {
                        alert(data["data"]);
                        return data["data"];
                    }
                }
            });

        }

    );



    var savedburl ="";
    function send_db(url,data) {
        $.ajax({
            url:savedburl,
            type:'POST',
            data:data,
            dataType:'json',
            success:function (data) {
                if(data["data"]!=null)
                {
                    alert(data["data"]);
                }
            }
        });
    }


</script>

</html>