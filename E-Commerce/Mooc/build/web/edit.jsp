<%-- 
    Document   : update
    Created on : Nov 21, 2022, 2:32:02 PM
    Author     : trung
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Edit Orders</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Edit <b>Order</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="edit">
                            <div class="modal-header">						
                                <h4 class="modal-title">Orders</h4>
                            </div>
                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>Order ID</label>
                                    <input value="${detail.orderID}" name="orderid" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Cart ID</label>
                                    <input value="${detail.cartID}" name="cartid" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Founded Date</label>
                                    <input value="${detail.foundedDate}" name="foundeddate" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Delivery Date</label>
                                    <input value="${detail.deliveryDate}" name="deliverydate" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Address</label>
                                    <input value="${detail.address}" name="address" type="text" class="form-control" required>
                                </div>                              
                                <div class="form-group">
                                    <label>Payment Way</label>
                                    <select name="paymentway" class="form-select">
                                        <option value="1">Chuyển khoản</option>
                                        <option value="2">Tiền mặt</option>
                                        <option value="3">Ship COD</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Payment Status</label>
                                    <select name="paymentstatus" class="form-select">
                                        <option value="1">Đã giao hàng</option>
                                        <option value="2">Hủy đơn</option>
                                        <option value="3">Chưa xử lý</option>
                                    </select>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="submit" class="btn btn-success" value="Edit">
                                <a href="homeServlet"><input class="btn btn-success" value="Cancel" style="background-color: red;"></a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>

    </body>
</html>