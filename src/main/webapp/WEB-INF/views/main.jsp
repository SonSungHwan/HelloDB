<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page session="false" %>
<html>
<head>

	<title>Home</title>
</head>
<body>

<ul>
<h2><a href="${pageContext.request.contextPath}/totalPoint">학기별 이수 학점 조회</a></h2>
<h2><a href="${pageContext.request.contextPath}/totalPointInfo">이수 구분별 학점 조회</a></h2>
<h2><a href="${pageContext.request.contextPath}/enrollSubject">수강 신청하기</a></h2>
<h2><a href="${pageContext.request.contextPath}/enrollComplete">수강 신청 조회 메뉴</a></h2>
</ul>
</body>
</html>
