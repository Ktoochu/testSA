<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page contentType="text/html; charset=EUC-KR" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="assets/css/boardStyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խñ�</title>
</head>
<body>
<div id="s_left"></div>
<div id="contents">
	<center><h1>�Խñ�</h1></center>
	<input name="seq" type="hidden" value="">
	<hr>
	[���Ӹ�] ����<br/>
	�ۼ���<br/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange">����</td>
			<td align="left"><textarea name="content" cols="100" rows="20">
			����</textarea></td>
		</tr>
	</table>
	<hr>
	��� ��:*��<br/>
	��� ����Ʈ<br/>
	<form action="" method="post">
	<textarea name="textarea" cols="105" rows="5" placeholder="����� ���ܺ�����"></textarea><br/>
	<input type="submit" align="right" value="���"><br/>
	</form>
	<hr/>
	<center>
		<a href="insertBoard">�� ���</a>&nbsp;&nbsp;&nbsp;
		<a href="">�� ����</a>&nbsp;&nbsp;&nbsp;
		<a href="BoardList">�� ���</a>
	</center>
</div>
<div id="s_right"></div>

</body>
</html>