<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"  %>

<!Doctype html>

<html>

<body>
<title> Student Regestiration </title>
   <form:form  action="processform"   modelAttribute="student">

    <br><br>
    First Name<form:input path="firstname"/>   
    
   
     <br><br>
     Last name <form:input path="lastname"/>
     
     <br><br>
     Country <form:select path="country">
     <br><br>
     <br><br>
     <!--  using itemes for optoines that set in the java code -->
      <form:options items="${thecountryOptions}" />
     
     <!--  hard coded using forn optoines
     <form:option value="egypt" label="EGYPT"></form:option>
     <form:option value="tunisa" label="TUNISA"></form:option>
     <form:option value="libya" label="LIBYA"></form:option>
     <form:option value="syria" label="SYIRA"></form:option>
     -->
     
     </form:select>
     
     <br><br>
     <br><br> 
     Favorite Languges 
     
     <form:radiobuttons path="favourotelanguges" items="${student.favourotelanguges_optoines}"/>
     
     <!--  
        java<form:radiobutton path="favourotelanguges" value="java "/>
        php<form:radiobutton path="favourotelanguges" value="php "/>
        json<form:radiobutton path="favourotelanguges" value="json "/>
        python<form:radiobutton path="favourotelanguges" value="python "/>
     -->
     
     <br><br>
     
     
      
     <br><br>
     <br><br>
     Operating system    :  
     mac operating system<form:checkbox path="operatingSystems" value="mac"/>
     microsoft operating system<form:checkbox path="operatingSystems" value="micro"/>
     linux operating system<form:checkbox path="operatingSystems" value="linux"/>
   
     <br><br>
     <input  type="submit"> 
   
   
   </form:form>

</body>


</html>