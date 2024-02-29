/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Carts {
     private  int cartID;
    private int customerID;
    private int storeID;
    private String productID;
    private String size;
    private String color;
    private int amount;
    private int stauts;
    private String productName;
    private String imgLink;
    private double price;
    private double total;

    public Carts() {
    }

    public Carts(int cartID, int customerID, int storeID, String productID, String size, String color, int amount, int stauts, String productName, String imgLink, double price, double total) {
        this.cartID = cartID;
        this.customerID = customerID;
        this.storeID = storeID;
        this.productID = productID;
        this.size = size;
        this.color = color;
        this.amount = amount;
        this.stauts = stauts;
        this.productName = productName;
        this.imgLink = imgLink;
        this.price = price;
        this.total = total;
    }
    public Carts(int stauts, int cartID) {
        this.cartID = cartID;
        this.stauts = stauts;
    }
    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStauts() {
        return stauts;
    }

    public void setStauts(int stauts) {
        this.stauts = stauts;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public String getPriceWithDot() {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
    }

    @Override
    public String toString() {
        return "Carts{" + "cartID=" + cartID + ", customerID=" + customerID + ", storeID=" + storeID + ", productID=" + productID + ", size=" + size + ", color=" + color + ", amount=" + amount + ", stauts=" + stauts + ", productName=" + productName + ", imgLink=" + imgLink + ", price=" + price + ", total=" + total + '}';
    }
    
}
