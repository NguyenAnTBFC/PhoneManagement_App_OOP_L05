/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SmartPhone;

/**
 *
 * @author NguyenAn;
 */
public interface ProductService {
    public List<SmartPhone> getList();
    public int createOrUpdate(SmartPhone smartPhone);
}
