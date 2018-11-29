<%--
  Created by IntelliJ IDEA.
  User: Pham Dat
  Date: 11/28/2018
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css.css" />
  </head>
  <body>
  <div class="content">
    <h1>Calculator</h1>
    <form method="post" action="calculator">
      <label>Product Description:</label><br/>
      <input type="text" name="description"/><br/>
      <label>List Price:</label><br/>
      <input type="text" name="price"/><br/>
      <label>Discount Percent:</label><br/>
      <input type="text" name="discount_percent"/><br/>
      <label>&nbsp;</label><br/>
      <button type="submit">Submit!</button>
    </form>
  </div>
  </body>
</html>
