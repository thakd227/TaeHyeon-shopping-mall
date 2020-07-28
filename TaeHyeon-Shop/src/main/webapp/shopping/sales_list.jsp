<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>
<section>
	<br>
	<br> <br>
	<div align="center">
		<font size=5><b>월별 매출 조회</b></font>
		<form action=sales_list.do>
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp; 조회년월 (2020-01)<input type=text name=yymm>
			<input type=submit value="조회">
		</form>
		<br>

		<form action=sales_list.do>
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp; 기간조회(2020-01-01)<input type=text name=yymm1>
			~ <input type=text name=yymm2> <input type=submit
				value="조회">
		</form>
		<table border=1 width=800 height=400>
			<tr align=center>
				<td>날짜</td>
				<td>상품코드</td>
				<td>매출금액</td>
				<td>매출누계</td>
			</tr>

			<c:forEach items="${salesList}" var="m">

				<tr align=center>
					<td><fmt:formatDate value="${m.getSdate()}"
							pattern="yyyy년 MM월 dd일" /></td>
					<td>${m.getPcode()}</td>
					<td>￦<fmt:formatNumber value="${m.getPrice() }"
							pattern="#,###.##" /></td>
					<td>￦<fmt:formatNumber value="${s=s+m.getPrice()}"
							pattern="#,###.##" /></td>
				</tr>
			</c:forEach>
	
		</table>
			</div>
</section>

<%@ include file="../footer.jsp"%>