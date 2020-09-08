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
		// 0. 요청 인코딩 설정
		request.setCharacterEncoding("euc-kr");
	
		// 1. 요청에서 보낸 id / pw 확인
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MethodContainer2 mc2 = new MethodContainer2();
		boolean result = mc2.login(id,pw);
		
		if(result){
	%>
			<div>로그인 성공</div>
	<%
		}else{
	%>
			<div>로그인 실패</div>
	<%
		}
	%>
	
</body>
</html>