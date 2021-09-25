<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<html>
<head>
<title>
   LOG IN PAGE
</title>
</head>

<body>

    		<form:form action="${pageContext.request.contextPath}/userAuth" method="POST">
    		
    						<!-- Errors message for login  -->
    						<c:if test="${param.error !=null}">
    						<i> Sorry You Entered Wrong Password/User</i>
    						</c:if>  
    		        <br><br>
    				USer Name<input name="username" type="text"/>
    				<br><br>
    				Password <input name="password" type="password"/>
    				<br><br>
    				<input type="submit" value="login"/>
    		
    		</form:form>
    
</body>


</html>