/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OnlineAdvertising;

import Business.Enterprise.OnlineStoreEnterprise;
import Business.Food.Dish;
import Business.Food.Diet;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhythonNo1
 */
public class AdvertisingAccoountJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OnlineStoreEnterprise enterprise;
    private UserAccount userAccount;
    private double totalProfit = 0;
    /**
     * Creates new form RMakingWorkAreaJPanel
     */
    public AdvertisingAccoountJPanel(JPanel userProcessContainer, UserAccount account, OnlineStoreEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        valueLabel.setText(enterprise.getName());
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)profitJTable.getModel();
        model.setRowCount(0);
      
        for (Dish hair: enterprise.getDishDirectory().getDishList()) {
            if(hair.getQuantity()!=0 && hair.getType().equals("fake")) {
                Object[] row = new Object[4];
                row[0] = hair;
                row[1] = hair.getQuantity();
                row[2] = hair.getPrice();
                row[3] = hair.getQuantity()*hair.getPrice();
            
                model.addRow(row);
                totalProfit += hair.getQuantity()*hair.getPrice();
            }
            
            if(hair.getQuantity()!=0 && hair.getType().equals("real")) {
                Object[] row = new Object[4];
                row[0] = hair;
                row[1] = hair.getQuantity();
                row[2] = hair.getPrice()*(-1);
                row[3] = hair.getQuantity()*hair.getPrice()*(-1);
            
                model.addRow(row);
                totalProfit += hair.getQuantity()*hair.getPrice()*(-1);
            }
        }     
        totalProfitJTextField.setText(String.format("%.2f",totalProfit)); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalProfitJTextField = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        profitJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalProfitJTextField.setEditable(false);
        add(totalProfitJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 314, 76, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Company Account");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 80, 189, 30));

        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 370, -1, -1));

        profitJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Unit Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(profitJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 116, -1, 180));

        jLabel1.setText("Total Profit:   $");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 317, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 142, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 43, 130, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic14.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel10.setMinimumSize(new java.awt.Dimension(500, 629));
        jLabel10.setPreferredSize(new java.awt.Dimension(500, 626));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -70, 840, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable profitJTable;
    private javax.swing.JTextField totalProfitJTextField;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
