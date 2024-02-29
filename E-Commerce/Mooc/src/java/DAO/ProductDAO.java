/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Cart;
import entity.Product;
import entity.store1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    Connection conn = null; //ket noi toi sql_server
    PreparedStatement ps = null; //nem cau lenh sql tu netbean sang sql server
    ResultSet rs = null; //nhan ket qua tra ve

    public List<Product> getTopProduct() {
        List<Product> listTop = new ArrayList<>();
        String query = "select top 6 p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + " from Product as p\n"
                + " left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + " left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + " left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + " group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                + " order by ProductID DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
                listTop.add(p);
            }
        } catch (Exception e) {
        }
        return listTop;
    }

    public int getTotalProduct() {
        String query = "SELECT COUNT(*) FROM Product";
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

    public List<Product> pagingProduct(int index) {
        List<Product> listProductInPage = new ArrayList<>();
        String query = "select p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + "from Product as p\n"
                + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                + "ORDER BY ProductID\n"
                + "OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 8);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
                listProductInPage.add(p);
            }
        } catch (Exception e) {
        }
        return listProductInPage;
    }

    public int getTotalProductByCategory(int categoryID) {
        if (categoryID == 0) {
            return getTotalProduct();
        } else {
            String query = "SELECT COUNT(*) FROM Product WHERE CategoryID = ?";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, categoryID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
            }
        }
        return 0;
    }

    public List<Product> pagingByCategory(int index, int categoryID) {
        List<Product> listProductInPage = new ArrayList<>();
        if (categoryID == 0) {
            listProductInPage = pagingProduct(index);
        } else {
            String query = "select p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                    + "from Product as p\n"
                    + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                    + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                    + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                    + "WHERE c.CategoryID = ?\n"
                    + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                    + "ORDER BY ProductID\n"
                    + "OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY";
            try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, categoryID);
                ps.setInt(2, (index - 1) * 8);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Product p = new Product(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6),
                            rs.getInt(7),
                            rs.getString(8),
                            rs.getInt(9),
                            rs.getString(10),
                            rs.getInt(11));
                    listProductInPage.add(p);
                }
            } catch (Exception e) {
            }
        }
        return listProductInPage;
    }

    public int getTotalProductBySex(String Sex) {
        String query = "SELECT COUNT(*) FROM Product where Sex = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Sex);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProductBySex(String Sex, int index) {
        List<Product> listProductInPage = new ArrayList<>();
        String query = "select p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + "from Product as p\n"
                + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + "WHERE Sex like ?\n"
                + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                + "ORDER BY ProductID\n"
                + "OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + Sex + "%");
            ps.setInt(2, (index - 1) * 8);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
                listProductInPage.add(p);
            }
        } catch (Exception e) {
        }
        return listProductInPage;
    }

    public int getTotalProductBySearch(String txtSearch) {
        String query = "SELECT COUNT(*) FROM Product left join Store on Product.StoreID = Store.StoreID\n"
                + "where Product.ProductName like ? or Store.StoreName like ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProductBySearch(String txtSearch, int index) {
        List<Product> listProductInPage = new ArrayList<>();
        String query = "select p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + "from Product as p\n"
                + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + "where p.ProductName like ? or s.StoreName like ?\n"
                + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                + "ORDER BY ProductID\n"
                + "OFFSET ? ROWS FETCH NEXT 8 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            ps.setInt(3, (index - 1) * 8);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
                listProductInPage.add(p);
            }
        } catch (Exception e) {
        }
        return listProductInPage;
    }

    public Product getProductByID(int productID) {
        String query = "select p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + "from Product as p\n"
                + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + "Where p.ProductID = ?\n"
                + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductSame(int productID) {
        List<Product> listTop = new ArrayList<>();
        String query = "select top 4 p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName, sum(pd.CountProduct) as totalProduct\n"
                + "from Product as p\n"
                + "left outer join ProductDetail as pd on (p.ProductID = pd.ProductID)\n"
                + "left outer join Store as s on (p.StoreID = s.StoreID)\n"
                + "left outer join Category as c on (p.CategoryID = c.CategoryID)\n"
                + "where p.CategoryID = (Select categoryID from Product where ProductID = ?)\n"
                + "group by p.ProductID, p.ProductName, p.Descriptions, p.Sex, p.ImageLink, p.Price, p.CategoryID, c.CategoryName, p.StoreID, s.StoreName\n"
                + "ORDER BY ProductID DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getInt(11));
                listTop.add(p);
            }
        } catch (Exception e) {
        }
        return listTop;
    }
    public store1 showStore (String productID) {
         String query = "select s.* from Store s, Product p\n" +
                        "where p.StoreID = s.StoreID\n" +
                        "and p.ProductID = ?";
         try {
             conn = new DBContext().getConnection();
             ps = conn.prepareStatement(query);
             ps.setString(1, productID);
             rs = ps.executeQuery();
             while (rs.next()){
                 return new store1 (rs.getString(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5)
                 );
             }
         }catch (Exception e) {
             
         }
         return null;
     }
    public void updateProductdetail(String ct) {
         String query = "Update ProductDetail set CountProduct = CountProduct - Cart.Amount \n" +
                        "from Cart\n" +
                        "where Cart.Color = ProductDetail.Color\n" +
                        "and Cart.Size = ProductDetail.Size\n" +
                        "and Cart.ProductID = ProductDetail.ProductID\n" +
                        "and Cart.CartID = ?";
         try{
             conn = new DBContext().getConnection();
             ps = conn.prepareStatement(query);
             ps.setString(1, ct);
             ps.executeUpdate();
         }catch(Exception e) {
             
         }
     }
    public void updateProductAfOrder(String ct) {
         String query = "Update ProductDetail set CountProduct = CountProduct + Cart.Amount \n" +
                        "from Cart, Orders\n" +
                        "where Cart.Color = ProductDetail.Color\n" +
                        "and Cart.Size = ProductDetail.Size\n" +
                        "and Cart.ProductID = ProductDetail.ProductID\n" +
                        "and Cart.CartID = Orders.CartID\n" +
                        "and Orders.OrderID = ?";
         try{
             conn = new DBContext().getConnection();
             ps = conn.prepareStatement(query);
             ps.setString(1, ct);
             ps.executeUpdate();
         }catch(Exception e) {
             
         }
     }
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        String sex = "MEN";
        List<Product> list = productDAO.getProductSame(1);
        for (Product o : list) {
            System.out.println(o);
        }
       System.out.println(product);
    }
}
