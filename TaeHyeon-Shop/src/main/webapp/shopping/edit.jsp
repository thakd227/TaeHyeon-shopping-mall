<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<script type="text/javascript" src="../js/form.js"></script>
<script>
	function Search() {
		location.href = 'http://localhost:8081/k1/member_list.do';
	}
</script>
<section>
	<br> <br>
	<div align=center>
		<font size=5><b> 쇼핑몰 회원 정보수정 </b></font> <br> <br>
		<form name=f1 action="http://localhost:8081/k1/editokMember.do"
			onSubmit="return ch1()" method=post enctype="multipart/form-data">
			<table border=1 width=600>
				<tr>
					<td align=center>회원번호</td>
					<td><input type=text name=custno value="${m.getCustno()}"
						size=10 readonly></td>
					<td rowspan=9><img
						src="http://localhost:8081/k1/files/${m.getPfile()}" width=200
						height=300 /></td>
				</tr>
				<tr>
					<td align=center>회원성명</td>
					<td><input type=text name=custname size=10
						value="${m.getCustname()}"></td>
				</tr>
				<tr>
					<td align=center>비밀번호</td>
					<td><input type=text name=password size=10
						value="${m.getPassword()}"></td>
				</tr>
				<tr>
					<td align=center>회원전화</td>
					<td><input type=text name=phone size=20
						value="${m.getPhone()}"></td>
				</tr>
				<tr>
					<td align=center>회원주소</td>
					<td><input type=text name=address size=40
						value="${m.getAddress() }"></td>
				</tr>
				<tr>
					<td align=center>가입일자</td>
					<td><input type=text name=joindate
						value="${m.getJoindate().substring(0, 10) }" size=10 readonly></td>
				</tr>
				<tr>
					<td align=center>고객등급[A:VIP,B:일반,C:직원]</td>
					<td><input type=text name=grade size=10 value=${m.getGrade() }></td>
				</tr>
				<tr>
					<td align=center>도시코드</td>
					<td><input type=text name=city size=10 value=${m.getCity() }>
					</td>
				</tr>
				<tr>
					<td align=center>사진수정</td>
					<td><input type="file" name="uploadfile" /></td>
				</tr>
				<tr>
					<td colspan=2 align=center><input type=submit value="수정">
						<input type=button value="목록보기" onClick="Search()"></td>
				</tr>
			</table>
		</form>
	</div>
</section>
<%@ include file="../footer.jsp"%>