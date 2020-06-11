/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import javax.swing.JOptionPane;

import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.io.*;
//import java.lang.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author stevefan
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Product product;
    
    
    public CreatePanel(Product product) {
        initComponents();
        this.product=product;
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorTxtField = new javax.swing.JTextField();
        modelTxtField = new javax.swing.JTextField();
        serialNumTxtField = new javax.swing.JTextField();
        dimensionTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        brandTxtField = new javax.swing.JTextField();
        locationTxtField = new javax.swing.JTextField();
        yearTxtField = new javax.swing.JTextField();
        autoTxtField = new javax.swing.JTextField();
        seatsTxtField = new javax.swing.JTextField();
        engineTxtField = new javax.swing.JTextField();
        typeTxtField = new javax.swing.JTextField();
        gasTxtField = new javax.swing.JTextField();
        usedTxtField = new javax.swing.JTextField();
        mileTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        uploadBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        modelTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTxtFieldActionPerformed(evt);
            }
        });

        serialNumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumTxtFieldActionPerformed(evt);
            }
        });

        dimensionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionTxtFieldActionPerformed(evt);
            }
        });

        priceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtFieldActionPerformed(evt);
            }
        });

        locationTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtFieldActionPerformed(evt);
            }
        });

        yearTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTxtFieldActionPerformed(evt);
            }
        });

        autoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoTxtFieldActionPerformed(evt);
            }
        });

        seatsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsTxtFieldActionPerformed(evt);
            }
        });

        typeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTxtFieldActionPerformed(evt);
            }
        });

        usedTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usedTxtFieldActionPerformed(evt);
            }
        });

        mileTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("Describe Your Favorite Car");

        jLabel2.setText("Color:");

        jLabel3.setText("Model:");

        jLabel4.setText("Serial Number:");

        jLabel5.setText("Dimension:");

        jLabel6.setText("Price:");

        jLabel7.setText("Brand:");

        jLabel8.setText("Location:");

        jLabel9.setText("Year:");

        jLabel10.setText("Auto/Mannual:");

        jLabel11.setText("Seats:");

        jLabel12.setText("Engine:");

        jLabel13.setText("Type:");

        jLabel14.setText("Gas/Elec:");

        jLabel15.setText("New/Used:");

        jLabel16.setText("Miles:");

        createBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        uploadBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        uploadBtn.setText("Upload Picture");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(colorTxtField))
                        .addGap(18, 18, 18)
                        .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dimensionTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(priceTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mileTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatsTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engineTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gasTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usedTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serialNumTxtField))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uploadBtn)
                                .addGap(159, 159, 159))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(432, 432, 432))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(colorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(modelTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(serialNumTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dimensionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(brandTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(locationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(yearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(autoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(seatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadBtn))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(engineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(typeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gasTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(mileTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modelTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTxtFieldActionPerformed

    private void serialNumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumTxtFieldActionPerformed

    private void dimensionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dimensionTxtFieldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        // binding the user input to the product object
        product.setColor(colorTxtField.getText());
        product.setModel(modelTxtField.getText());
        product.setSerialNum(serialNumTxtField.getText());
        product.setDimension(dimensionTxtField.getText());
        product.setPrice(priceTxtField.getText());
        product.setBrand(brandTxtField.getText());
        product.setLocation(locationTxtField.getText());
        product.setYear(yearTxtField.getText());
        product.setAuto(autoTxtField.getText());
        product.setSeats(seatsTxtField.getText());
        product.setEngine(engineTxtField.getText());
        product.setType(typeTxtField.getText());
        product.setGas(gasTxtField.getText());
        product.setUsed(usedTxtField.getText());
        product.setMile(mileTxtField.getText());
    
        
        
        //prompt user that product was successfully created
        
        JOptionPane.showMessageDialog(null,"Record Favorite Car Successfully");
    }//GEN-LAST:event_createBtnActionPerformed

    private void priceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtFieldActionPerformed

    private void locationTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtFieldActionPerformed

    private void yearTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTxtFieldActionPerformed

    private void autoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoTxtFieldActionPerformed

    private void seatsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsTxtFieldActionPerformed

    private void typeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTxtFieldActionPerformed

    private void usedTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usedTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usedTxtFieldActionPerformed

    private void mileTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mileTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mileTxtFieldActionPerformed
    
    public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(imgLabel.getWidth(),imgLabel.getHeight(),Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(newImg);
        product.setImage(image);
        return image;
    }
    
    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            imgLabel.setIcon(ResizeImage(path));
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Picture Select");
        }
    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autoTxtField;
    private javax.swing.JTextField brandTxtField;
    private javax.swing.JTextField colorTxtField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dimensionTxtField;
    private javax.swing.JTextField engineTxtField;
    private javax.swing.JTextField gasTxtField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField locationTxtField;
    private javax.swing.JTextField mileTxtField;
    private javax.swing.JTextField modelTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField seatsTxtField;
    private javax.swing.JTextField serialNumTxtField;
    private javax.swing.JTextField typeTxtField;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JTextField usedTxtField;
    private javax.swing.JTextField yearTxtField;
    // End of variables declaration//GEN-END:variables
}
