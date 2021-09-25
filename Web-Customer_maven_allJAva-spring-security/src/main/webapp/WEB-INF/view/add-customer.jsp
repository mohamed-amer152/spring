<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix='c' uri="http://java.sun.com/jstl/core" %>

<!Doctype html>


<html>

<head>
     <title>Add Customer</title>
     
     <link 
         type="text/css"
         rel="stylesheet" 
         href="${pageContext.request.contextPath}/resources/css/style.css"/>
         
         <link 
         type="text/css"
         rel="stylesheet" 
         href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>

           
<body>

   <div id="wrapper">
   
           <div id="header">
           <h2>CRM ----  Customer Relation Manager   </h2>
           </div>
   </div>


  <div id="container">
  
           <h3> Saving New Customer</h3>
  
         <form:form action="savecustomer" method="post"  modelAttribute="customer"   >
             
             <!--  assossiate the data with an id  -->
             <form:hidden path="id"/>
             
                  <table>
                   <tbody>
                          <tr>
                           <td><label>First Name</label></td>
                           <td><form:input path="first_name"/></td>
                          </tr>
                          
                          <tr>
                           <td><label>last Name</label></td>
                           <td><form:input path="last_name"/></td>
                          </tr>
                          
                          <tr>
                           <td><label>email</label></td>
                           <td><form:input path="email"/></td>
                          </tr>
                          
                           <tr>
                           <td><input type="submit" value="Save" class="save"/></td>
                          </tr>
                          
                   </tbody>
                  </table>
                
         
         </form:form>
         
         <div style="clear; both;"></div>
        
     <p>
     
     <a href="${pageContext.request.contextPath}/customer/list">
     
     Back To Customer List
     </a>
     
     </p>
  
  
  </div>




</body>


</html>