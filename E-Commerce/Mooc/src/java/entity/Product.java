/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
public class Product {
    private String productID;//1
    private String productName;//2
    private String descriptions;//3
    private String sex;//4
    private String imageLink;//5
    private int price;//6
    private int categoryID;//7
    private String categoryName;//8
    private int storeID;//9
    private String storeName;//10
    private int totalProduct;//11
//    ---------------------------------------

    public Product() {
    }

    public Product(String productID, String productName, String descriptions, String sex, String imageLink, int price, int categoryID, String categoryName, int storeID, String storeName, int totalProduct) {
        this.productID = productID;
        this.productName = productName;
        this.descriptions = descriptions;
        this.sex = sex;
        this.imageLink = imageLink;
        this.price = price;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.storeID = storeID;
        this.storeName = storeName;
        this.totalProduct = totalProduct;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", descriptions=" + descriptions + ", sex=" + sex + ", imageLink=" + imageLink + ", price=" + price + ", categoryID=" + categoryID + ", categoryName=" + categoryName + ", storeID=" + storeID + ", storeName=" + storeName + ", totalProduct=" + totalProduct + '}';
    }
    
//    -----------------------------------
    public String getPriceWithDot() {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
    }
}