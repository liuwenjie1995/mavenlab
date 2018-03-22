<html>
<head>
    <title>恭喜你，登陆成功</title>
</head>
<body>
<h1>Welcome John Doe!</h1>
<p>                <#if Session.welcomeuser?exists>

    ${Session.welcomeuser}

</#if></p>
</body>
</html>