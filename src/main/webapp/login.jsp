<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Demo</title>
        <style>
            li{
                list-style: none;
            }
        </style>
    </head>
    <body>
        <div style="margin:10% 0px 0px 40%; border:2px solid black; width:300px">
            <form action="login.do" method="post">
                <ul>
                    <li></li>
                    <li><h2>Login Demo</h2></li>
                </ul>
                <ul>
                    <li>User Name : </li>
                    <li><input type="text" name="username" required="true" placeholder="user" size="30"/></li>
                </ul>
                <ul>
                    <li>Password : </li>
                    <li><input type="password" name="password"  required="true" placeholder="password" size="30"/></li>
                </ul>
                <ul>
                    <li></li>
                    <li><input type="submit" name="Login"  value="LOGIN"/></li>
                </ul>
            </form>
            
            <form action="logout.do" method="post">
                <ul>
                    <li></li>
                    <li><input type="submit" name="Logout"  value="LOGOUT"/></li>
                </ul>
            </form>
            
        </div>
    </body>
</html>