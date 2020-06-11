/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SupplierPurchase;

import Business.Enterprise.SupplierEnterprise;
import Business.Food.Material;
import Business.Organization.Organization;
import Business.Organization.SupplierPurchaseOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaterialRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.text.DateFormat;

/**
 *
 * @author PhythonNo1
 */
public class PurchaseRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form TManagerRequestJPanel
     */
    public PurchaseRequestJPanel(JPanel userProcessContainer, UserAccount userAccount,SupplierEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
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

        quantityTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        requestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        materialCBox = new javax.swing.JComboBox();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 102, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 40));

        requestJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        requestJButton.setText("Request Material");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });
        add(requestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 190, 40));

        enterpriseLabel.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 30));

        materialCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        materialCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBoxActionPerformed(evt);
            }
        });
        add(materialCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 104, -1));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 290, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic15.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel6.setPreferredSize(new java.awt.Dimension(800, 626));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PurchaseWorkAreaJPanel mwjp = (PurchaseWorkAreaJPanel) component;
        mwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed

        try{Integer.parseInt(quantityTxt.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Material material = (Material)materialCBox.getSelectedItem();
        int quantity = Integer.parseInt(quantityTxt.getText());

        MaterialRequest request = new MaterialRequest();
        request.setMaterial(material);
        request.setQuantity(quantity);
        request.setSender(userAccount);
        request.setSenderEnterprise(enterprise);
        //request.setSenderOrganization(organization);
        request.setStatus("Sent");
        Date date = new Date();
        request.setRequestDate(date);
        System.out.println(DateFormat.getDateInstance().format(date));


        Organization org = null;
        //for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof SupplierPurchaseOrganization){
                    org = organization;
                    break;
                }
            }
        //}
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }       
        
        JOptionPane.showMessageDialog(null, "Request sent successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_requestJButtonActionPerformed

    private void materialCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialCBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox materialCBox;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton requestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}