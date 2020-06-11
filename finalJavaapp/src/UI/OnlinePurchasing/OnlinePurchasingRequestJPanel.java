
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OnlinePurchasing;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OnlineStoreEnterprise;
import Business.Food.Dish;
import Business.Network.Network;
import Business.Organization.DieticianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DishRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PhythoNo1
 */
public class OnlinePurchasingRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OnlineStoreEnterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    /**
     * Creates new form TManagerRequestJPanel
     */
    public OnlinePurchasingRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, OnlineStoreEnterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestJButton = new javax.swing.JButton();
        materialTxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        quantityTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestJButton.setText("Request");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });
        add(requestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 223, 98, -1));

        materialTxt.setEditable(false);
        materialTxt.setText("Dish");
        materialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTxtActionPerformed(evt);
            }
        });
        add(materialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 119, 61, -1));

        enterpriseLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 142, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 320, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 223, -1, -1));
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 155, 102, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 122, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 158, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic8.png"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel11.setMinimumSize(new java.awt.Dimension(500, 629));
        jLabel11.setPreferredSize(new java.awt.Dimension(500, 626));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -10, 840, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OnlinePurchasingWorkAreaJPanel pwjp = (OnlinePurchasingWorkAreaJPanel) component;
        pwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed
        // TODO add your handling code here:
        try{Integer.parseInt(quantityTxt.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DishRequest request = new DishRequest();
        Dish newHair = new Dish();
        newHair.setName("dish");
        request.setHair(newHair);
        request.setQuantity(Integer.parseInt(quantityTxt.getText()));
        request.setSender(userAccount);
        request.setSenderEnterprise(enterprise);
        request.setStatus("Sent");
        System.out.println(request.getSenderEnterprise());
        
        Organization org = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof DieticianOrganization){
                    org = organization;
                    break;
               }
           }
      }
       //if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
       // }
        
        JOptionPane.showMessageDialog(null, "Request sent successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_requestJButtonActionPerformed

    private void materialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField materialTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton requestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
