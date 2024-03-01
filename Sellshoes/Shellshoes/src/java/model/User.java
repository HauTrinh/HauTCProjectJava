package model;

import java.io.Serializable;

public class User implements Serializable{
    private int uID;
    private String username;
    private String password;
    private String fullname;
    private boolean isSell;
    private boolean isAdmin;
    private String dob;
    private String phone;
    private String email;

    public User() {
    }

    public User(int uID, String username, String password, String fullname, boolean isSell, boolean isAdmin, String dob, String phone, String email) {
        this.uID = uID;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.isSell = isSell;
        this.isAdmin = isAdmin;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void seFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isIsSell() {
        return isSell;
    }

    public void setIsSell(boolean isSell) {
        this.isSell = isSell;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" + "uID=" + uID + ", username=" + username + ", password=" + password + ", fullname=" + fullname + ", isSell=" + isSell + ", isAdmin=" + isAdmin + ", dob=" + dob + ", phone=" + phone + ", email=" + email + '}';
    }
}
