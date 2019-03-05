<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignementOne</title>
</head>
<body bgcolor="sky blue">
	<fieldset>
		<legend>
			<B>Form Example ...</B>
		</legend>
		<BR>

		<h2>Registation</h2>
		<form action="Registation.do" method="post">
			<table>
				<tr>
					<td><B>My Name is :</B></td>
					<td><input type="text" name="myName" placeholder="Enter Name"
						pattern="[A-Z]{1}[a-z\s]{2,}[A-Z]{1}[a-z\s]{2,}[A-Z]{0,}[a-z\s]{2,}"
						required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Email is :</B></td>
					<td><input type="text" name="email"
						placeholder="Enter Email Id" required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Password is : </B></td>
					<td><input type="password" name="pass"
						placeholder="Enter Password" required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Number is :</B></td>
					<td><input type="text" name="phNm"
						placeholder="Enter Phone Number" pattern="[6-9]{1}[0-9]{9}"
						required="required" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Gender is : </B></td>
					<td><input type="radio" name="gender" value="male"
						required="required" />Male <BR> <input type="radio"
						name="gender" value="female" required="required" />Female</BR> <input
						type="radio" name="gender" value="others" required="required" />Others
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>

				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>I know :</B></td>
					<td><input type="checkbox" name="knows" value="Hnd">Hindi
						<BR> <input type="checkbox" name="knows" value="Eng">English
						<BR> <input type="checkbox" name="knows" value="kannara">Kannara
						<BR> <input type="checkbox" name="knows" value="Tamil">Tamial
						<BR> <input type="checkbox" name="knows" value="others">Others

					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>


				</tr>
				<tr>
					<td><B>Remember username? </B></td>
					<td><input type="checkbox" name="remember" value="yes"
						></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><input type="reset" value="Reset Form" /></td>
					<td><input type="submit" value="Register" /></td>
			</table>




		</form>
	</fieldset>
</body>

</html>