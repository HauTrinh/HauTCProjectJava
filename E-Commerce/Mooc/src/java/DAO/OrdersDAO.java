/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Orders;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Orders> getAllOrders() {
        List<Orders> list = new ArrayList<>();
        String query = "select * from Orders";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Orders(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getDate(3),
                                    rs.getDate(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteOrders(String id) {
        String query = "delete from Orders \n"
                + "  where OrderID = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public int getNumberPage() {
        String query = "select count(*) from Orders";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int total = rs.getInt(1);
                int countPage = 0;
                countPage = total / 5;
                if (total % 5 != 0) {
                    countPage++;
                }
                return countPage;
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Orders> pagingOrders(int index) {
        List<Orders> list = new ArrayList<>();
        String query = "select * from Orders\n"
                + "ORDER BY OrderID\n"
                + "OFFSET ? ROWS FETCH NEXT 5 ROWS ONLY;";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Orders(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getDate(3),
                                    rs.getDate(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Orders getOrdersByID(String id) {
        String query = "select * from Orders\n"
                + "where orderid = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Orders(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getDate(3),
                                    rs.getDate(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }




    public void editOrders(String cartid, String foundeddate, String deliverydate, String address,
            String paymentway, String paymentstatus, String orderid) {
        String query = "update Orders \n"
                + "set CartID = ?,\n"
                + "FoundedDate = ?,\n"
                + "DeliveryDate = ?,\n"
                + "[Address] = ?,\n"
                + "PaymentWay = ?,\n"
                + "PaymentStatus = ?\n"
                + "where OrderID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cartid);
            ps.setString(2, foundeddate);
            ps.setString(3, deliverydate);
            ps.setString(4, address);
            ps.setString(5, paymentway);
            ps.setString(6, paymentstatus);
            ps.setString(7, orderid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Orders> searchByName(String txtSearch) {
        List<Orders> list = new ArrayList<>();
        String query = "select * from Orders\n"
                + "where [PaymentWay] like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Orders(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getDate(3),
                                    rs.getDate(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;

    }

    
    public int getTotalOrders() {
        String query = "select count(*) from Orders";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
//    public static void main(String[] args) {
//    OrdersDAO dao = new OrdersDAO();
//    List<Orders> list = dao.getAllOrders();
//    for (Orders o : list) {
//        System.out.println(o);
//    }
//    }
    
    
    public static void main(String[] args) {
    OrdersDAO dao = new OrdersDAO();
//    List<Orders> list = dao.getAllOrders();
    Orders s = dao.getOrdersByID("2");
        System.out.println(s);
    
    }

}
