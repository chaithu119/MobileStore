<h1 style="text-align:center;color:red">Registration page</h1>

<form action="productinsert" method="post" enctype="multipart/form-data">
<table align="center" border="0">
<tr><td>pid:</td>
<td><input type="text" name="productid" max="10"></td></tr>

<tr><td>
productcolor</td><td><input type="text" name="productcolor" max="10">
</td></tr>
<tr><td>
productDetails:</td><td><input type="text" name="productDetails" max="10">
</td></tr>
<tr><td>
quantity:</td><td><strong><input type="password" name="quantity" min="5" max="10"/></strong>
</td></tr>
<tr><td>
productname:</td><td> <strong><input type="text" name="productname" min="5" max="10"/></strong>
</td></tr>
<tr><td>
productdesc:</td><td><input type="text" name="productdesc"/>
</td></tr>
<tr><td>
productprice:</td><td><input type="text" name="productprice" >
</td></tr>

<tr><td>productCompany:<input type="text" name="productCompany"/>
   </td></tr>
   
<tr><td>Image:<input type="file" name="image"/>
   </td></tr>
  
      
     <tr  style="text-align:center"><td>
<input type="submit" value="productRegister"/></td></tr>
</table>
</form>