<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form action="saveproduct" method="post">
    <table>
      <tr><td>Name</td><td><input type="text" name="productName"></td></tr>
      <tr><td>Quantity</td><td><input type="text" name="productQty"></td></tr>
      <tr><td>Price</td><td><input type="text" name="productPrice"></td></tr>
      <tr><td>Description</td><td><input type="text" name="productDesc"></td></tr>
      <tr><td><input type="submit" value="Save"></td></tr>
    </table>
  </form>


</body>
</html>