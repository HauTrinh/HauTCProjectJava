/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Cart {
    private String image;
    private String nameProduct;
    private double price;
    private int pID;
    private int sizeProduct;
    private int sizeId;
    private String uName;
    private String phone;
    private int amount;

    public Cart() {
    }

    public Cart(String image, String nameProduct, double price, int pID, int sizeProduct, int sizeId, String uName, String phone, int amount) {
        this.image = image;
        this.nameProduct = nameProduct;
        this.price = price;
        this.pID = pID;
        this.sizeProduct = sizeProduct;
        this.sizeId = sizeId;
        this.uName = uName;
        this.phone = phone;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
 
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getSizeProduct() {
        return sizeProduct;
    }

    public void setSizeProduct(int sizeProduct) {
        this.sizeProduct = sizeProduct;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public String toString() {
        return "Cart{" + "image=" + image + ", nameProduct=" + nameProduct + ", price=" + price + ", pID=" + pID + ", sizeProduct=" + sizeProduct + ", sizeId=" + sizeId + '}';
    }
}
