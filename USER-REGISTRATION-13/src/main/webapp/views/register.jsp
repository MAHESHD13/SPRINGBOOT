<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<center>
	<h1 style="color:red">User Registration Form</h1>
	<form:form action="/register" method="POST" modelAttribute="users">
	Name : <form:input path="name"/><p></p>
	Password : <form:password path="password"/><p></p>
	Email : <form:input path="email"/><p></p>
	Mobile Number : <form:input path="mobile_no"/><p></p>
	Address : <form:input path="address"/><p></p>
	<input type="submit" value="Register">
	</form:form>
</center>