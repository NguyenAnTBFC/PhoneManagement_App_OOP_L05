/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Comparator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.RowSorterEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.SmartPhone;
import service.ProductService;
import service.ProductServiceImpl;
import utility.ClassTableModel;

/**
 *
 * @author NguyenAn;
 */
public class ProductController {

    private JPanel jpnView;
    private JButton jbtAdd;
    private JTextField jtfSearch;

    private ProductService productService = null;
    private String[] listColumn = {"STT", "Mã sản phẩm", "Tên sản phẩm", "Dung lượng", "Màu", "Hãng sản xuất", "Giá", "Số lượng có sẵn"};

    private TableRowSorter<TableModel> rowSorter = null;

    public ProductController(JPanel jpnView, JButton jbtAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.jbtAdd = jbtAdd;
        this.jtfSearch = jtfSearch;
        this.productService = new ProductServiceImpl();
    }

    public void setDataToTable() {
        List<SmartPhone> listItem = productService.getList();

        DefaultTableModel model = new ClassTableModel().setTableProduct(listItem, listColumn);
        JTable table = new JTable(model);
        
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        Comparator<Integer> integerComparator = Comparator.naturalOrder();
        rowSorter.setComparator(0, integerComparator);
        rowSorter.setComparator(3, integerComparator);
        rowSorter.setComparator(6, integerComparator);
        rowSorter.setComparator(7, integerComparator);
////edit
//        table.getRowSorter().addRowSorterListener(e -> {
//            if (e.getType() == RowSorterEvent.Type.SORT_ORDER_CHANGED) {
//                int rowCount = table.getRowCount();
//                for (int i = rowCount-1; i >=0; i--) {
//                    table.setValueAt(i + 1, i, 0); // Cột STT ở cột 0
//                }
//            }
//        });
//
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }

        });

        //set kích thước
        table.getColumnModel().getColumn(0).setMinWidth(50);
        table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        //căn giữa cột
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);

        table.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }

}
