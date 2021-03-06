/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GourmetDietician;

import Business.Enterprise.NutritionDiningRoomEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Food.Dish;
import Business.Food.Diet;
import Business.Food.Material;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class AssignMaterialJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignMatirialJPanel
     */
    private JPanel userProcessContainer;
    private Diet diet;
    private Enterprise enterprise;
    private Network network;
    public AssignMaterialJPanel(JPanel userProcessContainer, Diet diet, NutritionDiningRoomEnterprise enterprise, Network network) {
        initComponents();
        this.diet = diet;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        
        // Add all material in the Nutrition Dining Room
        if(enterprise.getMaterialDirectory().getMaterialList().isEmpty()) {
            for (Material.MaterialType type : Material.MaterialType.values()) {
                Material material = enterprise.getMaterialDirectory().createMaterial();
                material.setName(type.getValue());
                material.setQuantity(0);
                material.setPrice(type.getPrice());
            }
        }
        
        // Add dish in the Nutrition Dining Room
        if(enterprise.getDishDirectory().getDishList().isEmpty()) {
            Dish dish = enterprise.getDishDirectory().createDish();
            dish.setName("dish");
            dish.setPrice(3);
            dish.setQuantity(0);
        }
        
        materialCBox.removeAllItems();
        checkSuppliersMaterialList();
        for (Material material : checkSuppliersMaterialList()) {
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

        materialCBox = new javax.swing.JComboBox();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        materialCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        materialCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBoxActionPerformed(evt);
            }
        });
        add(materialCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 113, 119, -1));

        enterpriseLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        enterpriseLabel.setText("Assign Material:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 260, 30));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Material:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 154, 119, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pic3.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(911, 600));
        jLabel6.setPreferredSize(new java.awt.Dimension(600, 626));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 840, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void materialCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialCBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DieticianWorkAreaJPanel dwjp = (DieticianWorkAreaJPanel) component;
        dwjp.populateMaterialTable(diet);
        dwjp.refreshHairQuantity();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        try{Float.parseFloat(quantityJTextField.getText());}
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The quantity is invalid.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Material material = (Material)materialCBox.getSelectedItem();
        Material materialNeed = new Material();
        diet.getMaterialDirectory().getMaterialList().add(materialNeed);
        materialNeed.setName(material.getName());
        materialNeed.setQuantity(Integer.parseInt(quantityJTextField.getText()));
        // JOptionPane
        JOptionPane.showMessageDialog(null, "Material assigned to this service successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_assignJButtonActionPerformed
public ArrayList<Material> checkSuppliersMaterialList() {
        ArrayList<Material> suppliersMaterialList = new ArrayList<>();
                    
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof SupplierEnterprise){
                SupplierEnterprise ent = (SupplierEnterprise) enterprise;
                suppliersMaterialList.addAll(ent.getMaterialDirectory().getMaterialList());
            }
        }
        
        SortedSet<Material> templeteMaterialList = new TreeSet<Material>(new Comparator<Material>() {
            @Override
            public int compare(Material arg0, Material arg1) {
                return arg0.getName().compareTo(arg1.getName());
            }
        });        
        //And now if you insert a Person into your persons, the duplicates (based on their name property) will not be inserted.
   
        //So you can iterator over your list<Person> and insert every item of it into your persons set, 
        //and be sure that you will not have any duplicates. So the rest would be like:        
        Iterator<Material> iterator = suppliersMaterialList.iterator();
        while(iterator.hasNext()) {
            templeteMaterialList.add(iterator.next());
        }
        suppliersMaterialList.clear();
        suppliersMaterialList.addAll(templeteMaterialList); 
        //Now, your people does not contain duplicate names
        
        return suppliersMaterialList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox materialCBox;
    private javax.swing.JTextField quantityJTextField;
    // End of variables declaration//GEN-END:variables
}
