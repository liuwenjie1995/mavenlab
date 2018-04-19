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
        <div id="image_container" class="container col-lg-10" style="border:1px solid #0f0f0f;margin-left: 0px;">
            <div id="pic1">
                <img id="img1" name="imglist" class="col-lg-2 " src="data:image/jpeg;base64,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" >
            </div>
        </div>
        <div id="img_upload_container" style="margin-top: 20px; text-align: end">
            <input type="file" class="file" name="imgfile" id="showimg_btn" placeholder="选择上传图片"><br>
            <button id="upload_img_btn" onclick="uploadfImg()">上传图片</button>
        </div>
            <div id="uploadForm">
                <input id="upfile" type="file" name="file"/>
                <button id="upload" type="button" onclick="uploadFile()">upload</button>
            </div>
    </body>
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
                }
            }
        })
    }


</script>

</html>