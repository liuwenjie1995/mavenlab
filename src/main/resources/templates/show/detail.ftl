<html>
    <head>
        <title>显示详情</title>
        <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
        <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.css">
        <script src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    </head>
    <body class="container-fluid">
    <div id="Hover" class="col-lg-10 col-lg-offset-1" style="height: 100%;background-color: #c7ddef">
        <div>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label for="firstname" class="col-sm-2 control-label">标题</label>
                    <div class="col-sm-10">
                        <input type="text"   class="form-control"  value="${demo.title}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">副标题</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"  value="${demo.subtitle}">
                    </div>
                </div>

                <div class="form-group">
                    <label for="lastname" class="col-sm-2 control-label">介绍</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"  value="${demo.instruction}">
                    </div>
                </div>
            </form>
            
            <div class="col-lg-10 col-lg-offset-1">
                <img src="${demo.img1}" class="col-lg-2 col-lg-offset-1"/>
                <img src="${demo.img2}" class="col-lg-2"/>
                <img src="${demo.img3}" class="col-lg-2"/>
                <img src="${demo.img4}" class="col-lg-2"/>
            </div>

            <div class="col-lg-10 col-lg-offset-1">
                <a href="/download.do?filepath=${demo.filepath}" class="btn btn-info">文件下载</a>
            </div>
        </div>

    </div>

    </body>
</html>