/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OnlineAdvertising;

import Business.Enterprise.OnlineStoreEnterprise;
import Business.Nutrition.Nutrition;
import Business.Food.Dish;
import Business.Organization.AdvertisingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MaterialRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhythonNo1
 */
public class AdvertisingWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdvertisingOrganization organization;
    private OnlineStoreEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form AdvertisingWorkAreaJPanel
     */
    public AdvertisingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AdvertisingOrganization organization, OnlineStoreEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        populateRequestTable();
        populateInventoryTable();
        initializeGasSaved();
        refreshGasSavedText();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) requestMatirialJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            int quantity = ((MaterialRequest) request).getQuantity();
            row[1] = quantity+"";
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
    public void populateInventoryTable() {
        DefaultTableModel model = (DefaultTableModel)inventoryJTable.getModel();
        model.setRowCount(0);
        
        for (Dish hair : enterprise.getDishDirectory().getDishList()) {
            if(hair.getName().equals("dish")){
                }else{
            hair.setType("fake");
                Object[] row = new Object[2];
            row[0] = hair;
            row[1] = hair.getQuantity();
            
            model.addRow(row);}
        }
    }
    
    public void initializeGasSaved() {
        Nutrition gas1 = enterprise.getNutrDirectory().createNutr();
        gas1.setName("Reading Time");
        gas1.setWeight(35);
        
        Nutrition gas2 = enterprise.getNutrDirectory().createNutr();
        gas2.setName("Watching Time");
        gas2.setWeight(23);
        
        Nutrition gas3 = enterprise.getNutrDirectory().createNutr();
        gas3.setName("Memory Comsumption");
        gas3.setWeight(3);
    }
    
    public void refreshGasSavedText() {
        for(Nutrition gas: enterprise.getNutrDirectory().getNutrList()) {
            if(gas.getName().equals("Reading Time")) 
                CLJTextField.setText(String.format("%.1f", gas.getWeight()));
            if(gas.getName().equals("Watching Time")) 
                CO2JTextField.setText(String.format("%.1f", gas.getWeight()));
            if(gas.getName().equals("Memory Comsumption")) 
                SO2JTextField.setText(String.format("%.1f", gas.getWeight()));
        }
        int CL1 = 0,CL2 = 0,CL3 = 0,CLall,CO1 = 0,CO2 = 0,CO3 = 0,COall,SO1 = 0,SO2 = 0,SO3 = 0,SOall;
        for (Dish hair : enterprise.getDishDirectory().getDishList()) {
            if(hair.getName().equals("dish")){
                }else if(hair.getName().equals("Video"))
                        {
            int i = hair.getQuantity();
             CL1 = 2*i; //minute
             CO1 = 1024000*i;//kb
             SO1 = 14*i;//day
            
            
            //model.addRow(row);}
        }else if(hair.getName().equals("Article")){
            int j = hair.getQuantity();
             CL2 = 1*j; //minute
             CO2 = 800*j;//kb
             SO2 = 3*j;//day
        }else if(hair.getName().equals("Dynamic Ad")){
            int l = hair.getQuantity();
             CL3 = (int) (0.083*l); //minute
             CO3 = 400*l;//kb
             SO3 = 1*l;//day
        }}
         SOall= SO3+SO2+SO1;
         COall = CO1+CO2+CO3;
         CLall = CL1+CL2+CL3;
         CLJTextField.setText(Integer.toString(SOall));//3
         CO2JTextField.setText(Integer.toString(CLall));//1
         SO2JTextField.setText(Integer.toString(COall));//2
         jLabel4.setText("Total Reading Time");
         jLabel5.setText("Total Memory Usage");
         jLabel6.setText("Total Production Time");
         
         
         
             
         
         
        
            
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        requestMatirialJButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        refreshSendBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestMatirialJTable = new javax.swing.JTable();
        makeJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CO2JTextField = new javax.swing.JTextField();
        SO2JTextField = new javax.swing.JTextField();
        CLJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accountBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Advertisements Inventory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        requestMatirialJButton1.setText("Request");
        requestMatirialJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMatirialJButton1ActionPerformed(evt);
            }
        });
        add(requestMatirialJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 405, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Request Material");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        refreshSendBtn1.setText("Refresh");
        refreshSendBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSendBtn1ActionPerformed(evt);
            }
        });
        add(refreshSendBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 254, -1, -1));

        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Dish", "Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(inventoryJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 88, 377, 83));

        requestMatirialJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dish", "Quantity", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestMatirialJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 290, 377, 97));

        makeJButton.setText("Make");
        makeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeJButtonActionPerformed(evt);
            }
        });
        add(makeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 189, 89, -1));

        jLabel4.setText("Potassium Serving");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel5.setText("Sodium Serving");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jLabel6.setText("Protein Serving");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        CO2JTextField.setEditable(false);
        CO2JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CO2JTextFieldActionPerformed(evt);
            }
        });
        add(CO2JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 446, 69, -1));

        SO2JTextField.setEditable(false);
        SO2JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SO2JTextFieldActionPerformed(evt);
            }
        });
        add(SO2JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 69, -1));

        CLJTextField.setEditable(false);
        CLJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLJTextFieldActionPerformed(evt);
            }
        });
        add(CLJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 69, -1));

        jLabel7.setText("minutes");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel8.setText("kbs");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 40, -1));

        jLabel9.setText("days");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        accountBtn.setText("Account");
        accountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBtnActionPerformed(evt);
            }
        });
        add(accountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 47, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic1.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel10.setMinimumSize(new java.awt.Dimension(500, 629));
        jLabel10.setPreferredSize(new java.awt.Dimension(500, 626));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 840, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void requestMatirialJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMatirialJButton1ActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AdvertisingRequestJPanel", new AdvertisingRequestJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestMatirialJButton1ActionPerformed

    private void refreshSendBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSendBtn1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_refreshSendBtn1ActionPerformed

    private void makeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AdvertisingJPanel", new AdvertisingJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_makeJButtonActionPerformed

    private void accountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AdvertisingAccoountJPanel", new AdvertisingAccoountJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_accountBtnActionPerformed

    private void CO2JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CO2JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CO2JTextFieldActionPerformed

    private void SO2JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SO2JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SO2JTextFieldActionPerformed

    private void CLJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CLJTextField;
    private javax.swing.JTextField CO2JTextField;
    private javax.swing.JTextField SO2JTextField;
    private javax.swing.JButton accountBtn;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton makeJButton;
    private javax.swing.JButton refreshSendBtn1;
    private javax.swing.JButton requestMatirialJButton1;
    private javax.swing.JTable requestMatirialJTable;
    // End of variables declaration//GEN-END:variables
}
