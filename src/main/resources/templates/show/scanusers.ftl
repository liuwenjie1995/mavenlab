<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>树莓优秀作品选集</title>
    <link rel="stylesheet" type="text/css" href="/scanusers/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="/scanusers/css/demo.css">
    <link rel="stylesheet" href="/scanusers/css/style.css">

    <!--[if IE]>
    <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
    <![endif]-->
</head>
<body>

<div class="site-content">


    <h2 class="section-title">Demo 1</h2>
    <div class="project-list">

        <#list demolist as demo>
                    <div class="project" style="padding-top: 30px">
                        <div class="project__card">
                            <a href="" class="project__image"><img src="/scanusers/images/1.jpg" width=300 height=200 alt=""></a>
                            <div class="project__detail">
                                <h2 class="project__title"><a href="#">${demo.title}</a></h2>
                                <small class="project__category"><a href="${demo.demourl}">${demo.username}</a></small>
                            </div>
                        </div>
                    </div>
        </#list>

        <div class="project">
            <div class="project__card">
                <a href="" class="project__image"><img src="/scanusers/images/1.jpg" width=300 height=200 alt=""></a>
                <div class="project__detail">
                    <h2 class="project__title"><a href="#">Project Name</a></h2>
                    <small class="project__category"><a href="#">Photography</a></small>
                </div>
            </div>
        </div>

        <div class="project">
            <div class="project__card">
                <a href="" class="project__image"><img src="/scanusers/images/2.jpg" width=300 height=200 alt=""></a>
                <div class="project__detail">
                    <h2 class="project__title"><a href="#">Project Name</a></h2>
                    <small class="project__category"><a href="#">Photography</a></small>
                </div>
            </div>
        </div>

        <div class="project" style="padding-top: 30px;">
            <div class="project__card">
                <a href="" class="project__image"><img src="/scanusers/images/2.jpg" width=300 height=200 alt=""></a>
                <div class="project__detail">
                    <h2 class="project__title"><a href="#">Project Name</a></h2>
                    <small class="project__category"><a href="#">Photography</a></small>
                </div>
            </div>
        </div>

        <div class="project" style="padding-top: 30px">
            <div class="project__card" >
                <a href="" class="project__image" ><img src="/scanusers/images/2.jpg" width=300 height=200 alt=""></a>
                <div class="project__detail">
                    <h2 class="project__title"><a href="#">Project Name</a></h2>
                    <small class="project__category"><a href="#">Photography</a></small>
                </div>
            </div>
        </div>
    </div>


</div>

<script type="text/javascript" src="/scanusers/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="/scanusers/js/jquery.hover3d.js" ></script>
<script type="text/javascript">
    $(document).ready(function(){
        $(".project").hover3d({
            selector: ".project__card",
            shine: true,
        });

        $(".movie").hover3d({
            selector: ".movie__card",
            shine: true,
            sensitivity: 20,
        });
    });
</script>

</body>
</html>