<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="today" />
<script type="text/javascript" src="../js/form.js"></script>
<section>
	<br> <br>
	<div align=center>
		<font size=5><b> 쇼핑몰 회원 등록 </b></font> <br> <br>
		<form name=f1 action="http://localhost:8081/k1/insertMember.do"
			onSubmit="return ch1()" method=post enctype="multipart/form-data"
			method="post">
			<table border=1 width=500>
				<tr>
					<td align=center>회원번호</td>
					<td><input type=text name=custno size=10></td>
				</tr>
				<tr>
					<td align=center>회원성명</td>
					<td><input type=text name=custname size=10></td>
				</tr>
				<tr>
					<td align=center>비밀번호</td>
					<td><input type=password name=password size=10></td>
				</tr>
				<tr>
					<td align=center>회원전화</td>
					<td><input type=text name=phone size=20></td>
				</tr>
				<tr>
					<td align=center>회원주소</td>
					<td><input type=text name=address size=40></td>
				</tr>
				<tr>
					<td align=center>가입일자</td>
					<td><input type=text name=joindate size=10 value='${today}'></td>
				</tr>
				<tr>
					<td align=center>고객등급[A:VIP,B:일반,C:직원]</td>
					<td><input type=text name=grade size=10></td>
				</tr>
				<tr>
					<td align=center>도시코드</td>
					<td><input type=text name=city size=10></td>
				</tr>
				<tr>
					<td align=center>사진추가</td>
					<td><input type="file" name="uploadfile" /></td>
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