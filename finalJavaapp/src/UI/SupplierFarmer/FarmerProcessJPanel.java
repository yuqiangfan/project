/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SupplierFarmer;

import Business.Enterprise.SupplierEnterprise;
import Business.Food.Material;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaterialRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class FarmerProcessJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierEnterprise enterprise;
    private MaterialRequest request;
    private UserAccount userAccount;
    /**
     * Creates new form FarmerProcessJPanel
     */
    public FarmerProcessJPanel(JPanel userProcessContainer, UserAccount userAccount,SupplierEnterprise enterprise, MaterialRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.request = request;
        this.userAccount = userAccount;

        valueLabel.setText(enterprise.getName());
        // display combo items
        materialCBox.removeAllItems();
        for (Material material : enterprise.getMaterialDirectory().getMaterialList()) {
            materialCBox.addItem(material);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        quantityTxt = new javax.swing.JTextField();
        materialCBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sendJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 142, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 130, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 102, -1));

        materialCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        materialCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBoxActionPerformed(evt);
            }
        });
        add(materialCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 104, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        sendJButton.setText("Plant and Produce");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });
        add(sendJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic12.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 626));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel pwjp = (FarmerWorkAreaJPanel) component;
        pwjp.populateProcessRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void materialCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialCBoxActionPerformed

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed

        try{Integer.parseInt(quantityTxt.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        request.setActualQuantity(Integer.parseInt(quantityTxt.getText()));
        request.setStatus("Completed: "+request.getActualQuantity());
         Date date = new Date();
        request.setResolveDate(date);
        
        // Add materials to inventory
        Material materialSelected = (Material)materialCBox.getSelectedItem();
        for(Material material : enterprise.getMaterialDirectory().getMaterialList()) {
            if(material.getName().equals(materialSelected.getName())) {
                material.setQuantity(material.getQuantity()+request.getActualQuantity());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Material produced and reply sent successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sendJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox materialCBox;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton sendJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
