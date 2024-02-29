/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Cart;
import entity.Carts;
import entity.Color;
import entity.Colors;
import entity.Customers;
import entity.Order;
import entity.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetailDAO {

    Connection conn = null; //ket noi toi sql_server
    PreparedStatement ps = null; //nem cau lenh sql tu netbean sang sql server
    ResultSet rs = null; //nhan ket qua tra ve

    public List<Color> getListColor(int productID) {
        List<Color> listColor = new ArrayList<>();
        String query = "SELECT pimage.Color, pimage.LinkImageColor\n"
                + " FROM Product as p\n"
                + " left join Product_Image as pimage ON p.ProductID = pimage.ProductID\n"
                + " where p.ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Color c = new Color(rs.getString(1),
                        rs.getString(2));
                listColor.add(c);
            }
        } catch (Exception e) {
        }
        return listColor;
    }

    public List<Size> getListSize(int productID) {
        List<Size> listSize = new ArrayList<>();
        String query = "Select DISTINCT pd.Size\n"
                + "From ProductDetail As pd\n"
                + "where pd.ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size z = new Size(rs.getString(1));
                listSize.add(z);
            }
        } catch (Exception e) {
        }
        return listSize;
    }

    public int getCountProduct(String color, String size, int productID) {
        String query = "Select pd.CountProduct\n"
                + "From ProductDetail As pd\n"
                + "Where pd.Color = ? And pd.Size = ? And pd.ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, color);
            ps.setString(2, size);
            ps.setInt(3, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public Cart showCart1(String cus, int stt, String size, String color, int cid) {
        String query = "select ct.* from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and ct.Size = pd.Size\n"
                + "and ct.Color = pd.Color\n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] < ?\n"
                + "and ct.ProductID = ?\n"
                + "and ct.Size = ?\n"
                + "and ct.Color = ?\n"
                + "and ct.CustomerID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setString(2, cus);
            ps.setString(3, size);
            ps.setString(4, color);
            ps.setInt(5, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Cart(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8));
            }
        } catch (Exception e) {

        }
        return null;

    }

    public void insertCart(int cusID, String sID, String pID, String size, String color, int quantity) {
        String query = "Insert into Cart values (?,?,?,?,?,?,1)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cusID);
            ps.setString(2, sID);
            ps.setString(3, pID);
            ps.setString(4, size);
            ps.setString(5, color);
            ps.setInt(6, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateCart(int quantity, int pro) {
        String query = "update Cart set Amount = ? where CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setInt(2, pro);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public List<Carts> showCart(int cus, int stt) {
        List<Carts> list = new ArrayList<>();
        String query = "select ct.*, p.ProductName, p.ImageLink, p.Price, p.Price * ct.Amount as total\n"
                + "from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and ct.Size = pd.Size\n"
                + "and ct.Color = pd.Color\n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] < ?\n"
                + "and ct.CustomerID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setInt(2, cus);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Carts(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getDouble(11),
                        rs.getDouble(12)
                ));
            }
        } catch (Exception e) {

        }
        return list;

    }

    public void deleteCart(int CartID) {
        String query = "delete Cart where CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, CartID);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void checkout(int status, String cid) {
        String query = "update Cart set [Status] = ? where CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
            ps.setString(2, cid);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public List<Carts> showCheckOut(int cus, int stt) {
        List<Carts> list = new ArrayList<>();
        String query = "select ct.*, p.ProductName, p.ImageLink, p.Price, p.Price * ct.Amount as total\n"
                + "from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and ct.Size = pd.Size\n"
                + "and ct.Color = pd.Color\n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] = ?\n"
                + "and ct.CustomerID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setInt(2, cus);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Carts(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getDouble(11),
                        rs.getDouble(12)
                ));
            }
        } catch (Exception e) {

        }
        return list;

    }

    public Customers getCustomer(int id) {
        String query = "select * from Customers where CustomerID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customers(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Size> showSizeProducts(int stt, int ct) {
        List<Size> list = new ArrayList<>();
        String query = "select DISTINCT pd.Size from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] < ?\n"
                + "and ct.CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setInt(2, ct);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Size(
                        rs.getString(1)));
            }
        } catch (Exception e) {

        }
        return list;

    }

    public Carts showCart1s(int stt, int ct) {
        String query = "select ct.*, p.ProductName, p.ImageLink, p.Price, p.Price * ct.Amount as total\n"
                + "from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and ct.Size = pd.Size\n"
                + "and ct.Color = pd.Color\n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] < ?\n"
                + "and ct.CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setInt(2, ct);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Carts(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getDouble(11),
                        rs.getDouble(12));
            }
        } catch (Exception e) {

        }
        return null;

    }

    public List<Colors> getListColors(int stt, int ct) {
        List<Colors> listColor = new ArrayList<>();
        String query = "select DISTINCT pd.Color from Product p, Cart ct, ProductDetail pd, Customers c\n"
                + "where p.ProductID = pd.ProductID\n"
                + "and ct.ProductID = p.ProductID \n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and ct.[Status] < ?\n"
                + "and ct.CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, stt);
            ps.setInt(2, ct);
            rs = ps.executeQuery();
            while (rs.next()) {
                listColor.add(new Colors(
                        rs.getString(1)));
            }
        } catch (Exception e) {
        }
        return listColor;
    }

    public void updateCarts(String Color, String Size, int Amount, int CartID) {
        String query = "update Cart set Color = ?, Size = ?, Amount = ? where CartID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Color);
            ps.setString(2, Size);
            ps.setInt(3, Amount);
            ps.setInt(4, CartID);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void insertOrder(String cartID, String address, String payWay, String payStatus) {
        String query = "Insert into Orders values (?, GETDATE(), NULL,?, ?, ?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cartID);
            ps.setString(2, address);
            ps.setString(3, payWay);
            ps.setString(4, payStatus);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> ShowOrder(int cusID) {
        List<Order> list = new ArrayList<>();
        String query = "select o.OrderID, o.CartID, p.ImageLink, p.ProductName, o.FoundedDate, o.DeliveryDate, o.[Address], o.PaymentWay, c.Amount * p.Price total, o.PaymentStatus\n"
                + "from Orders o, Cart c, ProductDetail pd, Product p, Customers ct\n"
                + "where o.CartID = c.CartID\n"
                + "and c.ProductID = pd.ProductID\n"
                + "and pd.ProductID = p.ProductID\n"
                + "and c.Color = pd.Color\n"
                + "and c.Size = pd.Size\n"
                + "and c.CustomerID = ct.CustomerID\n"
                + "and c.CustomerID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cusID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getDouble(9),
                        rs.getString(10)));
            }
        } catch (Exception e) {

        }
        return list;

    }

    public void cancelOrder(String status, String oid) {
        String query = "update Orders set PaymentStatus = ? where OrderID = ?";
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, status);
            ps.setString(2, oid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DetailDAO detailDAO = new DetailDAO();
        String color = "RED";
        String size = "S";
//        int productID = detailDAO.getIDDetail(4);

//        int d = detailDAO.getCountProduct(color, size, 1);
//        System.out.println(d);
        List<Color> list = detailDAO.getListColor(2);
        for (Color o : list) {
            System.out.println(o);
        }
        List<Order> c = detailDAO.ShowOrder(1);
        for (Order ct : c) {
            System.out.println(ct.toString());
        }
    }
}
