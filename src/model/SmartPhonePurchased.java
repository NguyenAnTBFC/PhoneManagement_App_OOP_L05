/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenAn;
 */
public class SmartPhonePurchased extends SmartPhone{
    private int quantityPurchased;
    
    //constructor
    public SmartPhonePurchased() {
    }
    
    public SmartPhonePurchased(int quantityPurchased, int idSmartPhone, String nameSmartPhone, int quantityInventory, int price, String category, int capacity, String color) {
        super(idSmartPhone, nameSmartPhone, quantityInventory, price, category, capacity, color);
        this.quantityPurchased = quantityPurchased;
    }

    //getter
    public int getQuantityPurchased() {
        return quantityPurchased;
    }
    //setter
    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }
    
    
    
}

