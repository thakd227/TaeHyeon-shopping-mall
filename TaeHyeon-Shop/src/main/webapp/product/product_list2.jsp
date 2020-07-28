<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<section>
	<br>
	<div align=center>
		<font size=5><b> 우수상품 TOP 12 </b></font>

		<table border=1>
			<tr>
				<c:forEach items="${productList}" var="m" varStatus="status">
					<td><a href=http://localhost:8081/k1/shopping.do?pcode=${m.getPcode()}><img src="http://localhost:8081/k1/files2/${m.getPfile()}"
						width=150 height=70 /><br> ${m.getPcode()  }</a><br>
						${m.getPname()} 조회수 : ${ p2.getCnt() }</td>
					<c:if test="${ (status.count % 4) == 0}">
						<tr>
					</c:if>
				</c:forEach>
			</tr>
		</table>


	</div>
</section>
<%@ include file="../footer.jsp"%>
</body>
</html>