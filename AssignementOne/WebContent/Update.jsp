
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignementOne</title>
</head>
<body bgcolor="sky blue">
	<fieldset>
		<legend>
			<B>Update your mobile number ...</B>
		</legend>
		<BR>
		<p style="color: red">${msg}</p>
		</br>

		<h2>Update PhoneNumber</h2>
		<form action="update.do" method="post">
			<table>
				<tr>
					<td><B>Email id :</B></td>
					<td><input type="email" name="email"
						placeholder="Enter Email Id" required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>New PhoneNo : </B></td>
					<td><input type="text" name="phNm" pattern="[6-9]{1}[0-9]{9}"
						placeholder="Enter your mobile number" required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset" />
					<td><input type="submit" value="Update" />
				</tr>
			</table>

		</form>
	</fieldset>
</body>
</html>