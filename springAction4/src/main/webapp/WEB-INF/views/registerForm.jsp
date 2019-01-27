<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<meta charset="utf-8" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<head>
 <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"  />"  >
</head>

	<h1>Register</h1>

	<sf:form method="POST" modelAttribute="spitter">
		<sf:errors path="*" element="div" cssClass="error"></sf:errors>

		<sf:label path="firstName" cssErrorClass="error">First Name:</sf:label>
		<sf:input type="text" path="firstName" cssErrorClass="error" />
		<br />

		<sf:label path="lastName" cssErrorClass="error">Last Name:</sf:label>
		<sf:input type="text" path="lastName" cssErrorClass="error"/>
		<br />

		<sf:label path="email" cssErrorClass="error">Email:</sf:label>
		<sf:input type="text" path="email" cssErrorClass="error"/>
		<br />

		<sf:label path="username" cssErrorClass="error">Username:</sf:label>
		<sf:input type="text" path="username" cssErrorClass="error"/>
		<br />

		<sf:label path="password" cssErrorClass="error">Password:</sf:label>
		<sf:input type="password" path="password" cssErrorClass="error"/>
		<br />

		<input type="submit" value="Register" />
	</sf:form>

