<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<section>
	<br>
	<div align=center>
		<font size=5><b> 상품목록조회/수정</b></font> <br> 1:페이지사이즈:
		${c.page_size} &emsp; 2: 페이지List Size: ${c.page_list_size } &emsp; 3:
		총레코드 수 :${c.tc } &emsp; 4.현재레코드: ${c.now_record } &emsp; <br> 5.
		총페이지수: ${c.pagetotal } &emsp; 6.현재페이지:${c.now_page } &emsp; 7. 하단 가로
		시작페이지: ${c.start_page } &emsp; 8. 하단 가로 마지막페이지: ${c.end_page } &emsp;


		<table border=1 width=700 height=250>
			<tr>
				<td>rownum</td>
				<td>rnum</td>
				<td>pcode</td>
				<td>pname</td>
				<td>pcost</td>
				<td>pdate</td>
				<td>Quantity</td>
			</tr>

			<c:forEach items="${productList}" var="m">
				<tr>
					<td>${ m.rownum }</td>
					<td>${ m.rnum }</td>
					<td><a href=shopping.do?pcode=${m.getPcode()}>${m.getPcode()  }</a></td>
					<td>${m.getPname()}</td>
					<td>${m.getPcost()}</td>

					<td><fmt:formatDate value="${m.getPdate()}"
							pattern="yyyy년MM월dd일" /></td>


					<td>${m.getQuantity()}</td>


				</tr>
			</c:forEach>

		</table>

		<!--  이전 10 페이지  -->

		<c:if test="${c.start_page > c.page_list_size}">
			<c:set var="now_record"
				value="${ ( c.start_page - 2 ) * c.page_size + 1 }" />
			<c:url value="/product_list.do" var="url">
				<c:param name="now_record" value="${now_record}" />
			</c:url>
			<a href="${url}"> 이전(10페이지)</a>
			&emsp;&emsp;
		</c:if>

		<c:if test="${c.start_page <= c.page_list_size}">
    이전(10페이지) &emsp; &emsp;
</c:if>


		<!--  가운데 숫자 부분 -->

		<c:forEach var="i" begin="${c.start_page}" end="${ c.end_page }"
			step="1">
			<c:set var="now_record" value="${ (i-1) * c.page_size + 1 }" />
			<c:if test="${ i <= c.pagetotal }">

				<c:url value="/product_list.do" var="url">
					<c:param name="now_record" value="${now_record}" />

				</c:url>

				<a href="${url}"> [${i}]</a>
			</c:if>
		</c:forEach>

		<!--  다음 10 페이지  -->
		&emsp;&emsp;
		<c:if test="${c.end_page < c.pagetotal }">
			<c:set var="now_record" value="${(c.end_page*c.page_size)+1}" />
			<c:url value="/product_list.do" var="url">
				<c:param name="now_record" value="${now_record}" />
			</c:url>

			<a href="${url}"> 다음(10페이지) </a>
		</c:if>

		<c:if test="${c.end_page >= c.pagetotal }">
   다음(10페이지)
 </c:if>



	</div>
</section>
<%@ include file="../footer.jsp"%>
</body>
</html>