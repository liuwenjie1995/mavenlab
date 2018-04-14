<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="/static/scanusers/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="/static/scanusers/css/demo.css">
    <link rel="stylesheet" href="/static/scanusers/css/style.css">
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css"/>

    <title>
        主页
    </title>
</head>
    <body>
        <div class="container-fluid">
            <ul>
                <li><a href="/login">登录</a> </li>
                <li><a href="/scanusers">浏览优秀作品</a> </li>
                <li><a href="/stuupload">上传作品</a> </li>
                <li><a href="/stuupload2">上传头像</a></li>
                <li><p>
                        欢迎您!${Session["username"]}<br>
                </p></li>
                <li><a href="/logout">退出</a></li>
            </ul>
        </div>
    </body>
</html>