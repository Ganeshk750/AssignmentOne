
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignementOne</title>
</head>
<body bgcolor="sky blue">
	<fieldset>
		<legend>
			<B>Login Example ...</B>
		</legend>
		<BR>
		<p style="color: red">${msg}</p></br>
		

		<h2>Login</h2>
		<form action="login.do" method="post">
			<table>
				<tr>
					<td><B>Email id :</B></td>
					<td><input type="email" name="email" placeholder="Enter valid email-id" required="required"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>Password : </B></td>
					<td><input type="password" name="pass" placeholder="Enter valid Password"  required="required"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset" />
					<td><input type="submit" value="Login" /></td>
				</tr>
				<tr>
					<td>
						<p>
							<a href="Forgotten.jsp">Forgotten Password?</a>
						</p>
					<td>
						<p>
							<a href="Registation.jsp">Register</a>
						</p>
					</td>
				</tr>


			</table>
		</form>

	</fieldset>


</body>
</html>