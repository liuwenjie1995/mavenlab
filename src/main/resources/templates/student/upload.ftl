<!DOCTYPE html>
<html>
<head>
    <title>文件上传</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
        <meta name="viewport" content="width=device-width" />
    </head>
    <body>
    <p id="result"></p>
    <input type="file" class="file" name="imgfile" id="showimg_btn" placeholder="选择上传图片">
    <img src="" id="showImg">
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
            $("#showImg").attr("src",base64Code);
        }
    }
</script>

</html>