/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.SmartPhone;

/**
 *
 * @author NguyenAn;
 */
public interface ProductDAO {
    public List<SmartPhone> getList();
    public int createOrUpdate(SmartPhone smartPhone);
}
