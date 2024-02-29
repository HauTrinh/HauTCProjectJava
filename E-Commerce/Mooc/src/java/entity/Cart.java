/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Cart {
    private  int cartID;
    private int customerID;
    private int storeID;
    private String productID;
    private String size;
    private String color;
    private int amount;
    private int stauts;

    public Cart() {
    }

    public Cart(int cartID, int customerID, int storeID, String productID, String size, String color, int amount, int stauts) {
        this.cartID = cartID;
        this.customerID = customerID;
        this.storeID = storeID;
        this.productID = productID;
        this.size = size;
        this.color = color;
        this.amount = amount;
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

   
}
