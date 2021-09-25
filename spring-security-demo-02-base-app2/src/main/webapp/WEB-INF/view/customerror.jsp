<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags"%>
 
<!Doctype html>
<html>

<head>
 <title> Authorization  Page</title>
</head>


<body>

  <h1> Welcome To  Our Authorization Page </h1>
  <h1> Sorry you are not permit to proceed </h1>
  <hr>
  
<a href="${pageContext.request.contextPath}/">Back to main Dashboard</a>
  
</body>

</html>