
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignementOne</title>
</head>
<body bgcolor="sky blue">
 <fieldset>
			<legend>
				<B>UpdateProfile Example ...</B>
			</legend>
			<BR>
			
<h2>UpdateProfile</h2>
      <form action="Landing.jsp" method="post">
    <table>
				<tr>
					<td><B>My Name is :</B></td>
					<td><input type="text" name="myName" value="${rdto.myName}" placeholder="Enter Name" recquired /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Email is :</B></td>
					<td><input type="text" name="email" value="${rdto.email}"  placeholder="Enter Email Id" recquired /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Password is : </B></td>
					<td><input type="password" name="pass" value="${rdto.pass}"  placeholder="Enter Password" recquired/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><B>My Number is :</B></td>
					<td><input type="text" name="phNm" value="${rdto.phNm}"  placeholder="Enter Phone Number" recquired/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				
				
				<tr>
					<td><B>My Gender is : </B></td>
					<td><input type="radio" name="gender" value="male" ${rdto.gender =='male'?'checked':''} />Male <BR>
						<input type="radio" name="gender" value="female" ${rdto.gender =='female'?'checked':''}/>Female</BR>
						<input type="radio" name="gender" value="others" ${rdto.gender =='others'?'checked':''}/>Others </td>
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
					<td><input type="checkbox" name="knows" value="Hnd"  ${rdto.knows=='Hnd'?'checked':''}/>Hindi
					     <BR> <input type="checkbox" name="knows" value="Eng" ${rdto.knows=='Eng'?'checked':''}/>English
					     <BR> <input type="checkbox" name="knows" value="Kannada" ${rdto.knows=='Kannada'?'checked':''}/>Kannada
					     <BR> <input type="checkbox" name="knows" value="Tamil" ${rdto.knows=='Tamil'?'checked':''} />Tamil
						<BR> <input type="checkbox" name="knows" value="others" ${rdto.knows=='others'?'checked':''}/>Others
						
				 </td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			
					
				</tr>
				<tr>
					<td><B>Remember username? </B></td>
					<td><input type="checkbox" name="remember" value="${rdto.remember}" >
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				<tr>
				<tr>
					<td><input type="reset" value="ResetProfile" /></td>
					<td><input type="submit" value="UpdateProfile" /></td>
			</table>




</form>
</body>
</fieldset>
</html>