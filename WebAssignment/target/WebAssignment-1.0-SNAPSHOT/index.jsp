<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/login.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <p class="header">Mobile Store</p>
        <div class="login-form">
            <p class="login-title">Please sign in</p>
            <form class="login-container">
                <input type="text" class="username" name="username" placeholder="User Name"/>
                <input type="password" class="password" name="password" placeholder="Password"/>
                <button class="login-submit btn" value="login" name="login-submit">Login</button>
            </form>
        </div>
    </body>
</html>
