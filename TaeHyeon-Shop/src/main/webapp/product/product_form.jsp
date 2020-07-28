<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="today" />

<script type="text/javascript" src="../js/form.js"></script>
<section>
	<br>
	<br>
	<div align=center>
		<font size=5><b>상품 등록 하기 </b></font> <br>
		<br>
		<form name=f1 action="http://localhost:8081/k1/productinsert.do"
			onSubmit="return ch1()" method=post enctype="multipart/form-data">
			<table border=1 width=500>
				<tr>
					<td align=center>상품번호</td>
					<td><input type=text name=pcode size=10
						value='${m.pcode}'></td>
				</tr>
				<tr>
					<td align=center>상품이름</td>
					<td><input type=text name=pname size=40></td>
				</tr>
				<tr>
					<td align=center>상품가격</td>
					<td><input type=text name=pcost size=20></td>
				</tr>
				<tr>
					<td align=center>상품수량</td>
					<td><input type=text name=quantity size=20></td>
				</tr>
				<tr>
					<td align=center>상품등록일</td>
					<td><input type=text name=pdateS size=10 value="${today}"></td>
				</tr>
				<tr>
					<td align=center>상품특징</td>
					<td><textarea name=petc rows=6 cols=50></textarea></td>
				</tr>
				<tr>
					<td align=center>상품사진</td>
					<td><input type="file" name="pfilename" /></td>
				</tr>
				<tr>
					<td colspan=2 align=center><input type=submit value="등록">
						<input type=button value="조회" onClick="Search()"></td>
				</tr>
			</table>
		</form>
	</div>
</section>
<%@ include file="../footer.jsp"%>