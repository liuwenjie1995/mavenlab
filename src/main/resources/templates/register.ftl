<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet"  href="/bootstrap/css/bootstrap.min.css"/>
    <script src="/bootstrap/js/jquery-3.3.1.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
</head>

<body>
    <div id="title" style="height: 100px" class="container-fluid">
        <h1 style="margin-left: 100px">用户注册</h1>
    </div>

<div style="min-height: 400px;width: 100%;background: #f0f0f0">
    <div id="register-container"
         style="height: 400px; width: 60%;" class="container-fluid form-horizontal">
        <div class="form-group col-lg-12">
            <label>姓名</label>
            <input type="text" class="form-control" id="username" placeholder="用户名"/>
        </div>
        <div class="form-group col-lg-12">
            <label>密码</label>
            <input type="password" class="form-control" id="password" placeholder="password"/>
        </div>
        <div class="form-group col-lg-12">
            <label>重复密码</label>
            <input type="password" class="form-control" id="password2" placeholder=""/>
        </div>
        <div class="form-group col-lg-12">
            <label>电话</label>
            <input type="text" class="form-control" id="tel" placeholder="tel"/>
        </div>
        <div class="col-lg-12" style="text-align: center">
            <button id="submit" class="btn btn-lg btn-info">注册</button>
        </div>
    </div>
</div>

</body>
<script>
    $(document).ready(
        $("#submit").click(
            function () {
                var mUsername  = $.trim($("#username").val());
                var mPassword  = $.trim($("#password").val());
                var mPassword2 = $.trim($("#password2").val());
                if((mUsername=="")||(mPassword=="")||(mPassword2==""))
                {
                    alert("未填写用户名或密码")
                }
                else if(!mPassword===mPassword2)
                {
                    alert("两次输入密码出错")
                }
                else
                {
                    alert("registing")
                    var data = {username:mUsername,password:mPassword,rank:1};

                    $.ajax(
                            {
                                type:"POST",
                                url:"/register.do",
                                data:data,
                                dataType:'json',

                                success:function (data) {
                                    if(data["data"]["status"]===1)
                                    {
                                        alert("注册成功");
                                        window.location.href="/login";
                                    }
                                    else
                                    {
                                        alert("注册失败,请联系管理员")
                                    }
                                }
                            }
                    )
                }
            }
        )
    )
</script>
</html>