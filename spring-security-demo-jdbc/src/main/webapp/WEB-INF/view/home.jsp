<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags"%>
 
<!Doctype html>
<html>

<head>
 <title> Home Page</title>
</head>


<body>

  <h1> Welcome To  Our Home Page </h1>
  <hr>
  User : <security:authentication property="principal.username"/>
  <br><br>
  Roles: <security:authentication property="principal.authorities"></security:authentication>
  <hr>
  
  <!-- restrict the content based on the role  -->
  <security:authorize access="hasRole('MANAGER')">
  <!-- restrict the role based on the user  -->
  <a href="${pageContext.request.contextPath}/manager">Manger DashBoard</a>
  </security:authorize>
  <br><br>
  
  <!-- restrict the content based on the role  -->
  <security:authorize access="hasRole('ADMIN')">
  <!-- restrict the role based on the user  -->
  <a href="${pageContext.request.contextPath}/admin">Admin DashBoard</a>
  </security:authorize>
   <br><br>
   
  
  				<form:form action="${pageContext.request.contextPath}/logout" 
  				method="POST">
  				   <input type="submit" value="logout"/>
  				</form:form>
  		
  
</body>

</html>