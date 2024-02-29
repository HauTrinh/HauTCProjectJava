/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class amount {
    private int aID;
    private int soluong;

    public amount() {
    }

    public amount(int aID, int soluong) {
        this.aID = aID;
        this.soluong = soluong;
    }

    public int getaID() {
        return aID;
    }

    public void setaID(int aID) {
        this.aID = aID;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "amount{" + "aID=" + aID + ", soluong=" + soluong + '}';
    }
    
}
