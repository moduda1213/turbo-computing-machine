<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>loginForm</title>
</head>
<body>
	<h1>�α��� ��</h1>
	<form method = "post" action="./loginAction.jsp">
		<table border = "1">
			<tr>
				<td>ID</td>
				<td><input type = "text" name = "id"></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type = "text" name = "pw"></td>
			</tr>
			<tr>
				<td colspan = "2"><button type = "submit">�α���</button></td>
				<td></td>
			</tr>
		</table>
	</form>
	
</body>
</html>