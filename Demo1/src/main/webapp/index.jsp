<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆页面</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
</head>
<body>
    <div id="poster">
        <div id="bigBox">
            <h1>LOGIN</h1>
            <div class="inputBox">
                <form action="/Demo1/loginServlet" method="post">
                    <div id="errorMsg">${login_msg}</div>
                    <div class="inputText">
                        <i class="fa fa-user-circle" style="color: whitesmoke;"></i>
                        <input type="text" placeholder="用户名" id="username" name="username"/>
                    </div>
                    <div class="inputText">
                        <i class="fa fa-key" style="color: whitesmoke;"></i>
                        <input type="password" placeholder="密码" id="password" name="password"/>
            </div>
                    <input type="submit" class="inputButton" value="LOGIN" />
                </form>
            </div>
        </div>
    </div>
</body>
</html>
