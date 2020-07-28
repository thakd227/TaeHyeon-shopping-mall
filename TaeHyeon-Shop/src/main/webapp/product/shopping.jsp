<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<script type="text/javascript" src="../js/form.js"></script>
<section>
	<br>
	<br>

	<div align=center>
		<font size=5><b>상품 구매 하기 </b></font> <br>
		<br>
		<form name=f1 action="http://localhost:8081/k1/shoppingok.do"
			onSubmit="return ch1()" method="post">
			<table border=1 width=400>
				<tr>
					<td align=center colspan=2><img
						src="http://localhost:8081/k1/files2/${m.getPfile()}" width=350
						height=150 /></td>
				</tr>
				<tr>
					<td align=center>상품번호(자동발생)</td>
					<td><input type=text name=pcode size=10
						value='${m.getPcode()}'></td>
				</tr>
				<tr>
					<td align=center>상품이름</td>
					<td><input type=text name=pname size=40
						value='${m.getPname()}'></td>
				</tr>
				<tr>
					<td align=center>상품가격</td>
					<td><input type=text name=pcost size=20
						value='${m.getPcost()}'></td>
				</tr>
				<tr>
					<td align=center>상품개수</td>
					<td><input type=text name=quantity size=20></td>
				</tr>
				<tr>
					<td colspan=2 align=center><input type=submit value="상품구매">
			</table>
			<br>
			<br> <a href=http://localhost:8081/k1/product_list.do>[목록보기]</a>
		</form>
	</div>
</section>
<%@ include file="../footer.jsp"%>