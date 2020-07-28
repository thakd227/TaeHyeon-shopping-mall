<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header {
	background-color: #87CEEB;
	text-align: center;
	height: 45px;
	font-size: 18px;
	color: #000000;
	line-height: 45px;
	vertical-align: middle;
}

nav {
	background-color: #6699ff;
	height: 30px;
	font-size: 12px;
	color: #ffffff;
	line-height: 30px;
}

section {
	background-color: #FFFFFF;
	height: 680px;
	font-size: 12px;
}

footer {
	background-color: #87CEEB;
	text-align: center;
	height: 35px;
	font-size: 20px;
	color: #000000;
	line-height: 35px;
}

a:link {
	text-decoration: none;
}

a:visited {
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
	color: #fff
}

a:active {
	text-decoration: underline
}
</style>
</head>
<body>
	<header>
		<h2>쇼핑몰 회원관리</h2>
	</header>

	<nav>
	
		
				<c:if test="${ not empty  sessionScope.user}">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		[ <a href="http://localhost:8081/k1/editMember.do?custno=${user.custno}">정보수정</a>&nbsp;&nbsp;|
</c:if>


		<c:if test="${ empty  sessionScope}">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		[ <a href="http://localhost:8081/k1/shopping/form.jsp">회원등록</a>&nbsp;&nbsp;|
</c:if>

		<c:choose>
			<c:when test="${admin == 'admin' }">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="http://localhost:8081/k1/member_list.do">회원목록조회/수정</a>&nbsp;&nbsp; |
</c:when>

		</c:choose>
		<c:if test="${admin == 'admin'}">
&nbsp;&nbsp;&nbsp;<a href=http://localhost:8081/k1/moneyselectAll.do>회원매출</a> ]
&nbsp;&nbsp;&nbsp;[<a href=http://localhost:8081/k1/product_form.do>상품등록</a>&nbsp;&nbsp; |
</c:if>

		&nbsp;&nbsp;&nbsp;<a href=http://localhost:8081/k1/product_list.do>상품목록</a>&nbsp;&nbsp;
		| &nbsp;&nbsp;&nbsp;<a href=http://localhost:8081/k1/product_list12.do>상품TOP12</a>
		]

		<c:if test="${empty  sessionScope}">
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 [<a href=http://localhost:8081/k1/login/login.jsp>로그인</a>]
</c:if>

		<c:if test="${not empty  sessionScope.user }">
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
 [<a href=http://localhost:8081/k1/logout.do>로그아웃</a>]
</c:if>

		&emsp;&emsp;[<a href=http://localhost:8081/k1/index.jsp>홈으로 </a>]
		<c:if test="${admin == 'admin' }">
&nbsp;&nbsp;&nbsp;<a href=http://localhost:8081/k1/sales_list.do>[월별
				매출관리]</a>&nbsp;&nbsp; 
</c:if>

	</nav>