<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<section>
	<br>
	<div align=center>
		<font size=5><b> 회원목록조회/수정</b></font>
		<table border=1 width=800 height=600>
			<tr>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>전화번호</td>
				<td>주소</td>
				<td>가입일자</td>
				<td>고객등급</td>
				<td>거주지역</td>
			</tr>


			<c:forEach items="${boardList}" var="m">
				<tr>
					<td><a href=editMember.do?custno=${m.getCustno()}>${m.getCustno() }</a></td>
					<td><a href=deleteMember.do?custno=${m.getCustno()}>${m.getCustname()}</a>(
						<img src="http://localhost:8081/k1/files/${m.getPfile()}"
						width=100 height=60 /> )</td>
					<td>${m.getPhone()}</td>
					<td>${m.getAddress() }</td>
					<td>${m.getJoindate().substring(0,10)}</td>
					<td>${m.getGrade() }</td>
					<td>${m.getCity()}</td>
				</tr>

			</c:forEach>

		</table>

		<form action=member_list.do>
			<select name=ch1>
				<option value=custname>이름</option>
				<option value=address>주소</option>
			</select> <input type=text name=ch2> <input type=submit value="검색">
		</form>

	</div>
</section>
<%@ include file="../footer.jsp"%>
</body>
</html>