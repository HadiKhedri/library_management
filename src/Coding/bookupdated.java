/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import Tables.All_Books;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.compress.utils.IOUtils;

/**
 *
 * @author Hadi
 */
public class bookupdated extends javax.swing.JFrame {
    public String Online = "NO";
    
    Image imageNew = null;
    String newImagePath = null;
    String HasImage = "No";
    
    
    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "\\src\\Images\\Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
    
    public bookupdated() {
        initComponents();
        this.setIconImage(FrameIcon.getImage());
        jTextBookId.setEditable(false);
        
    }

    public void GetBook(String first, String second, String third, String Fourth,
            String fifth, String sixth, String seventh){
        jTextBookId.setText(first);
        jTextBookName.setText(second);
        jTextBookPublisher.setText(third);
        jTextPrice.setText(Fourth);
        jTextNumbers.setValue(Integer.valueOf(fifth));
        jTextLocation.setText(sixth);
        jComboBoxEdition.setSelectedItem(seventh);        
        jLabelPicture.setIcon(null);   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextBookId = new javax.swing.JTextField();
        jTextBookName = new javax.swing.JTextField();
        jTextBookPublisher = new javax.swing.JTextField();
        jTextPrice = new javax.swing.JTextField();
        jTextLocation = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEdition = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelPicture = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTextNumbers = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(0, 0, 12));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jTextBookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookId.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextBookId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookIdKeyTyped(evt);
            }
        });

        jTextBookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextBookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookNameKeyTyped(evt);
            }
        });

        jTextBookPublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookPublisher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextBookPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookPublisherKeyTyped(evt);
            }
        });

        jTextPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPriceKeyTyped(evt);
            }
        });

        jTextLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextLocation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLocationKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Id :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Publisher :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Availability : ");

        jComboBoxEdition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxEdition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Edition", "Second Edition", "Third Edition", "Fourth Edition", "Fifth Edition", "Sixth Edition", "Seventh Edition" }));
        jComboBoxEdition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxEditionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Book Price :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Location :");

        jPanel3.setBackground(new java.awt.Color(0, 0, 12));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUpdate.setText("Save Changes");
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Clear All");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButtonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("Picture");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextNumbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextNumbers.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(0), null, Integer.valueOf(1)));
        jTextNumbers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNumbersKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextLocation)
                                            .addComponent(jTextNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextBookId, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                .addComponent(jTextBookName)
                                                .addComponent(jTextBookPublisher)
                                                .addComponent(jTextPrice))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBookIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookIdKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextBookId.transferFocus();
    }//GEN-LAST:event_jTextBookIdKeyTyped

    private void jTextBookNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookNameKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextBookName.transferFocus();
    }//GEN-LAST:event_jTextBookNameKeyTyped

    private void jTextBookPublisherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookPublisherKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextBookPublisher.transferFocus();
    }//GEN-LAST:event_jTextBookPublisherKeyTyped

    private void jTextPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPriceKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextPrice.transferFocus();

        else if(!(Character.isDigit(num)
            ||(num == KeyEvent.VK_BACK_SPACE)
            ||(num == KeyEvent.VK_DELETE)))
    evt.consume();

    }//GEN-LAST:event_jTextPriceKeyTyped

    private void jTextLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLocationKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextLocation.transferFocus();
    }//GEN-LAST:event_jTextLocationKeyTyped

    private void jComboBoxEditionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxEditionKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jButtonUpdate.grabFocus();
    }//GEN-LAST:event_jComboBoxEditionKeyTyped

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        if(Online.equals("YES")){
            UpdateOnline();
        }
        else {
            Update();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        All_Books all = new All_Books();
        all.setVisible(true);
        all.setLocationRelativeTo(null);
        all.pack();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        java.io.File f = showFileDialog(true);
        try {
            imageNew = ImageIO.read(f);
            Image a = imageNew.getScaledInstance(230, 255, Image.SCALE_DEFAULT);
            jLabelPicture.setText(null);
            jLabelPicture.setIcon(new ImageIcon(a));
            HasImage = "Yes";
            this.validate();
        } catch(Exception ex) {JOptionPane.showMessageDialog(this, "Error!");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextNumbersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNumbersKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextLocation.grabFocus();

    }//GEN-LAST:event_jTextNumbersKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SetPicture();
    }//GEN-LAST:event_formWindowOpened

    
    private void Update(){
        if(jTextBookName.getText().equals("")
            || jTextBookPublisher.getText().equals("")
            || jTextPrice.getText().equals("")
            || jTextNumbers.getValue().equals("")
            || jTextLocation.getText().equals(""))
            JOptionPane.showMessageDialog(this, "some Fields are empty");
        
        else {
            
            try {
                conn con = new conn();               
                String Query = "UPDATE book SET "
                + " bookName = ?, publisher = ?, price = ?,"
                + " Numbers = ?, location = ?, edition = ?, picture = ?"
                + " WHERE book_id = ?";
                
                String QueryNoPic = "UPDATE book SET "
                + " bookName = ?, publisher = ?, price = ?,"
                + " Numbers = ?, location = ?, edition = ?"
                + " WHERE book_id = ?";
                               
                if(HasImage.equals("No")) {
                    PreparedStatement st = con.c.prepareStatement(QueryNoPic);
                    st.setString(1, jTextBookName.getText());
                    st.setString(2, jTextBookPublisher.getText());
                    st.setString(3, jTextPrice.getText());
                    st.setString(4, jTextNumbers.getValue().toString());
                    st.setString(5, jTextLocation.getText());
                    st.setString(6, jComboBoxEdition.getSelectedItem().toString());
                    st.setString(7, jTextBookId.getText());
                    
                    int rs = st.executeUpdate();
                    System.out.println(rs);
                    
                    if (rs > 0){
                        JOptionPane.showMessageDialog(null, "updated succesfully");
                        st.close();
                        con.c.close();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error");
                        st.close();
                        con.c.close();
                    }
                }
                
                else {                    
                    InputStream in = new FileInputStream(newImagePath);
                    byte[] bytes = IOUtils.toByteArray(in);
                    
                    PreparedStatement st = con.c.prepareStatement(Query);
                    st.setString(1, jTextBookName.getText());
                    st.setString(2, jTextBookPublisher.getText());
                    st.setString(3, jTextPrice.getText());
                    st.setString(4, jTextNumbers.getValue().toString());
                    st.setString(5, jTextLocation.getText());
                    st.setString(6, (String) jComboBoxEdition.getSelectedItem());                    
                    st.setBytes(7, bytes);
                    st.setString(8, jTextBookId.getText());
                    int rs = st.executeUpdate();
                    
                    if (rs > 0){
                        JOptionPane.showMessageDialog(null, "updated succesfully");
                        st.close();
                        con.c.close();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error");
                        st.close();
                        con.c.close();
                    }
                }
            }
            catch(SQLException | HeadlessException | IOException e){
                JOptionPane.showMessageDialog(this, "Database Error" +e.getMessage());
            }
        }
    }
    
    private void UpdateOnline(){
      if(jTextBookName.getText().equals("")
            || jTextBookPublisher.getText().equals("")
            || jTextPrice.getText().equals("")
            || jTextNumbers.getValue().equals("")
            || jTextLocation.getText().equals(""))
            JOptionPane.showMessageDialog(this, "some Fields are empty");
        
        else {
            
            try {
                conn con = new conn("YES");               
                String Query = "UPDATE book SET "
                + " bookName = ?, publisher = ?, price = ?,"
                + " Numbers = ?, location = ?, edition = ?, picture = ?"
                + " WHERE book_id = ?";
                
                String QueryNoPic = "UPDATE book SET "
                + " bookName = ?, publisher = ?, price = ?,"
                + " Numbers = ?, location = ?, edition = ?"
                + " WHERE book_id = ?";
                               
                if(HasImage.equals("No")) {
                    PreparedStatement st = con.c.prepareStatement(QueryNoPic);
                    st.setString(1, jTextBookName.getText());
                    st.setString(2, jTextBookPublisher.getText());
                    st.setString(3, jTextPrice.getText());
                    st.setString(4, jTextNumbers.getValue().toString());
                    st.setString(5, jTextLocation.getText());
                    st.setString(6, jComboBoxEdition.getSelectedItem().toString());
                    st.setString(7, jTextBookId.getText());
                    
                    int rs = st.executeUpdate();
//                    System.out.println(rs);
                    
                    if (rs > 0){
                        JOptionPane.showMessageDialog(null, "updated succesfully");
                        st.close();
                        con.c.close();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error");
                        st.close();
                        con.c.close();
                    }
                }
                
                else {                    
                    InputStream in = new FileInputStream(newImagePath);
                    byte[] bytes = IOUtils.toByteArray(in);
                    
                    PreparedStatement st = con.c.prepareStatement(Query);
                    st.setString(1, jTextBookName.getText());
                    st.setString(2, jTextBookPublisher.getText());
                    st.setString(3, jTextPrice.getText());
                    st.setString(4, jTextNumbers.getValue().toString());
                    st.setString(5, jTextLocation.getText());
                    st.setString(6, (String) jComboBoxEdition.getSelectedItem());                    
                    st.setBytes(7, bytes);
                    st.setString(8, jTextBookId.getText());
                    int rs = st.executeUpdate();
                    
                    if (rs > 0){
                        JOptionPane.showMessageDialog(null, "updated succesfully");
                        st.close();
                        con.c.close();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error");
                        st.close();
                        con.c.close();
                    }
                }
            }
            catch(SQLException | HeadlessException | IOException e){
                JOptionPane.showMessageDialog(this, "Database Error" +e.getMessage());
            }
        }       
    }
    
    
    
    private void SetPicture() {
        try{
        ResultSet rs;
        conn con = new conn();
        String sql = "SELECT * FROM book where "
            + "(book_id = "+'"'+jTextBookId.getText()+'"'+" );  ";
        PreparedStatement st = con.c.prepareStatement(sql);        
        rs = st.executeQuery();
        rs.next();
        if(rs.getRow() == 1){   
            if(rs.getBytes("picture")== null){
                jLabelPicture.setText("No Picture");
                HasImage = "No";
                st.close();
                con.c.close();
            }
            else{
            Image image = getToolkit().createImage(rs.getBytes("picture"));
            Image img = image.getScaledInstance(230,255,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
            jLabelPicture.setIcon(icon);
            HasImage = "No";
                st.close();
                con.c.close();
            }
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private File showFileDialog(final boolean open) {
    JFileChooser fc = new JFileChooser("Open a File");
    javax.swing.filechooser.FileFilter ff = new javax.swing.filechooser.FileFilter() {
       @Override
       public boolean accept(java.io.File f) {
          String name = f.getName().toLowerCase();
          if(open)
             return f.isDirectory() ||
                name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".jpg");
          return f.isDirectory()||name.endsWith(".txt");
          }
       @Override
       public String getDescription() {
          if(open)
             return "Picture (*.jpeg, *.png)";
          return "Text (*.txt)";
          }
       };
    fc.setAcceptAllFileFilterUsed(false);
    fc.addChoosableFileFilter(ff);

    java.io.File f = null;
   if(open && fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){    
       f = fc.getSelectedFile();
       newImagePath  =  fc.getSelectedFile().getAbsolutePath();
   }
    else if(!open && fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
      f = fc.getSelectedFile();
        
    return f;
    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxEdition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextBookId;
    private javax.swing.JTextField jTextBookName;
    private javax.swing.JTextField jTextBookPublisher;
    private javax.swing.JTextField jTextLocation;
    private javax.swing.JSpinner jTextNumbers;
    private javax.swing.JTextField jTextPrice;
    // End of variables declaration//GEN-END:variables
}
