package entity;

public class Store {

    private int sellerID;
    private int storeID;
    private String storeName;
    private String description;
    private String linkImg;

    public Store() {
    }

    public Store(int sellerID, int storeID, String storeName, String description, String linkImg) {
        this.sellerID = sellerID;
        this.storeID = storeID;
        this.storeName = storeName;
        this.description = description;
        this.linkImg = linkImg;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    @Override
    public String toString() {
        return "Store{" + "sellerID=" + sellerID + ", storeID=" + storeID + ", storeName=" + storeName + ", description=" + description + ", linkImg=" + linkImg + '}';
    }



}
