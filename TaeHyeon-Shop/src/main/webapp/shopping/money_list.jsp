<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<section>
	<br> <br> <br>
	<div align="center">
		<font size=5><b> 회원 매출 조회</b></font>
		<table border=1 width=800 height=250>
			<tr align=center>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>고객등급</td>
				<td>매출</td>
				<td>매출누계</td>
			</tr>


			<c:forEach items="${moneyList}" var="m">


				<c:choose>
					<c:when test="${m.price gt 1000000 }">
						<c:set var="grade" value="VVIP"></c:set>
					</c:when>
					<c:when test="${m.price ge 700000 }">
						<c:set var="grade" value="VIP"></c:set>
					</c:when>
					<c:when test="${m.price le 500000 }">
						<c:set var="grade" value="일반"></c:set>
					</c:when>
				</c:choose>


				<tr align=center>
					<td>${m.getCustno()}</td>
					<td>${m.getCustname()}</td>
					<td>${grade}</td>
					<td>￦<fmt:formatNumber value="${m.getPrice()}"
							pattern="#,###.##원" /></td>
					<td>￦<fmt:formatNumber value="${s=s+m.price}"
							pattern="#,###.##원"></fmt:formatNumber>
					</td>
				</tr>
			</c:forEach>

		</table>
	</div>
</section>

<%@ include file="../footer.jsp"%>