<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"  href="assets/css/registStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>��� ȸ������</title>
</head>
<body>
<div id="registForm">
	<div id="logo"> <h1>ȸ������</h1> </div>
	<center>
	<form action="Login.jsp" method="post" name="frm">
		<table>
			<tr>
				<td width="100">
				<font color="blue">���̵�</font>
				</td>
				<td width="100" size="50">
				<input type="text" name="id">
				<input type="button" value="�ߺ�Ȯ��" onclick="isDuplicatedId()"><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">��й�ȣ</font>
				</td>
				<td width="100">
				<input type="password" size="50" name="password"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">��й�ȣ����</font>
				</td>
				<td width="100">
				<input type="password" size="50" name="repassword"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">�̸�</font>
				</td>
				<td width="100">
				<input type="text" size="50" name="name"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">�̸���</font>
				</td>
				<td>
				<input type="text" size="30" name="emailHead"/>
				<select name="emailTail">
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>                        
				</select>
				<br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">��ȭ��ȣ</font>
				</td>
				<td>
				<input type="text" placeholder="000-0000-0000" size="50" maxlength="13" name="tel"/>
				<br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">�ּ�</font>
				</td>
				<td>
				<input type="text" size="40" name="addr"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">����� ��� ��ȣ</font>
				</td>
				<td>
				<input type="text" size="40" name="brn"/><br/>
				</td>
			</tr>
		</table>
		
		<div id="btn">
			<input type="button" value="ȸ������">
			<input type="reset" name="cancel" value="�ٽ� ����">
			<button type="button" onclick="location.href='select'">���</button><br/>
		</div>
	</form>
	</center>
</div>
</body>
</html>