<%--
  Created by IntelliJ IDEA.
  User: Ankit Rana
  Date: 7/27/2019
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Cutomer Relationship Manager</h2>
        </div>
        <div id="container">
            <h2>Save Customer</h2>
        </div>
        <form:form action="saveCustomer" modelAttribute="customer" method="POST">
                <table>
                    <tbody>
                    <tr>
                        <td><label>First Name : </label></td>
                        <td><form:input path="firstName"></form:input></td>
                    </tr>
                    <tr>
                        <td><label>Last Name : </label></td>
                        <td><form:input path="lastName"></form:input></td>
                    </tr>
                    <tr>
                        <td><label>Email : </label></td>
                        <td><form:input path="email"></form:input></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="button" value="Save" class="save"></td>
                    </tr>
                    </tbody>
                </table>
            </form:form>

        <div id="container"></div>
        <p>
            <a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
        </p>
    </div>
</body>
</html>
