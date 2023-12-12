/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.SmartPhone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

;

/**
 *
 * @author NguyenAn;
 */
public class ProductDAOImpl implements ProductDAO {

    @Override
    public List<SmartPhone> getList() {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "SELECT * FROM SmartPhone";
            List<SmartPhone> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SmartPhone smartPhone = new SmartPhone();
                smartPhone.setIdSmartPhone(rs.getInt("IdSmartPhone"));
                smartPhone.setNameSmartPhone(rs.getString("NameSmartPhone"));
                smartPhone.setCapacity(rs.getInt("Capacity"));
                smartPhone.setColor(rs.getString("Color"));
                smartPhone.setCategory(rs.getString("Category"));
                smartPhone.setPrice(rs.getInt("Price"));
                smartPhone.setQuantityInventory(rs.getInt("QuantityInventor"));
                list.add(smartPhone);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAOImpl();
        System.out.println(productDAO.getList());
    }

    @Override
    public int createOrUpdate(SmartPhone smartPhone) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO SmartPhone (IdSmartPhone, NameSmartPhone, Capacity, Color, Category, Price, QuantityInventor)\n" 
                        +"VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, smartPhone.getIdSmartPhone());
            ps.setString(2, smartPhone.getNameSmartPhone());
            ps.setInt(3, smartPhone.getCapacity());
            ps.setString(4, smartPhone.getColor());
            ps.setString(5, smartPhone.getCategory());
            ps.setInt(6, smartPhone.getPrice());
            ps.setInt(7, smartPhone.getQuantityInventory());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}

