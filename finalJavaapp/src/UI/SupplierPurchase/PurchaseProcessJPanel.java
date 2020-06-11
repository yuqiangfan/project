/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SupplierPurchase;

import Business.Enterprise.NutritionDiningRoomEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Food.Material;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaterialRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class PurchaseProcessJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierEnterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private MaterialRequest request;
    private int flag1=0, flag2=0;
    /**
     * Creates new form TManagerProcessJPanel
     */
    public PurchaseProcessJPanel(JPanel userProcessContainer, UserAccount userAccount,SupplierEnterprise enterprise, Network network, MaterialRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.request = request;
        
        valueLabel.setText(enterprise.getName());
        // display combo items
        materialCBox.removeAllItems();
        for (Material material : enterprise.getMaterialDirectory().getMaterialList()) {
            materialCBox.addItem(material);
        }
        flag1=0; flag2=0;
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
        priceTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 220, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 140, 30));
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 102, -1));

        materialCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        materialCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBoxActionPerformed(evt);
            }
        });
        add(materialCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 104, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        sendJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendJButton.setText("Send");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });
        add(sendJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Price:   $");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 50, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic15.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel5.setPreferredSize(new java.awt.Dimension(800, 626));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PurchaseWorkAreaJPanel mwjp = (PurchaseWorkAreaJPanel) component;
        mwjp.populateRequestTable();
        mwjp.populateProcessRequestTable();
        mwjp.populateInventoryTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void materialCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBoxActionPerformed
        // TODO add your handling code here:
        Material selectedMaterial = (Material) materialCBox.getSelectedItem();
        priceTxt.setText(selectedMaterial.getPrice()+"");
    }//GEN-LAST:event_materialCBoxActionPerformed

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed

        try{Integer.parseInt(quantityTxt.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Material material : enterprise.getMaterialDirectory().getMaterialList()) {
            if(material.getName().equals(materialCBox.getSelectedItem().toString())) {
                // quantity validation
                if(material.getQuantity()-Integer.parseInt(quantityTxt.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, material.getName() +" is insufficient.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                material.setQuantity(material.getQuantity()-Integer.parseInt(quantityTxt.getText()));
            }
        }
        request.setStatus("Completed: "+quantityTxt.getText());
        Date date = new Date();
        request.setResolveDate(date);
        //System.out.println(DateFormat.getDateInstance().format(date));
        
        // Send the material to Gourmet
        NutritionDiningRoomEnterprise ent = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.equals(request.getSenderEnterprise())){
                ent = (NutritionDiningRoomEnterprise) enterprise;
                break;
            }
        }
        if (ent != null){
            for(Material material: ent.getMaterialDirectory().getMaterialList()) {
                if(material.getName().equals(materialCBox.getSelectedItem().toString())) {
                    material.setQuantity(material.getQuantity()+Integer.parseInt(quantityTxt.getText()));
                    flag1=1;
                    break;
                }
            }
                            
            // If the material name does not exist in Gourmet
            if (flag1 == 0) {
                Material sampleMaterial = (Material) materialCBox.getSelectedItem();
                Material newMaterial = ent.getMaterialDirectory().createMaterial();
                newMaterial.setName(sampleMaterial.getName());
                newMaterial.setPrice(sampleMaterial.getPrice());
                newMaterial.setQuantity(Integer.parseInt(quantityTxt.getText()));
            }
        }
        
        // Record item in soldDirectory
        for(Material material: enterprise.getSoldMaterialDirectory().getMaterialList()) {
            if(material.getName().equals(materialCBox.getSelectedItem().toString())) {
                material.setQuantity(material.getQuantity()+Integer.parseInt(quantityTxt.getText()));
                flag2=1;
                break;
            }
        }

        // If the material name does not exist in Gourmet
        if(flag2==0) {
            Material sampleMaterial = (Material) materialCBox.getSelectedItem();
            Material newMaterial = enterprise.getSoldMaterialDirectory().createMaterial();
            newMaterial.setName(sampleMaterial.getName());
            newMaterial.setPrice(sampleMaterial.getPrice());
            newMaterial.setQuantity(Integer.parseInt(quantityTxt.getText()));
        }
        
        JOptionPane.showMessageDialog(null, "Reply and material sent successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sendJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox materialCBox;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton sendJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
