/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Size {
    private int sID;
    private int sNumber;

    public Size() {
    }

    public Size(int sID, int sNumber) {
        this.sID = sID;
        this.sNumber = sNumber;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Size{" + "sID=" + sID + ", sNumber=" + sNumber + '}';
    }
    
}
