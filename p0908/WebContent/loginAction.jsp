<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "ao.MethodContainer2" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		// 0. ��û ���ڵ� ����
		request.setCharacterEncoding("euc-kr");
	
		// 1. ��û���� ���� id / pw Ȯ��
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MethodContainer2 mc2 = new MethodContainer2();
		boolean result = mc2.login(id,pw);
		
		if(result){
	%>
			<div>�α��� ����</div>
	<%
		}else{
	%>
			<div>�α��� ����</div>
	<%
		}
	%>
	
</body>
</html>