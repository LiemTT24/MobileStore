<%-- 
    Document   : product-detail
    Created on : May 18, 2022, 2:58:53 PM
    Author     : Tran Thanh Liem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail</title>
        <link rel="stylesheet" href="./css/detail.css"/>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
        <div class="header">
            <h1>Products</h1>
        </div>
        <div class="detail">
            <div class="pro-img">
                <img src="./img/img3.png" alt="">
            </div>
            <div class="content">
                <div class="pro-name">
                    <h2>IphoneX</h2>
                </div>
                <div class="pro-des">
                    <p>A smartphone is @ handheld personal computer with @ mobile operating system and an integrated mobile broadband cellular network connection for voice, SMS, and Internet data communication; most, if ‘not al, smartphones also support Wi-Fi</p>
                </div>
                <div class="pro-code"><b>Item Code : </b><span class="code">1526440382825</span></div>
                <div class="pro-manufacturer"><b>manufacturer : </b>Apple</div>
                <div class="pro-category"><b>category : </b><a href="#">apple</a></div>
                <div class="pro-unit"><b>Available units in stock : </b>800</div>
                <div class="pro-price">1099USD</div>
                <div class="button">
                    <button class="back btn btn-success" value="back" name="back">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
                        <path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0zm3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z"/>
                        </svg>
                        back
                    </button>
                    <button class="order btn btn-warning" value="order" name="order">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                        </svg>
                        Order Now
                    </button>
                </div>
            </div>
        </div>
    </body>
</html>
