<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "ao.MethodContainer2" %>
<%@ page import = "vo.Student" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>studentList</title>
</head>
<body>
	<%
		MethodContainer2 mc = new MethodContainer2();
		ArrayList<Student> list = mc.getStudentList();
	%>
	<h1>7강의실 학생 목록</h1>
	<table border = "1">
		<thead>
			<tr>
				<td>이름</td>
				<td>성별</td>
				<td>나이</td>
			</tr>
		</thead>
		<tbody>
			<%
				for(Student s : list){
			%>
					<tr>
						<td><%=s.name %></td>
						<td><%=s.gender %></td>
						<td><%=s.age %></td>
					</tr>
			<%	
				}
			%>
		</tbody>
	</table>
</body>
</html>