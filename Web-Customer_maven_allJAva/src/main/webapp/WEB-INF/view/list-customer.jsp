<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!doctype html>
<html>

<head>

<title>Customer list</title>

<link 
         type="text/css"
         rel="stylesheet" 
         href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>


<body>

       <div id="wrapper">
       
         <div  id="header">
             <h2>CRM ---- Customer Relation Manager</h2>
         </div>
       
       </div>


         <!-- add table to contain the costomer lists  -->

         <div  id = "container">
         
              <div id="content">
              
              <!-- add button  for inserting customer  -->
              <input type="button" value="Add Customer"
                 onclick="window.location.href='showformforadd' ; return false"
                 class="add-button"
              />
              
              
			              <!--  make the search form  -->
			              <form action="search" method="get">
			                 <input type="text"  name="SearchName" placeholder="Enter First Name "/>
			                 <input type="submit" value="Search"  class="add-button"/>
			                  <input type="button" value="All Customer List"
				                 onclick="window.location.href='list' ; return false"
				                 class="add-button"
             					 />
			              </form>
			              
                     <table>
                     
                     
                     
                          <tr>
                              <th>First name </th>
                              <th>last  name </th>
                              <th>Customer </th>
                              <th>Action </th>
                          </tr>
                          
                        <!-- loop over the customer list -->  
                        
                        <c:forEach var="tempcustomer" items="${customer}"> 
                        
                        <tr>
                                <c:url var="tempupdate" value="/customer/showformforupdate">
                                <c:param name="studentId" value="${tempcustomer.id}"></c:param>
                                </c:url>
                                
                                <c:url var="delete" value="/customer/deleteform">
                                       <c:param name="studentID" value="${tempcustomer.id}"></c:param>
                                </c:url>
                                
                                
                                <td>
                                ${tempcustomer.first_name }
                                </td>
                                 <td>
                                ${tempcustomer.last_name }
                                </td>
                                 <td>
                                ${tempcustomer.email }
                                </td>
                                <td>
                                   <a href="${tempupdate}">Update</a>
                                </td>
                                <td>
                                   <a 
                                    onclick="if(!(confirm('Are you sure ???'))) return false"
                                   href="${delete}"> | Delete</a>
                                </td>
                        
                        
                        </tr>
                        
                        </c:forEach>

                     
                     </table>
              
              </div>
         
         
         </div>




</body>



</html>