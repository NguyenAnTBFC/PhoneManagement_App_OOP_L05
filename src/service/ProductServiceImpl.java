/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import java.util.List;
import model.SmartPhone;

/**
 *
 * @author NguyenAn;
 */
public class ProductServiceImpl implements ProductService{
    private ProductDAO productDAO = null;
    public ProductServiceImpl(){
        productDAO = new ProductDAOImpl();
    }

    @Override
    public List<SmartPhone> getList() {
        return productDAO.getList();
    }

    @Override
    public int createOrUpdate(SmartPhone smartPhone) {
        return productDAO.createOrUpdate(smartPhone);
    }
}
