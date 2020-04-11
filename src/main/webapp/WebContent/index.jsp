<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema Dealership</title>
</head>
<body>
<h1>Sistema Dealership</h1>
<form:form method="GET"
           action="/customer" modelAttribute="customer">
    <input type="submit" value="Cadastro de clientes">
</form:form>

<form:form method="GET"
           action="/auto" modelAttribute="AutomobileServicing">
    <input type="submit" value="Cadastro de serviços">
</form:form>

</body>
</html>
