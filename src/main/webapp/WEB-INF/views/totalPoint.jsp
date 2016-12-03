<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<table class="table">
		<tr>
			<th>년도</th><th>학기</th><th>이수학점</th><th>상세보기</th>
		</tr>
		<tr>
			<td>2012년</td><td>1학기</td><td>&nbsp;&nbsp;&nbsp;16</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2012&semester=1">링크</a></td>
		</tr>
		<tr>
			<td>2012년</td><td>2학기</td><td>&nbsp;&nbsp;&nbsp;23</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2012&semester=2">링크</a></td>
		</tr>
		<tr>
			<td>2015년</td><td>1학기</td><td>&nbsp;&nbsp;&nbsp;20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2015&semester=1">링크</a></td>
		</tr>
		<tr>
			<td>2015년</td><td>2학기</td><td>&nbsp;&nbsp;&nbsp;17</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2015&semester=2">링크</a></td>
		</tr>
		<tr>
			<td>2016년</td><td>1학기</td><td>&nbsp;&nbsp;&nbsp;20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2016&semester=1">링크</a></td>
		</tr>
		<tr>
			<td>2016년</td><td>2학기</td><td>&nbsp;&nbsp;&nbsp;20</td><td><a href="${pageContext.request.contextPath}/inquiry?year=2016&semester=2">링크</a></td>
		</tr>
	</table>
	
	<h3><a href="${pageContext.request.contextPath}">메인</a></h3>
</body>
</html>