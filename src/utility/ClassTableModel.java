/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.SmartPhone;

/**
 *
 * @author NguyenAn;
 */
public class ClassTableModel {
    public DefaultTableModel setTableProduct (List<SmartPhone> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = new Object[columns];
        int rows = listItem.size();
        if(rows > 0){
            for(int i = 0; i< rows; i++){
                SmartPhone smartPhone = listItem.get(i);
                obj[0] = i+1;
                obj[1] = smartPhone.getIdSmartPhone();
                obj[2] = smartPhone.getNameSmartPhone();
                obj[3] = smartPhone.getCapacity();
                obj[4] = smartPhone.getColor();
                obj[5] = smartPhone.getCategory();
                obj[6] = smartPhone.getPrice();
                obj[7] = smartPhone.getQuantityInventory();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
