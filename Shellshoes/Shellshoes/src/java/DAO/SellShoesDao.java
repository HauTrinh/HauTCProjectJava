/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Connect.DBUtils;
import model.Cart;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Brand;
import model.Product;
import model.Size;
import model.User;

public class SellShoesDao {
    private Connection con = null;
    private PreparedStatement stm = null;
    private ResultSet rs = null;
     public User checkLogin (String username, String password){
        
        try{
            con = DBUtils.makeConnection();
            if(con != null) {
                String sql = "select * from UserShoes where uName=? and pass=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if(rs.next()) {
                    return new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getBoolean(5),
                    rs.getBoolean(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9));
                }
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
      public User checkRegister (String username){
        
        try{
            con = DBUtils.makeConnection();
            if(con != null) {
                String sql = "select * from UserShoes where uName=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                rs = stm.executeQuery();
                if(rs.next()) {
                    return new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getBoolean(5),
                    rs.getBoolean(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9));
                }
            }
        }catch(Exception e){
            
        }
        return null;
    }
      public void deleteProduct(int pid){
        String query = "delete from Product where pID=?";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, pid);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
      public void deleteUser(int uID){
        String query = "delete from UserShoes where UserID=?";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, uID);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
//      public void deleteCart(int uID){
//        String query = "delete from Cart where Cart.UserID = ?";
//        try {
//            con = new DBUtils().makeConnection();
//            stm = con.prepareStatement(query);
//            stm.setInt(1, uID);
//            stm.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
     public void addUser(String username, String password, String fullname, boolean isSell, boolean isAdmin, String dob, String phone, String email){
        String query = "insert into UserShoes values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, fullname);
            stm.setBoolean(4, isSell);
            stm.setBoolean(5, isAdmin);
            stm.setString(6, dob);
            stm.setString(7, phone);
            stm.setString(8, email);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
//     public void amount (int soluong){
//         String query ="insert into amount value(?)";
//         try{
//             con = new DBUtils().makeConnection();
//             stm = con.prepareStatement(query);
//             stm.setInt(1, soluong);
//             stm.executeUpdate();
//         }catch(Exception e) {
//             
//         }
//     }
//     
//     public void Cart(int pid, int sid, int userid){
//        String query = "insert into Cart values (?, ?, ?)";
//        try {
//            con = new DBUtils().makeConnection();
//            stm = con.prepareStatement(query);
//            stm.setInt(1, pid);
//            stm.setInt(2, pid);
//            stm.setInt(3, pid);
//            stm.executeUpdate();
//        } catch (Exception e) {
//        }
//    }
     public void Product(String pName, String imge, int number, double price, int bID){
        String query = "insert into Product values (?, ?, ?, ?, ?)";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, pName);
            stm.setString(2, imge);
            stm.setInt(3, number);
            stm.setDouble(4, price);
            stm.setInt(5, bID);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
     public List<Product> getABrand(String bName){
        List<Product> list = new ArrayList<Product>();
        String query = "select * from Product\n" +
                            "where bID = ?";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, bName);
            rs = stm.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getDouble(5),
                rs.getInt(6)));
            }
            System.out.println(list);
        } catch (Exception e) {
        }
        return list;
    } 
    public List<User> getUser(){
        List<User> list = new ArrayList<User>();
        String query = "select * from UserShoes";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            while(rs.next()){
                    list.add(new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getBoolean(5),
                    rs.getBoolean(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public void updateProduct(int pID, String pName, String imge, int number, double price, int bID){
        String query = "update Product set  pName = ?, imge = ?, Number = ?, price = ?, bID = ? where pID = ?"; 
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, pName);
            stm.setString(2, imge);
            stm.setInt(3, number);
            stm.setDouble(4, price);
            stm.setInt(5, bID);
            stm.setInt(6, pID);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void UpdateUser(int uID, String username, String password, String fullname, boolean isSell, boolean isAdmin, String dob, String phone, String email){
        String query = "update UserShoes set  uName = ?, pass = ?, fName = ?, isSell = ?, isAdmin = ?, dob = ?, phone = ?, email = ? where UserID = ?";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, fullname);
            stm.setBoolean(4, isSell);
            stm.setBoolean(5, isAdmin);
            stm.setString(6, dob);
            stm.setString(7, phone);
            stm.setString(8, email);
            stm.setInt(9, uID);
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Product getAProduct(int pID){
        String query = "select * from Product where pID = ?";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, pID);
            rs = stm.executeQuery();
            while(rs.next()){
                return new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getDouble(5),
                rs.getInt(6));
            }

        } catch (Exception e) {
        }
        return null;
    }
    public User getUserID(int uID){
        String query = "select * from UserShoes where UserID = ?";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, uID);
            rs = stm.executeQuery();
            while(rs.next()){
                    return new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getBoolean(5),
                    rs.getBoolean(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9));
            }
        }catch(Exception e){
            
        }
        return null;
    }
    public Product getNewProduc(){
        String query = "select top 1 * from Product\n" +
                        "order by pID desc";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            while(rs.next()){
                return new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getDouble(5),
                rs.getInt(6));
            }

        } catch (Exception e) {
        }
        return null;
    }
    public List<Size> getSize() {
        List<Size> list = new ArrayList<Size>();
        String query = "select * from Size";
        try{
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            while(rs.next()) {
                list.add(new Size(rs.getInt(1),
                rs.getInt(2)));
            }
        } catch (Exception ex) {
            
        }
        return list;
    }
     public List<Brand> getAllbrand(){
        List<Brand> list = new ArrayList<Brand>();
        String query = "select * from BrandTest";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            while(rs.next()){
                list.add(new Brand(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<Cart> getAllCart(){
         List<Cart> list = new ArrayList<>();
         String query= "select p.imge, p.pName, p.price, c.quality, p.pID, s.sNumber, s.sID, u.uName, u.phone\n" +
                        "from Product as p, Cart as c, Size as s, UserShoes as u\n" +
                        "where c.UserID = u.UserID and c.pID = p.pID and s.sID = c.sID";
        Cart cartModel;
		ArrayList<Cart> cartModelList = new ArrayList<Cart>();

		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				cartModel = new Cart();
				cartModel.setImage(rs.getString(1));
				cartModel.setNameProduct(rs.getString(2));
				cartModel.setPrice(rs.getInt(3) * rs.getInt(4));
				cartModel.setpID(rs.getInt(5));
				cartModel.setSizeProduct(rs.getInt(6));
				cartModel.setSizeId(rs.getInt(7));
                                cartModel.setuName(rs.getString(8));
                                cartModel.setPhone(rs.getString(9));
                                cartModel.setAmount(rs.getInt(4));
				cartModelList.add(cartModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartModelList;
     }
      public List<Product> getProduct(){
        List<Product> list = new ArrayList<Product>();
        String query = "select * from Product";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getDouble(5),
                rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
      
      public List<Product> getSearch(String txtSearch){
        List<Product> list = new ArrayList<Product>();
        String query = "select * from Product\n" +
                        "where pName like ?";
        try {
            con = new DBUtils().makeConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, "%"+txtSearch+"%");
            rs = stm.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getDouble(5),
                rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public void insertCart(int userId, int pId, int sId) {
                String query = "Insert into Cart values (?,?,?,?) ";
		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(query);
			stm.setInt(1, pId);
			stm.setInt(2, sId);
			stm.setInt(3, userId);
			stm.setInt(4, 1);
			stm.executeUpdate();
		} catch (Exception e) {
		}
	}
//        public void insertBuy(int userId, int pId, int sId) {
//                String query = "Insert into Cart values (?,?,?,?) ";
//		try {
//			con = new DBUtils().makeConnection();
//			stm = con.prepareStatement(query);
//			stm.setInt(1, pId);
//			stm.setInt(2, sId);
//			stm.setInt(3, userId);
//			stm.setInt(4, 1);
//			stm.executeUpdate();
//		} catch (Exception e) {
//		}
//	}
	public int updateCart(int userId, int pId, int sId, int cID) {

		String querygetQualityProductIdInCart = "select quality from Cart where cID = ?";
		int quality = 0;
		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(querygetQualityProductIdInCart);
			stm.setInt(1, cID);
			rs = stm.executeQuery();
			if (rs.next()) {
				quality = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		String query = "UPDATE Cart SET quality = ? WHERE cID = ?";
		int flagUpdate = 0;
		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(query);
			stm.setInt(1, quality + 1);
			stm.setInt(2, cID);
			flagUpdate = stm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flagUpdate;
	}

	public int getNumberOfProduct(int pId) {

		String querygetNumberOfProduct = "select Number from product where pID = ?";
		int numberOfProduct = 0;

		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(querygetNumberOfProduct);
			stm.setInt(1, pId);
			rs = stm.executeQuery();
			if (rs.next()) {
				numberOfProduct = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return numberOfProduct;
	}

	public int checkProductIsAvaiableInCart(int userId, int pId, int sId) {

		String querygetNumberOfProduct = "select cID from Cart where pID = ? and sId = ? and UserID = ?";
		int cID = 0;

		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(querygetNumberOfProduct);
			stm.setInt(1, pId);
			stm.setInt(2, sId);
			stm.setInt(3, userId);
			rs = stm.executeQuery();
			if (rs.next()) {
				cID = rs.getInt("cID");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cID;
	}

	public ArrayList<Cart> getProductInCart(int userId) {

		String queryGetProductInCart = "select p.imge, p.pName, p.price, c.quality, p.pID, s.sNumber, s.sID from Product as p, Cart as c, Size as s where c.UserID = ? and c.pID = p.pID and s.sID = c.sID";
		Cart cartModel;
		ArrayList<Cart> cartModelList = new ArrayList<Cart>();

		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(queryGetProductInCart);
			stm.setInt(1, userId);
			rs = stm.executeQuery();
			while (rs.next()) {
				cartModel = new Cart();
				cartModel.setImage(rs.getString(1));
				cartModel.setNameProduct(rs.getString(2));
				cartModel.setPrice(rs.getInt(3) * rs.getInt(4));
				cartModel.setpID(rs.getInt(5));
				cartModel.setSizeProduct(rs.getInt(6));
				cartModel.setSizeId(rs.getInt(7));
                                cartModel.setAmount(rs.getInt(4));
				cartModelList.add(cartModel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartModelList;
	}

	public void deleteCart(int pID, int sizeId, int userId) throws Exception {
		String queryDeleteCart = "DELETE FROM Cart WHERE pID=? and sID=?  and  UserID=?";
		try {
			con = new DBUtils().makeConnection();
			stm = con.prepareStatement(queryDeleteCart);
			stm.setInt(1, pID);
			stm.setInt(2, sizeId);
			stm.setInt(3, userId);
			stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
	}
        public void addBuy (int pID, int sID, int userID, int aID, boolean status) {
            String query= "inser int Buyed values(?, ?, ?, ?, ?)";
            try{
                con = new DBUtils().makeConnection();
                stm = con.prepareStatement(query);
                stm.setInt(1, pID);
                stm.setInt(2, sID);
                stm.setInt(3, userID);
                stm.setInt(4, aID);
                stm.setBoolean(5, status);
                stm.executeUpdate();
            }catch(Exception e) {
                
            }
        }
}
