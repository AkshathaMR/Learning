<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${Success}</h2>
<form action="order" method="Post">
Name:<input type="text" name="name"><br/>
Quantity:<input type="number" name="quantity"><br/>
Price:<input type="String" name="price"><br/>
Type:<select name="type">
<option value="jawari">Jawari</option>
<option value="hybrid">Hybrid</option>
</select>
<br/>
DeliveryDate:<input type="date" name="deliveryDate">
<br/>
<input type="submit" value="PlaceOrder"> &nbsp; <input type="submit" formaction="display" value="DisplayItems">
</form>
</body>
</html>