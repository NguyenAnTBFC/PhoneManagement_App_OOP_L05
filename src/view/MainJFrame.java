
package view;

import bean.CategoryBean;
import controller.ScreenSwitchController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NguyenAn;
 */
public class MainJFrame extends javax.swing.JFrame {

    
    public MainJFrame() {
        initComponents();
        this.setTitle("Quản Lý Bán Điện Thoại");
        this.setSize(1045, 601);
        ScreenSwitchController controller = new ScreenSwitchController(jpnView);
        controller.setView(jpnHomePage, jlbHomePage);
        
        List<CategoryBean> listItem = new ArrayList<>();
        listItem.add(new CategoryBean("TrangChu", jpnHomePage, jlbHomePage));
        listItem.add(new CategoryBean("SanPham", jpnProduct, jlbProduct));
        listItem.add(new CategoryBean("HoaDon", jpnBill, jlbBill));
        listItem.add(new CategoryBean("KhachHang", jpnClient, jlbClient));
        listItem.add(new CategoryBean("DangXuat", jpnLogout, jlbLogout));
        
        controller.setEvent(listItem);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnInfor = new javax.swing.JPanel();
        jlbInfor = new javax.swing.JLabel();
        jpnHomePage = new javax.swing.JPanel();
        jlbHomePage = new javax.swing.JLabel();
        jpnProduct = new javax.swing.JPanel();
        jlbProduct = new javax.swing.JLabel();
        jpnBill = new javax.swing.JPanel();
        jlbBill = new javax.swing.JLabel();
        jpnClient = new javax.swing.JPanel();
        jlbClient = new javax.swing.JLabel();
        jpnLogout = new javax.swing.JPanel();
        jlbLogout = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(0, 0, 0));

        jpnInfor.setBackground(new java.awt.Color(255, 102, 0));

        jlbInfor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbInfor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbInfor.setText("Xin Chào ADMIN");

        javax.swing.GroupLayout jpnInforLayout = new javax.swing.GroupLayout(jpnInfor);
        jpnInfor.setLayout(jpnInforLayout);
        jpnInforLayout.setHorizontalGroup(
            jpnInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbInfor, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        jpnInforLayout.setVerticalGroup(
            jpnInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInforLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbInfor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jpnHomePage.setBackground(new java.awt.Color(0, 153, 255));

        jlbHomePage.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbHomePage.setForeground(new java.awt.Color(255, 255, 255));
        jlbHomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHomePage.setText("Trang Chủ");

        javax.swing.GroupLayout jpnHomePageLayout = new javax.swing.GroupLayout(jpnHomePage);
        jpnHomePage.setLayout(jpnHomePageLayout);
        jpnHomePageLayout.setHorizontalGroup(
            jpnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHomePageLayout.setVerticalGroup(
            jpnHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpnProduct.setBackground(new java.awt.Color(0, 0, 255));

        jlbProduct.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbProduct.setForeground(new java.awt.Color(255, 255, 255));
        jlbProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbProduct.setText("Sản Phẩm");

        javax.swing.GroupLayout jpnProductLayout = new javax.swing.GroupLayout(jpnProduct);
        jpnProduct.setLayout(jpnProductLayout);
        jpnProductLayout.setHorizontalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnProductLayout.setVerticalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpnBill.setBackground(new java.awt.Color(0, 153, 255));

        jlbBill.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbBill.setForeground(new java.awt.Color(255, 255, 255));
        jlbBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBill.setText("Hóa Đơn");

        javax.swing.GroupLayout jpnBillLayout = new javax.swing.GroupLayout(jpnBill);
        jpnBill.setLayout(jpnBillLayout);
        jpnBillLayout.setHorizontalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnBillLayout.setVerticalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBill, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpnClient.setBackground(new java.awt.Color(0, 0, 204));

        jlbClient.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbClient.setForeground(new java.awt.Color(255, 255, 255));
        jlbClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbClient.setText("Khách Hàng");

        javax.swing.GroupLayout jpnClientLayout = new javax.swing.GroupLayout(jpnClient);
        jpnClient.setLayout(jpnClientLayout);
        jpnClientLayout.setHorizontalGroup(
            jpnClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnClientLayout.setVerticalGroup(
            jpnClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnClientLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jlbClient, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpnLogout.setBackground(new java.awt.Color(0, 153, 255));

        jlbLogout.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jlbLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlbLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogout.setText("Đăng Xuất");

        javax.swing.GroupLayout jpnLogoutLayout = new javax.swing.GroupLayout(jpnLogout);
        jpnLogout.setLayout(jpnLogoutLayout);
        jpnLogoutLayout.setHorizontalGroup(
            jpnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnLogoutLayout.setVerticalGroup(
            jpnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLogoutLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jpnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnView.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbBill;
    private javax.swing.JLabel jlbClient;
    private javax.swing.JLabel jlbHomePage;
    private javax.swing.JLabel jlbInfor;
    private javax.swing.JLabel jlbLogout;
    private javax.swing.JLabel jlbProduct;
    private javax.swing.JPanel jpnBill;
    private javax.swing.JPanel jpnClient;
    private javax.swing.JPanel jpnHomePage;
    private javax.swing.JPanel jpnInfor;
    private javax.swing.JPanel jpnLogout;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnProduct;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
