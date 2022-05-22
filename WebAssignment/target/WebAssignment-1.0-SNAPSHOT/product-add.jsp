<%-- 
    Document   : product-add
    Created on : May 17, 2022, 9:16:08 AM
    Author     : Tran Thanh Liem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
        <link rel="stylesheet" href="css/add-product.css" />
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
        <div class="header">
            <div>
                <h1>Product</h1>
                <p>Add products</p>
            </div>
            <button class="logout btn btn-danger" value="logout" name="logout-submit">Logout</button>
        </div>
        <div class="AddProducts">
            <p class="Add-title">Add new product</p>
            <form class="addproduct-container">
                <div class="properties">
                    <p class="Add-name col-md-2">Product Name</p>
                    <input type="text" class="product-name" name="product-name"/>
                </div>
                <div class="properties">
                    <p class="Add-price col-md-2">Unit Price</p>
                    <input type="text" class="product-price" name="product-price"/>
                </div>
                <div class="properties">
                    <p class="Add-stock col-md-2">Unit in Stock</p>
                    <input type="text" class="product-stock" name="product-stock" value="0"/>
                </div>
                <div class="properties">
                    <p class="Add-description col-md-2">Description</p>
                    <textarea class="product-des" name="product-des" rows="2"></textarea>
                </div>
                <div class="properties">
                    <p class="Add-manufacturer col-md-2">Manufacturer</p>
                    <input type="text" class="product-manufacturer" name="product-manufacturer"/>
                </div>
                <div class="properties">
                    <p class="Add-category col-md-2">Category</p>
                    <input type="text" class="product-category" name="product-category"/>
                </div>
                <div class="properties">
                    <p class="Add-condition col-md-2">Condition</p>
                    <div class="product-condition">
                        <input type="radio" id="new" name="condition" value="New"/>
                        <label for="new">New</label>
                        <input type="radio" id="old" name="condition" value="Old"/>
                        <label for="old">Old</label>
                        <input type="radio" id="refurbished" name="condition" value="refurbished"/>
                        <label for="refurbished">Refurbished</label>
                    </div>
                </div>
                <div class="properties">
                    <p class="Add-img col-md-2">Product Image File</p>
                    <input type="file" class="product-file" name="product-file"/>
                </div>
                <button class="add-product btn btn-primary" value="add-product" name="add-product">Add Product</button>
            </form>
        </div>
    </body>
</html>
