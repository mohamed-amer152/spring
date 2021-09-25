<%@  taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<!Doctype html>

<html>

<head>
    <title>   customer confirmation page</title>
    
    <style type="text/css">
    .error {color:red}
    </style>

</head>


<body>

   <form:form  action="processform" modelAttribute="customer">
   
   <form:input path="firstName" placeholder=" Enter your firstname "/>
   <br><br>
   <br><br>
   <form:input path="lastName" placeholder=" Enter your lasttname *"/>
   <form:errors path="lastName"  cssClass="error"/>
   <br><br>
   <br><br>
   <form:input path="passway"/>
   <form:errors path="passway" cssClass="error"/>
   <br><br>
   <br><br>
   <form:input path="postalcode" placeholder="postal code "/>
   <form:errors path="postalcode" cssClass="error"/>
   <br><br>
   <br><br>
   <form:input path="cource" placeholder="cource "/>
   <form:errors path="cource" cssClass="error"/>
   <br><br>
   <br><br>
   <input type="submit" value="Enter">
   

   
   </form:form>


</body>


</html>