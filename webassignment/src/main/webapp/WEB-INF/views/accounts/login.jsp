<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>
<title>Register</title>
</head>
<body>
	<div class="span4">
					<div class="well">
						<h5>Login</h5>
						<form:form action="login" method="post" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputUsername">Username</label>
								<div class="controls">
									<form:input type="text" path="username" class="span3"
										placeholder="Username" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputPassword">Password</label>
								<div class="controls">
									<form:input type="password" path="password" class="span3"
										placeholder="Password" />
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<button type="submit" class="defaultBtn">Sign in</button>
									<a href="#">Forget password?</a>
								</div>
							</div>
						</form:form>
					</div>
				</div>
</body>
