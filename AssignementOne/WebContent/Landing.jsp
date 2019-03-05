
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AssignementOne</title>
</head>
<body bgcolor="sky blue">
 <fieldset>
			<legend>
				<B>Profile Example ...</B>
			</legend>
			<BR>
			<form action="Thankyou.jsp" method="post">
<h2>WelCome ${nm}</h2>
<p>Login Success!!!!!</p>
<p style="color: red">${msg}</p></br>

<p><a href="Update.jsp">Change Phnumber</a></p>
 <p><a href="UpdateProfile.jsp">Update Profile</a></p> 
  <B> <input type="submit" value="Logout"/></B>
           </form>
</fieldset>
</body>
</html>