<html>
<head>
    <title>教师审核界面</title>
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <style>
        li{color:white}
    </style>
</head>

<body class="container-fluid">
<div class="col-md-2" style="height: 100%;background-color: #146eb4">
    <ul style="font">

        <p style="font-size: 22px;margin-top: 40dp;padding-top40dp;color: white">操作</p>
        <li >作品审核</li>
    </ul>
</div>
<div class="col-md-10" style="height: 100%;">
    <table class="table">
        <tr>
            <th>项目id</th>
            <th>用户id</th>
            <th>用户名</th>
            <th>项目名称</th>
            <th>项目详情</th>
            <th>通过审核</th>
            <th>未通过审核</th>
        </tr>
        <#list demolist as demomsg>
            <tr>
                <#--this.demoid = demoid;-->
                <#--this.userid = userid;-->
                <#--this.username = username;-->
                <#--this.title = title;-->
                <#--this.demourl = demourl;-->

                <td>${demomsg.demoid}</td>
                <td>${demomsg.userid}</td>
                <td>${demomsg.username}</td>
                <td>${demomsg.title}</td>
                <td><a href="${demomsg.demourl}">查看项目详情</a></td>
                <td ><button class="btn btn-success pass_btn" id="${demomsg.demoid}" >通过审核</button></td>
                <td ><button class="btn btn-danger nopass_btn"  id="${demomsg.demoid}">审核不过</button></td>
            </tr>
        </#list>
    </table>
</div>

<script>
    $(document).ready(
        function () {
            $(".pass_btn").click(
                function () {
                    var demoid=$(this).attr("id");
                    data={demoid:demoid};
                    $.ajax({
                        type:"POST",
                        url:"passdemo.do",
                        data:data,
                        dataType:'json',
                        async: false,
                        success:function (data) {
                            if(data["data"]!==0)
                            {
                               alert("通过审核");
                               location.reload();
                            }
                        }

                    });
                }
            );

            $(".nopass_btn").click(
                    function () {
                        var demoid=$(this).attr("id");
                        data={demoid:demoid};
                        $.ajax({
                            type:"POST",
                            url:"nopassdemo.do",
                            data:data,
                            dataType:'json',
                            async: false,
                            success:function (data) {
                                if(data["data"]!==0)
                                {
                                    alert("审核不过");
                                    location.reload();
                                }
                            }

                        });
                    }
            );
        }
    );
</script>
</body>
</html>