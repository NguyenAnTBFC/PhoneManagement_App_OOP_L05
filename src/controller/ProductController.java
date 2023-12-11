/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.SmartPhone;
import service.ProductService;
import service.ProductServiceImpl;

/**
 *
 * @author NguyenAn;
 */
public class ProductController {

    private JButton btnSubmit;
    private JTextField jtfIdProduct;
    private JTextField jtfNameProduct;
    private JTextField jtfColor;
    private JTextField jtfPrice;
    private JTextField jtfQuantityInventory;
    private JComboBox jcbbCategory;
    private JComboBox jcbbCapacity;
    private JLabel jlbMsg;
    
    private SmartPhone smartPhone = null;
    
    private ProductService productService = null;
    
    public ProductController(JButton btnSubmit, JTextField jtfIdProduct, JTextField jtfNameProduct,JTextField jtfColor,
            JTextField jtfPrice, JTextField jtfQuantityInventory,JComboBox jcbbCapacity,JComboBox jcbbCategory,JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfIdProduct = jtfIdProduct;
        this.jtfNameProduct = jtfNameProduct;
        this.jtfColor = jtfColor;
        this.jtfPrice = jtfPrice;
        this.jtfQuantityInventory = jtfQuantityInventory;
        this.jcbbCapacity = jcbbCapacity;
        this.jcbbCategory = jcbbCategory;
        this.jlbMsg = jlbMsg;
        
        this.productService = new ProductServiceImpl();
    }

    

    public void setView(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
        jtfIdProduct.setText((smartPhone.getIdSmartPhone()+""));
        jtfNameProduct.setText(smartPhone.getNameSmartPhone());
        jtfColor.setText(smartPhone.getColor());
        jtfPrice.setText((smartPhone.getPrice()+""));
        jtfQuantityInventory.setText((smartPhone.getQuantityInventory()+""));
        jcbbCapacity.setSelectedItem(smartPhone.getCapacity()+"");
        jcbbCategory.setSelectedItem(smartPhone.getCategory()+"");
    }
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                //case enter ID same
                if(jtfNameProduct.getText().length() == 0 || jtfColor.getText().length() == 0 ){
//                        || ((String)jtfIdProduct.getText()).length() == 0 || ((String)jtfPrice.getText()).length() == 0
//                        || ((String)jtfQuantityInventory.getText()).length() == 0){
                    jlbMsg.setText("Vui lòng nhập giá trị bắt buộc!");
                }else{
                    smartPhone.setIdSmartPhone(Integer.parseInt(jtfIdProduct.getText()));
                    smartPhone.setNameSmartPhone(jtfNameProduct.getText());
                    System.out.println(jcbbCapacity.getSelectedItem().toString());
                    System.out.println(Integer.parseInt(jcbbCapacity.getSelectedItem().toString()));
                    smartPhone.setCapacity(Integer.parseInt(jcbbCapacity.getSelectedItem().toString()));
                    smartPhone.setColor(jtfColor.getText());
                    smartPhone.setCategory((String) jcbbCategory.getSelectedItem());
                    smartPhone.setPrice(Integer.parseInt(jtfPrice.getText()));
                    smartPhone.setQuantityInventory(Integer.parseInt(jtfQuantityInventory.getText()));
                    productService.createOrUpdate(smartPhone);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100,221,23));
            }
            
        });
    }
}
