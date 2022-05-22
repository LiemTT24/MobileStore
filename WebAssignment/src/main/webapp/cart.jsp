<%-- 
    Document   : cart
    Created on : May 19, 2022, 2:36:46 AM
    Author     : Tran Thanh Liem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
        <link rel="stylesheet" href="./css/cart.css"/>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        
    </head>
    <body>
        <div class="header">
            <div>
                <h1>Cart</h1>
                <p>All the selected products in your cart</p>
            </div>
        </div>
        <div class="user-cart">
            <div class="cart-button">
                <button class="clear btn btn-danger" value="clear" name="clear">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-circle-fill" viewBox="0 0 16 16">
                <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM5.354 4.646a.5.5 0 1 0-.708.708L7.293 8l-2.647 2.646a.5.5 0 0 0 .708.708L8 8.707l2.646 2.647a.5.5 0 0 0 .708-.708L8.707 8l2.647-2.646a.5.5 0 0 0-.708-.708L8 7.293 5.354 4.646z"/>
                </svg>
                Clear Cart
            </button>
            <button class="checkout btn btn-success" value="checkout" name="checkout">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
                <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                </svg>
                Check out
            </button>
            </div>
            <table class="table list-product" style="padding: 10px">
                <thead>
                <th scope="col">Product</th>
                <th>Quantity</th>
                <th>Unit price</th>
                <th>Price</th>
                <th>Action</th>
                </thead>
                <tbody>
                    <tr>
                        <td>IphoneX</td>
                        <td>1</td>
                        <td>1099</td>
                        <td>1099</td>
                        <td>
                            <button class="remove btn-sm btn-danger" value="remove" name="remove">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
                                <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                                </svg>
                                Remove
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td>Iphone 8 Plus 64GB PRODUCT RED</td>
                        <td>1</td>
                        <td>1009</td>
                        <td>1009</td>
                        <td>
                            <button class="remove btn-sm btn-danger" value="remove" name="remove">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
                                <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                                </svg>
                                Remove
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td>Galaxy S8</td>
                        <td>1</td>
                        <td>699</td>
                        <td>699</td>
                        <td>
                            <button class="remove btn-sm btn-danger" value="remove" name="remove">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
                                <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                                </svg>
                                Remove
                            </button>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <th>Grand Total</th>
                        <th>2807</th>
                        <td></td>
                    </tr>
                </tbody>
            </table>
            <button class="back btn btn-success" value="back" name="back">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
                <path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0zm3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z"/>
                </svg>
                continue shopping
            </button>
        </div>
    </body>
</html>
