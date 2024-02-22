/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author DELL
 */
public class Facility {
    private String svID;
    private String svName;
    private double svArea;
    private double svPrice;
    private int svPeople;
    private int svType;
    private int svFloor;

    public Facility(String svID, String svName, double svArea, double svPrice, int svPeople, int svType, int svFloor) {
        this.svID = svID;
        this.svName = svName;
        this.svArea = svArea;
        this.svPrice = svPrice;
        this.svPeople = svPeople;
        this.svType = svType;
        this.svFloor = svFloor;
    }

    public String getSvID() {
        return svID;
    }

    public void setSvID(String svID) {
        this.svID = svID;
    }

    public String getSvName() {
        return svName;
    }

    public void setSvName(String svName) {
        this.svName = svName;
    }

    public double getSvArea() {
        return svArea;
    }

    public void setSvArea(double svArea) {
        this.svArea = svArea;
    }

    public double getSvPrice() {
        return svPrice;
    }

    public void setSvPrice(double svPrice) {
        this.svPrice = svPrice;
    }

    public int getSvPeople() {
        return svPeople;
    }

    public void setSvPeople(int svPeople) {
        this.svPeople = svPeople;
    }

    public int getSvType() {
        return svType;
    }

    public void setSvType(int svType) {
        this.svType = svType;
    }

    public int getSvFloor() {
        return svFloor;
    }

    public void setSvFloor(int svFloor) {
        this.svFloor = svFloor;
    }

    @Override
    public String toString() {
        return (String.format("| %-12s | %-12s | %-12s | %-12s | %-20s | %-12s | %-12s |",svID,svName,svArea,svPrice,svPeople,svType,svFloor));
    }


    
}
