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
        <p id="result"></p>
        <div id="image_container" class="container col-lg-10 col-lg-offset-1" style="border:1px solid #0f0f0f;margin-left: 0px;">
            <div id="pic1" class="col-lg-2 ">
                <img id="img1" name="imglist" src="" >
            </div>
            <div id="pic2" class="col-lg-2 ">
                <img id="img1" name="imglist" src="" >
            </div>
            <div id="pic3" class="col-lg-2 ">
                <img id="img1" name="imglist" src="" >
            </div>
            <div id="pic4" class="col-lg-2 ">
                <img id="img1" name="imglist" src="" >
            </div>
            <div id="pic5" class="col-lg-2 ">
                <img id="img1" name="imglist" src="" >
            </div>

        </div>
        <div id="img_upload_container" style="margin-top: 20px; text-align: end">
            <input type="file" class="file" name="imgfile" id="showimg_btn" placeholder="选择上传图片"><br>
            <button id="upload_img_btn" onclick="uploadfImg()">上传图片</button>
        </div>
            <div id="uploadForm" class="col-md-12">
                <input id="upfile" type="file" name="file"/>
                <button id="upload" type="button" onclick="uploadFile()">upload</button>
            </div>
    </body>
<script>
    $(document).ready(
       function () {
           var base64img = "data:image/png;base64,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";

            $("#pic1").attr("src",base64img);
            $("#pic2").attr("src",base64img);
            $("#pic3").attr("src",base64img);
            $("#pic4").attr("src",base64img);
            $("#pic5").attr("src",base64img);
        }

    )

</script>
<script>
    $(document).ready(

        function () {
            var addimg =$("#img1")[0].src;
            $("#img2").attr('src',addimg);
        }
    )

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
            base64Code = this.result;
            $("#img1").attr("src",base64Code);
        }
    }

    function uploadfImg() {
        alert("uploading image");
        var addimg =$("#img1")[0].src;
        data={picture:addimg};
        $.ajax({
            type:"POST",
            url:"/imageupload.do",
            data:data,
            dataType:'json',
            success:function (data) {
                if(data["data"]===1)
                {
                    alert("success");
                }
                else if(data["data"]==0)
                {
                    alert(data["message"].toString());
                }
            }

        });
    }

    var upfileurl = "fileUpload.do";
    function uploadFile() {
        var formData = new FormData();
        formData.append('file', $('#upfile')[0].files[0]);
        $.ajax({
            url:upfileurl,
            type: 'POST',
            cache: false,
            data: formData,
            processData: false,
            contentType: false,
            success:function (data) {
                if(data["data"]===1)
                {
                    alert("上传成功");
                    $.ajax({
                        url:savedburl,
                        type:'POST',
                        data:data,
                        dataType:'json',
                        success:function (data) {
                            if(data["data"]===1)
                            {
                                alert("上传文件成功");
                            }
                        }
                    });
                }
            }
        })
    }

    var savedburl ="";
    function send_db(url,data) {
        $.ajax({
            url:savedburl,
            type:'POST',
            data:data,
            dataType:'json',
            success:function (data) {
                if(data[data]===1)
                {
                    alert("存储到数据库了");
                }
            }
        });
    }

</script>

</html>