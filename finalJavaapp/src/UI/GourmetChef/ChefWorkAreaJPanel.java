/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GourmetChef;

import Business.Enterprise.NutritionDiningRoomEnterprise;
import Business.Food.Material;
import Business.Organization.ChefOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DietRequest;
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
public class ChefWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ChefOrganization organization;
    private NutritionDiningRoomEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form BarberWorkAreaJPanel
     */
    public ChefWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ChefOrganization organization, NutritionDiningRoomEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        populateMakeDishTable();
       // populateInventoryTable();
        populateRequestTable();
    }

    public void populateMakeDishTable() {
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
    public void populateInventoryTable() {
//        DefaultTableModel model = (DefaultTableModel)inventoryJTable.getModel();
//        model.setRowCount(0);
//        
//        for (Material material : enterprise.getMaterialDirectory().getMaterialList()) {
//            if(material.getQuantity()!=0) {
//                Object[] row = new Object[2];
//                row[0] = material;
//                // accurate to 2 decimal places
//                row[1] = String.format("%d", material.getQuantity());
//            
//                model.addRow(row);
//            }
//        }
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshSendBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        requestMatirialJTable = new javax.swing.JTable();
        requestMatirialJButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Style", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 377, 97));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 93, -1));

        refreshSendBtn.setText("Refresh");
        refreshSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSendBtnActionPerformed(evt);
            }
        });
        add(refreshSendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Make A Dish");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        requestMatirialJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Material", "Quantity", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(requestMatirialJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 377, 97));

        requestMatirialJButton1.setText("Request");
        requestMatirialJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMatirialJButton1ActionPerformed(evt);
            }
        });
        add(requestMatirialJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 93, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("Request Materials");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel6.setPreferredSize(new java.awt.Dimension(600, 626));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        DietRequest request = (DietRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateMakeDishTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        DietRequest request = (DietRequest)workRequestJTable.getValueAt(selectedRow, 0);
        // Validate assignment
        if(request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Please click \"Assign to me\" first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        request.setStatus("Processing");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, enterprise, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSendBtnActionPerformed

        populateMakeDishTable();
    }//GEN-LAST:event_refreshSendBtnActionPerformed

    private void requestMatirialJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMatirialJButton1ActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ChefRequestMaterialJPanel", new ChefRequestMaterialJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestMatirialJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshSendBtn;
    private javax.swing.JButton requestMatirialJButton1;
    private javax.swing.JTable requestMatirialJTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
