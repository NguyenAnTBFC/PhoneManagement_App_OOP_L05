/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenAn;
 */
public class Client {
    private int idClient;
    private String nameClient;
    private String phoneNumber;
    
    //construcor

    public Client() {
    }

    public Client(int idClient, String nameClient, String phoneNumber) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.phoneNumber = phoneNumber;
    }
    //getter
    public int getIdClient() {
        return idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //setter
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setNumberPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
