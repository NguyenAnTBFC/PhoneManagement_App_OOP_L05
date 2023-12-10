/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenAn;
 */
public class SmartPhone {
    protected int idSmartPhone;
    protected String nameSmartPhone;
    protected int quantityInventory;
    protected int price;
    protected String category;
    protected int capacity;
    protected String color;
    
    //constructor
    
    public SmartPhone() {
    }

    public SmartPhone(int idSmartPhone, String nameSmartPhone, int quantityInventory, int price, String category, int capacity, String color) {
        this.idSmartPhone = idSmartPhone;
        this.nameSmartPhone = nameSmartPhone;
        this.quantityInventory = quantityInventory;
        this.price = price;
        this.category = category;
        this.capacity = capacity;
        this.color = color;
    }
    //getter 
    public int getIdSmartPhone() {
        return idSmartPhone;
    }

    public String getNameSmartPhone() {
        return nameSmartPhone;
    }

    public int getQuantityInventory() {
        return quantityInventory;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }
    //setter
    public void setIdSmartPhone(int idSmartPhone) {
        this.idSmartPhone = idSmartPhone;
    }

    public void setNameSmartPhone(String nameSmartPhone) {
        this.nameSmartPhone = nameSmartPhone;
    }

    public void setQuantityInventory(int quantityInventory) {
        this.quantityInventory = quantityInventory;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

// toString

    @Override
    public String toString() {
        return this.idSmartPhone+"-"+this.nameSmartPhone+"-"+this.capacity
                   +"-"+this.color+"-"+this.category+"-"+this.price
                   +"-"+this.quantityInventory; 
    }
}
