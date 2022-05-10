<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>

<style type="text/css">
table{
broder: 2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,td,th{
border: 2px solid blue

}
</style>
</head>
<body>
<h1 style=text-align:center;color:pink;font-size:100px> 
 PRODUCT LIST</h1>
<table>
<tr> 
<th>Product Id</th>
<th>Product Name</th>
<th> price</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</c:forEach>
</tr>

</table>
</body>
</html>