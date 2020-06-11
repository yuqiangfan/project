/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OnlinePurchasing;

import Business.Enterprise.OnlineStoreEnterprise;
import Business.Nutrition.Nutrition;
import Business.Nutrition.NutritionDirectory;
import Business.Food.Dish;
import Business.Food.Sample;
import Business.Network.Network;
import Business.Organization.OnlineStorePurchaseOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DishRequest;
import Business.WorkQueue.MaterialRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhythonNo1
 */
public class OnlinePurchasingWorkAreaJPanel extends javax.swing.JPanel {

private JPanel userProcessContainer;
    private OnlineStorePurchaseOrganization organization;
    private OnlineStoreEnterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    /**
     * Creates new form BarberWorkAreaJPanel
     */
    public OnlinePurchasingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OnlineStorePurchaseOrganization organization, OnlineStoreEnterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
       
        valueLabel.setText(enterprise.getName()+", "+organization.getName());       
      
        // create inventory from empty
        if(enterprise.getDishDirectory().getDishList().isEmpty()) {
            Dish realHair = enterprise.getDishDirectory().createDish();
            realHair.setName("dish");
            realHair.setType("real");
            realHair.setQuantity(4);
            realHair.setPrice(3);
            
            
            Dish fakeHair1 = new Sample();
            enterprise.getDishDirectory().getDishList().add(fakeHair1);
            fakeHair1.setName("Video");
            fakeHair1.setType("sample");
            fakeHair1.setQuantity(2);
            fakeHair1.setPrice(500);

            Sample wig1 = (Sample) fakeHair1;
            NutritionDirectory gasDirectory1 = new NutritionDirectory();
            wig1.setNutrDirectory(gasDirectory1);
            Nutrition gas11 = gasDirectory1.createNutr();
            gas11.setName("Reading Time /second");
            gas11.setWeight(120);
        
            Nutrition gas12 = gasDirectory1.createNutr();
            gas12.setName("Memory Required /kb");
            gas12.setWeight(1024000);
        
            Nutrition gas13 = gasDirectory1.createNutr();
            gas13.setName("Production Period /day");
            gas13.setWeight(14);
                    
            
            Dish fakeHair2 = new Sample();
            enterprise.getDishDirectory().getDishList().add(fakeHair2);
            fakeHair2.setName("Article");
            fakeHair2.setType("sample");
            fakeHair2.setQuantity(12);
            fakeHair2.setPrice(90);
            
            Sample wig2 = (Sample) fakeHair2;
            NutritionDirectory gasDirectory2 = new NutritionDirectory();
            wig2.setNutrDirectory(gasDirectory2);
            Nutrition gas21 = gasDirectory2.createNutr();
            gas21.setName("Reading Time /second");
            gas21.setWeight(60);
        
            Nutrition gas22 = gasDirectory2.createNutr();
            gas22.setName("Memory Required /kb");
            gas22.setWeight(800);
        
            Nutrition gas23 = gasDirectory2.createNutr();
            gas23.setName("Production Period /day");
            gas23.setWeight(3);
            
            
            Dish fakeHair3 = new Sample();
            enterprise.getDishDirectory().getDishList().add(fakeHair3);
            fakeHair3.setName("Dynamic Advertise");
            fakeHair3.setType("sample");
            fakeHair3.setQuantity(2);
            fakeHair3.setPrice(700);
            
            Sample wig3 = (Sample) fakeHair3;
            NutritionDirectory gasDirectory3 = new NutritionDirectory();
            wig3.setNutrDirectory(gasDirectory3);
            Nutrition gas31 = gasDirectory3.createNutr();
            gas31.setName("Reading Time /second");
            gas31.setWeight(5);
        
            Nutrition gas32 = gasDirectory3.createNutr();
            gas32.setName("Memory Required /kb");
            gas32.setWeight(400);
        
            Nutrition gas33 = gasDirectory3.createNutr();
            gas33.setName("Production Period /day");
            gas33.setWeight(1);
        }
        
        populateProcessRequestTable();
        populateInventoryTable();
        populateRequestTable();
    }

    public void populateProcessRequestTable() {
        DefaultTableModel model = (DefaultTableModel)processRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getQuantity();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
    public void populateInventoryTable() {
        DefaultTableModel model = (DefaultTableModel)inventoryJTable.getModel();
        model.setRowCount(0);
        
        for (Dish hair : enterprise.getDishDirectory().getDishList()) {
            Object[] row = new Object[2];
            row[0] = hair;
            row[1] = hair.getQuantity();
            
            model.addRow(row);
        }
    }
    
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            int quantity = ((DishRequest) request).getQuantity();
            row[1] = quantity+"";
            //row[2] = request.getSender().getEmployee().getName();
            row[2] = request.getSender()== null ? null : request.getSender().getEmployee().getName();
            String receiverEnterprise = ((DishRequest) request).getReceiverEnterprise() == null ? null : ((DishRequest) request).getReceiverEnterprise().getName();
            row[3] = receiverEnterprise;
            row[4] = request.getStatus();
            
            model.addRow(row);
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
        processJButton = new javax.swing.JButton();
        refreshProcessBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        processRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        refreshInventoryBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        refreshRequestBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        requestJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        enterpriseLabel.setText("Department :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 142, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 45, 330, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        refreshProcessBtn.setText("Refresh");
        refreshProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshProcessBtnActionPerformed(evt);
            }
        });
        add(refreshProcessBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Process Request");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        processRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sample", "Quantity", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(processRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 390, 96));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        refreshInventoryBtn.setText("Refresh");
        refreshInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshInventoryBtnActionPerformed(evt);
            }
        });
        add(refreshInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sample", "Number"
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 390, 97));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Inventory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        refreshRequestBtn.setText("Refresh");
        refreshRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshRequestBtnActionPerformed(evt);
            }
        });
        add(refreshRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sample", "Quantity", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 390, 97));

        requestJButton.setText("Request");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });
        add(requestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Request Material");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic8.png"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel11.setMinimumSize(new java.awt.Dimension(500, 629));
        jLabel11.setPreferredSize(new java.awt.Dimension(500, 626));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -10, 840, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = processRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        MaterialRequest request = (MaterialRequest)processRequestJTable.getValueAt(selectedRow, 0);
        // Validate assignment
        if(request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Please click \"Assign to me\" first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        request.setStatus("Processing");

        OnlinePurchasingProcessJPanel processJPanel = new OnlinePurchasingProcessJPanel(userProcessContainer, userAccount, enterprise, request);
        userProcessContainer.add("processJPanel", processJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshProcessBtnActionPerformed

        populateProcessRequestTable();
    }//GEN-LAST:event_refreshProcessBtnActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = processRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        MaterialRequest request = (MaterialRequest)processRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateProcessRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInventoryBtnActionPerformed
        // TODO add your handling code here:
        populateInventoryTable();
    }//GEN-LAST:event_refreshInventoryBtnActionPerformed

    private void refreshRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshRequestBtnActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_refreshRequestBtnActionPerformed

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RPurchasingRequestJPanel", new OnlinePurchasingRequestJPanel(userProcessContainer, userAccount, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable processRequestJTable;
    private javax.swing.JButton refreshInventoryBtn;
    private javax.swing.JButton refreshProcessBtn;
    private javax.swing.JButton refreshRequestBtn;
    private javax.swing.JButton requestJButton;
    private javax.swing.JTable requestJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
