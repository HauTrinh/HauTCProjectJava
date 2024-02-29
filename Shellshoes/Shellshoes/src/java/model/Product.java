/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Product {
    private int pID;
    private String pName;
    private String imge;
    private int number;
    private double price;
    private int bID;

    public Product() {
    }

    public Product(int pID, String pName, String imge, int number, double price, int bID) {
        this.pID = pID;
        this.pName = pName;
        this.imge = imge;
        this.number = number;
        this.price = price;
        this.bID = bID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getImge() {
        return imge;
    }

    public void setImg(String imge) {
        this.imge = imge;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    @Override
    public String toString() {
        return "Product{" + "pID=" + pID + ", pName=" + pName + ", img=" + imge + ", number=" + number + ", price=" + price + ", bID=" + bID + '}';
    }
    
}
