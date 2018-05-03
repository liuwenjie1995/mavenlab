<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
<title>北京化工大学数字媒体艺术专业</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Football Club Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="/main/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="/main/css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="/main/css/font-awesome.css" rel="stylesheet"> <!-- font-awesome icons -->
<!-- //Custom Theme files -->  
<link rel="stylesheet" href="/main/css/owl.carousel.css" type="text/css" media="all">
	<link rel="stylesheet" href="/main/css/owl.theme.css" type="text/css" media="all">

<!-- web-fonts -->  
<!-- //web-fonts -->
</head>
<body> 
	<div id="head_bar" style="height: 45px;width: 100%;"  >
		<div style="display: inline-block;width: 5%;"><img src="/main/images/buct.jpg" height="40px" width="40px" ></div>
		<div style="display: inline-block;;width: 10%;"><p style="font-size: 20px;padding-top: 7px">北京化工大学</p></div>
		<div style="display: inline-block;width: 80%;text-align: right">
			<#if Session["username"]?exists>
			   ${ Session["username"]}
			</#if>
			<#if Session["username"]?exists>
				<a href="logout.do" class="btn btn-info">注销</a> </div>
			    <#else >
				<a href="/login" class="btn btn-info">登陆</a> </div>

			</#if>
	</div>
	<!-- banner -->
	<div class="w3ls-banner">
		<div class="w3lsbanner-info">
			<!-- header -->
			<div class="header">
				<div class="container">  
					<div class="header-mdl agileits-logo"><!-- header-two --> 
						<h1><a href="main.ftl">北京化工大学   数字媒体技术学院</a></h1>
					</div>
					<div class="header-nav"><!-- header-three --> 	
						<nav class="navbar navbar-default">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button> 
							</div>
							<!-- top-nav -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav cl-effect-16">
									<li><a href="main.ftl" class="active" data-hover="主页">主页</a></li>
									<li><a href="#major_news" data-hover="北化新闻">北化新闻</a></li> 
									<li><a href="#major_instuction" data-hover="专业介绍">专业介绍</a></li> 
									<li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">艺术作品 <span class="caret"></span></a>
										<ul class="dropdown-menu">
											<li><a href="/scanusers" data-hover="展示才华">优秀作品展示</a></li>
											<li><a href="/stuupload" data-hover="发挥特色">优秀作品上传</a></li>
											<li><a href="/judge" data-hover="发掘人才">作品审核</a></li>
										</ul>
									</li> 
									<li><a href=" data-hover="数媒论坛">数媒论坛</a></li>
								</ul>  
								<div class="clearfix"> </div>	
							</div>
						</nav>    
					</div>	
				</div>	
			</div>	
			<!-- //header --> 
			<!-- banner-text -->
			<div class="banner-text agileinfo"> 
				<div class="container">
					<div class="agileitsbnr-textinfo">  
						<h2>Digital Media Arts   </h2>
					
					</div>
					<!-- arrow bounce --> 
					
					<!-- //arrow bounce --> 
				</div>
			</div>
			<!-- //banner-text -->  
		</div>	
	</div>	
	<!-- //banner -->
		<!--about-->
	<div class="about" id="major_news">
		<div class="container">
			<div class="wthree_head_section">
				<h3 class="w3l_header">北化新闻</h3>
			</div>
			<div class="agileits-banner-grids text-center">
				<div class="banner-bottom-girds">
					<div class="col-md-6  col-sm-6 clr1 agileits-banner-grid" >
						<span class="fa fa-sun-o banner-icon" aria-hidden="true"></span>
						<h4>校园新闻</h4>
						<div style="text-align: left">
						<li style="color: aliceblue;font-size: 15px;margin-top: 10px">我校承办的第二届全国能源与环境科技学术会议在北京召开</li>
						<li style="color: aliceblue;font-size: 15px">我校召开2018年全面从严治党工作会</li>
						<li style="color: aliceblue;font-size: 15px">【视频新闻】《北化新闻》第23期</li>
						<li style="color: aliceblue;font-size: 5px"><a style="color: black">查看更多》》</a></li>
						</div>
						
					</div>
					<div class="col-md-6 col-sm-6 clr2 agileits-banner-grid">
						<span class="fa fa-arrows banner-icon" aria-hidden="true"></span>
						<h4>学院新闻</h4>
						<div style="text-align: left">
						<li style="color: aliceblue;font-size: 15px;margin-top: 10px">最新数媒的网站上线了！</li>
						<li style="color: aliceblue;font-size: 15px">数字媒体交流论坛介绍</li>
						<li style="color: aliceblue;font-size: 15px">优秀作品简介</li>
						<li style="color: aliceblue;font-size: 5px"><a>查看更多》》</a></li>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	<!--//about-->
	<!-- carrer -->
<div class="carrer">
	<div class="container">
		<div class="wthree_head_section" id="major_instuction">
				<h3 class="w3l_header ggg">学院介绍</h3>
				<p class="hhh"> </p>
			</div>
			<div class="carrer-top">
				<div class="col-md-4 carrer-left" style="margin-top: 20px">
				</div>
				<div class="col-md-8 carrer-right" >
					<p style="font-size: 17px;color:mintcream">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;数字媒体艺术专业隶属于北京化工大学信息科学与技术学院下的计算机系，该系具有较强的师资队伍，博士学位的教师占80%以上，
						特色研究方向包括动画制作、游戏开发、影视编辑、数字图像处理、智能系统工程、软件测试、计算机网络、信息安全与信息服
						务等，在行业内具有鲜明的特色和知名度。数字媒体艺术专业坚持国际化的视野，走科学与艺术与人文相融合的综合培养之路，
						培养德才兼备的数字媒体艺术人才。<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						    在人才培养方面不仅强调学生扎实的专业基础理论知识，而且注重学生的科学研究、工程实
						践和创新能力，多年来，学生在参加的各类大学生国际和国内学科竞赛中屡获突出成绩。与美国、加拿大、澳大利亚、日本、英
						国、法国等大学和研究机构建立了密切的教学和科研合作，实现了多种国际化人才培养模式，如联合培养、出国实习以及学生交
						换等。开设了多门由外国专家讲授的国际化课程，学生能够身临其境地感受研讨式教学的氛围，学习学科基础和前沿知识。
						<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						数字
						媒体艺术专业旨在培养具有良好的科学素养以及美术修养、既懂技术又懂艺术、能利用计算机新的媒体设计工具进行艺术作品的
						设计和创作的复合型应用设计人才。使学生能较好地掌握计算机科学与技术的基本理论、知识和技能，熟悉图形图像处理的基本
						算法，熟练使用各种数字媒体制作软件，掌握各类数字媒体设计、开发、制作、传输与处理的专业知识和技能，具有较好的美术
						素养和扎实的编程能力。学生毕业后，可在政府相关部门、企事业单位、科研院所以及专业设计公式从事平面设计、网络媒体制
						作、游戏和动画制作、数码影视编辑以及虚拟现实等领域的应用和研发等工作。</div>
					</p>
					</div>
			</diV>
	</div>
</div>
<!-- //carrer -->
	
<!-- welcome -->
	<div class="about-3">
				<h3 class="w3l_header"></h3>
	<!-- //welcome -->	
<!-- feedback -->
	<div class="feedback section-w3ls about-w3ls">
		<div class="feedback-agileinfo">
			<div class="container">
			<div class="wthree_head_section">
				<h3 class="w3l_header ggg">师资队伍</h3>
				<p class="hhh">数字媒体艺术专业隶属于北京化工大学信息科学与技术学院下的计算机系，该系具有较强的师资队伍，博士学位的教师占80%以上</p>
			</div>
				<div class="agileits-feedback-grids">
					<div id="owl-demo" class="owl-carousel owl-theme">
						<div class="item">
							<div class="feedback-info">
								<div class="feedback-top">
									<p> Sed semper leo metus, a lacinia eros semper at. Etiam sodales orci sit amet vehicula pellentesque. </p>
								</div>
								<div class="feedback-grids">
									<div class="feedback-img">
										<img src="/main/images/t1.jpg" alt="" />
									</div>
									<div class="feedback-img-info">
										<h5>蒋蕊</h5>
										<p>副教授</p>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="feedback-info">
								<div class="feedback-top">
									<p> Sed semper leo metus, a lacinia eros semper at. Etiam sodales orci sit amet vehicula pellentesque. </p>
								</div>
								<div class="feedback-grids">
									<div class="feedback-img">
										<img src="/main/images/t2.jpg" alt="" />
									</div>
									<div class="feedback-img-info">
										<h5>姜大光</h5>
										<p>副教授</p>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="feedback-info">
								<div class="feedback-top">
									<p> 清华大学博士，硕士研究生期间在美国进行CS学科交流访问。对AI领域在游戏中应用有独到见解。 </p>
								</div>
								<div class="feedback-grids">
									<div class="feedback-img">
										<img src="/main/images/t3.jpg" alt="" />
									</div>
									<div class="feedback-img-info">
										<h5><a href="http://www.deep517.cn/webapp/teacher/lrr/lrr.jsp">李瑞瑞</a></h5>
										<p>讲师</p>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="feedback-info">
								<div class="feedback-top">
									<p> Sed semper leo metus, a lacinia eros semper at. Etiam sodales orci sit amet vehicula pellentesque. </p>
								</div>
								<div class="feedback-grids">
									<div class="feedback-img">
										<img src="/main/images/t4.jpg" alt="" />
									</div>
									<div class="feedback-img-info">
										<h5>侯月</h5>
										<p>博士</p>
									</div>
									<div class="clearfix"> </div>
								</div>
							</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //feedback -->

<!-- pricing -->
	<div class="w3ls-section wthree-pricing">	
		<div class="container">
			<div class="wthree_head_section">
				<h3 class="w3l_header">产学研合作</h3>
				<p>可在政府相关部门、企事业单位、科研院所以及专业设计公司进行参观与学习。</p>
			</div>
			<div class="pricing-grids-info">
								<div class="pricing-grid grid-one">
									<div class="w3ls-top">
										<h3>公司1</h3> 
									</div>
									<div class="w3ls-bottom">
										<ul class="count">
											<li>公司简介</li>
										</ul>
										<h4> 200<span class="sup">+</span> </h4>
										<div class="more">
											<a href="">查看合作作品</a>
										</div>
									</div>
								</div>
								<div class="pricing-grid grid-two">
									<div class="w3ls-top">
										<h3>公司2</h3> 
									</div>
									<div class="w3ls-bottom">
										<ul class="count">
											<li>公司简介</li>
										</ul>
										<h4> 200<span class="sup">+</span> </h4>
										<div class="more">
											<a href="">查看合作作品</a>
										</div>
									</div>
								</div>
								<div class="pricing-grid grid-three">
									<div class="w3ls-top">
										<h3>公司3</h3> 
									</div>
									<div class="w3ls-bottom">
										<ul class="count">
											<li>公司简介</li>
										</ul>
										<h4>200<span class="sup">+</span> </h4>
										<div class="more">
											<a href="">查看合作作品</a>
										</div>
									</div>
								</div>
								<div class="zb pricing-grid grid-four">
									<div class="w3ls-top">
										<h3>公司4</h3> 
									</div>
									<div class="w3ls-bottom">
										<ul class="count">
											<li>公司简介</li>
										</ul>
										<h4>10<span class="sup">+</span> </h4>
										<div class="more">
											<a href="">查看合作作品</a>
										</div>
									</div>
								</div>
								<div class="clearfix"> </div> 
				<!--End-slider-script-->
			</div>
		</div>	
	</div>	
	<!--//pricing-->   	
		<!-- footer -->
	<div class="footer">
	<div class="container">
		<div class="f-bg-w3l">
		<div class="col-md-4 w3layouts_footer_grid">
					<h2>联系 <span>方式</span></h2>
					    <ul class="con_inner_text">
							<li><span class="fa fa-map-marker" aria-hidden="true"></span>北京市北三环东路15号, <label> 科技大厦614.</label></li>
							<li><span class="fa fa-envelope-o" aria-hidden="true"></span> <a href="http://www.deep517.cn/webapp/teacher/lrr/lrr.jsp">我的主页</a></li>
							<li><span class="fa fa-phone" aria-hidden="true"></span> +86 13263296798</li>
						</ul>

					<ul class="social_agileinfo">
						<li><a href="#" class="w3_facebook"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#" class="w3_twitter"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#" class="w3_instagram"><i class="fa fa-instagram"></i></a></li>
						<li><a href="#" class="w3_google"><i class="fa fa-google-plus"></i></a></li>
					</ul>
				</div>
				<div class="col-md-4 w3layouts_footer_grid">
					<h2>快速 <span>发送意见</span></h2>
					<p>通过下方的意见输入栏可以快速发送邮件给管理员</p>
					<form action="#" method="post">
						<input type="email" name="Email" placeholder="输入意见或您的邮箱" required="">
						<button class="btn1"><i class="fa fa-envelope-o" aria-hidden="true"></i></button>
						<div class="clearfix"> </div>
					</form>
				</div>
				<div class="col-md-4 w3layouts_footer_grid">
					<h3>查看 <span>最新作品</span></h3>
					  <ul class="con_inner_text midimg">
						<li><a href="#"><img src="/main/images/g5.jpg" alt="" class="img-responsive" /></a></li>
					    <li><a href="#"><img src="/main/images/g6.jpg" alt="" class="img-responsive" /></a></li>
						<li><a href="#"><img src="/main/images/g7.jpg" alt="" class="img-responsive" /></a></li>
						<li><a href="#"><img src="/main/images/g8.jpg" alt="" class="img-responsive" /></a></li>
						<li><a href="#"><img src="/main/images/g9.jpg" alt="" class="img-responsive" /></a></li>
					    <li><a href="#"><img src="/main/images/g10.jpg" alt="" class="img-responsive" /></a></li>
						 <li><a href="#"><img src="/main/images/g12.jpg" alt="" class="img-responsive" /></a></li>
						<li><a href="#"><img src="/main/images/g11.jpg" alt="" class="img-responsive" /></a></li>
				     </ul>
					
				</div>
				<div class="clearfix"> </div>
			</div>
			</div>
			<p class="copyright">© 2018 buct. All Rights Reserved | Design by <a href="http://www.buct.edu.cn" target="_blank">BUCT</a></p>
	</div>
	<!-- //footer -->
  
	<!-- js --> 
	<script src="/main/js/jquery-2.2.3.min.js"></script>
	<script src="/main/js/SmoothScroll.min.js"></script>
	<!-- //js --> 
	<!-- owl carousel -->
	<script src="/main/js/owl.carousel.js"></script>
	<script>
		$(document).ready(function () {
			$("#owl-demo").owlCarousel({

				autoPlay: 3000, //Set AutoPlay to 3 seconds
				autoPlay: true,
				items: 3,
				itemsDesktop: [991, 2],
				itemsDesktopSmall: [414, 4]

			});
		}); 
	</script>
	<!-- //owl carousel -->
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="/main/js/move-top.js"></script>
	<script type="text/javascript" src="/main/js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
			
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!-- //end-smooth-scrolling -->	
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->  
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/main/js/bootstrap.js"></script>
</body>
</html>