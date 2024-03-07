<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
	<h1 style="color:red">Employee Invoice Details</h1>
	<form:form action="/employeedetails" method="POST" modelAttribute="employees">
	Employee No : <form:input path="empNo"/><p></p>
	Employee Name : <form:input path="empName"/><p></p>
	Employee Salary : <form:input path="empSalary"/><p></p>
	<input type="submit" value="PrintInvoice"><p></p>
	</form:form>
</center>