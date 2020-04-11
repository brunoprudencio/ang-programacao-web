<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Cadastro</title>
<body>
<h3>Tela para cadastro de clientes:</h3>
<form:form method="POST"
           action="/customer/register" modelAttribute="customer">
    <table>
        <tr>
            <td><form:label path="name">
                Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="cpf">
                CPF</form:label></td>
            <td><form:input path="cpf"/></td>
        </tr>
        <tr>
            <td><form:label path="age">
                Age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><form:label path="address">
                Address</form:label></td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><form:label path="phone">
                Phone</form:label></td>
            <td><form:input path="phone"/></td>
        </tr>
        <tr>
            <td><form:label path="mail">
                E-mail</form:label></td>
            <td><form:input path="mail"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Cadastrar"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>