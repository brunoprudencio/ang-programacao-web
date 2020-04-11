<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Cadastro</title>
</head>
<body>
<h3>Tela para cadastro de serviços:</h3>

<form:form method="POST" action="/auto/register" modelAttribute="automobileservicing">
    <table>
        <tr>
            <td><form:label path="customerCPF">CPF do cliente:</form:label></td>
            <td><form:input path="customerCPF"/></td>
        </tr>
        <tr>
            <td><form:label path="type">Tipo de veículo:</form:label></td>
            <td>
                <form:select path="type">
                    <form:option value="NONE" label="Select"/>
                    <form:options items="${typeList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="automobileBrand">Marca do veículo:</form:label></td>
            <td><form:textarea path="automobileBrand"/></td>
        </tr>
        <tr>
            <td><form:label path="automobileModel">Modelo do veículo:</form:label></td>
            <td><form:textarea path="automobileModel"/></td>
        </tr>
        <tr>
            <td><form:label path="service">Serviços:</form:label></td>
            <td><form:checkboxes items="${serviceList}" path="service"/></td>
        </tr>
    </table>
    <br>
    <tr>
        <td colspan="2">
            <input type="submit" value="Cadastrar"/>
        </td>
    </tr>
</form:form>

</body>
</html>