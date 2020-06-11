/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OnlinePurchasing;

import Business.Enterprise.OnlineStoreEnterprise;
import Business.Food.Dish;
import Business.Food.Material;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaterialRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class OnlinePurchasingProcessJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OnlineStoreEnterprise enterprise;
    private MaterialRequest request;
    private UserAccount userAccount;
    /**
     * Creates new form ProcessHairJPanel
     */
    public OnlinePurchasingProcessJPanel(JPanel userProcessContainer, UserAccount userAccount,OnlineStoreEnterprise enterprise, MaterialRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.request = request;
        this.userAccount = userAccount;
        
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

        valueLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        quantityTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sendJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 82, 200, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 226, -1, -1));
        add(quantityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 158, 57, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 125, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 161, -1, -1));

        sendJButton.setText("Send");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });
        add(sendJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 226, 86, -1));

        enterpriseLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 71, 142, 30));

        jTextField1.setEditable(false);
        jTextField1.setText("Dish");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 119, 60, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic8.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel10.setMinimumSize(new java.awt.Dimension(500, 629));
        jLabel10.setPreferredSize(new java.awt.Dimension(500, 626));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -10, 840, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OnlinePurchasingWorkAreaJPanel pwjp = (OnlinePurchasingWorkAreaJPanel) component;
        pwjp.populateRequestTable();
        pwjp.populateInventoryTable();
        pwjp.populateProcessRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed
        // TODO add your handling code here:
        try{Integer.parseInt(quantityTxt.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for(Dish dish : enterprise.getDishDirectory().getDishList()) {
         
            if(dish.getQuantity()-Integer.parseInt(quantityTxt.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Dish for sample is insufficient.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }else{
            
            dish.setQuantity(dish.getQuantity()-Integer.parseInt(quantityTxt.getText()));
            request.setStatus("Completed: "+request.getActualQuantity());
            JOptionPane.showMessageDialog(null, "Reply sent successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
            break;
            }
        }    
        
    }//GEN-LAST:event_sendJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton sendJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
