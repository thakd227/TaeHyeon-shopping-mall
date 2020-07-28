<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<script type="text/javascript" src="../js/form.js"></script>
<section>
	<div align="center">
		<br>
		<br>
		<br> <font size=5>회원 로그인</font>
		<form name=f1 action="http://localhost:8081/k1/Login.do" >
			<table border=1 width=300 height=150 align="center">
				<tr>
					<td class=td_center>&nbsp;아이디</td>
					<td><input type=text name=custno size=15></td>
				</tr>
				<tr>
					<td class=td_center>&nbsp;암호</td>
					<td><input type=text name=password size=15></td>
				</tr>
				<tr>
					<td align="center" colspan=2>&nbsp;<input type=submit
						value=" 로그인"> &emsp;
					</td>
				</tr>
			</table>
		</form>
	</div>
</section>
<%@ include file="../footer.jsp"%>