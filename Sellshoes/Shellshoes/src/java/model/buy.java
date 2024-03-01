/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class buy {
    private String image;
    private String nameProduct;
    private double price;
    private int quality;
    private int pID;
    private int sizeProduct;
    private int sizeId;
    private boolean status;

    public buy() {
    }

    public buy(String image, String nameProduct, double price, int quality, int pID, int sizeProduct, int sizeId, boolean status) {
        this.image = image;
        this.nameProduct = nameProduct;
        this.price = price;
        this.pID = pID;
        this.sizeProduct = sizeProduct;
        this.sizeId = sizeId;
        this.status = status;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "buy{" + "image=" + image + ", nameProduct=" + nameProduct + ", price=" + price + ", pID=" + pID + ", sizeProduct=" + sizeProduct + ", sizeId=" + sizeId + ", status=" + status + '}';
    }

}
