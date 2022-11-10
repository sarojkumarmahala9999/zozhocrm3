<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
	<form action="triggerEmail" method="post">
		<pre>
			To    <input type = "text" name = "email" value = "${email}"/>
			Subject <input type = "text" name = "subject"/>
			<textarea name="Content" rows="5" cols="50">
			
			</textarea>
			<input type = "Submit" value = "Send"/>
		</pre>
	</form>
	${msg}
</body>
</html>