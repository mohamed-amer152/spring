
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!Doctype html>


<html>

<body>

<title> Student Confirmatoin </title>

<br><br>
hello Student : 

${student.firstname} ${student.lastname }

<br><br>
from :

${thecountryOptions }

<br><br>

favourite languge   : ${student.favourotelanguges}


</body>





<br><br>

operating system     : 

<ul>

   <c:forEach   var="temp"   items="${student.operatingSystems}">
     <li>
        ${temp}
     </li>
   </c:forEach>


</ul>

</body>



</html>