<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
			${msg}
				<form action="login" method="post">
					<div class="form-group row">
						<label for="staticEmail" class="col-sm-2 col-form-label">用户名</label>
						<div class="col-sm-10">
							<input type="text"  class="form-control"placeholder="用户名"
								id="name" value="${uname}" name="name">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPassword" class="col-sm-2 col-form-label">密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="pass"
								placeholder="Password" name="password">
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>

<script src="static/jquery-3.3.1.slim.min.js" ></script>
<script src="static/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="static/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</html>