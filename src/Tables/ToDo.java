/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Coding.conn;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hadi
 */
public class ToDo extends javax.swing.JFrame {

    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "\\src\\Images\\Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
       
    public ToDo() {
        initComponents();
        this.setIconImage(FrameIcon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableToDo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TODO LIST");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTableToDo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableToDo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Date", "Time", "Task"
            }
        ));
        jTableToDo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableToDo.setFocusable(false);
        jTableToDo.setOpaque(false);
        jTableToDo.setRowHeight(30);
        jTableToDo.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableToDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableToDoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableToDo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableToDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableToDoMouseClicked
      
    }//GEN-LAST:event_jTableToDoMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        Delete();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel modele = (DefaultTableModel) jTableToDo.getModel();  
            String registerQuery ="SELECT * From todo";           
            PreparedStatement ps;
            ResultSet rs;
        try {    
            conn con = new conn();
            ps = con.c.prepareStatement(registerQuery);
            rs = ps.executeQuery();
            while(rs.next()){
            Object o[]= {rs.getString("No"), rs.getString("Date"), rs.getString("Time"),
                rs.getString("Task") };
            if(jTableToDo.getRowCount()!= getRowNumber())
            modele.addRow(o);    
            }
            }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,"Please Restart Or Try Again Later! ");
            }
    }//GEN-LAST:event_formWindowOpened

      public int getRowNumber(){
    int numberRow = 0;
    PreparedStatement ps;
    ResultSet rs;
    String query = "select count(*) from Todo";
        try{
            conn con = new conn();
            ps = con.c.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                numberRow = rs.getInt("count(*)");
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error ");
        }
    return numberRow;
}
    private void Delete()  {
        DefaultTableModel model = 
            (DefaultTableModel) jTableToDo.getModel();
        if(jTableToDo.getSelectedRow() == -1){
            if(jTableToDo.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "No Row Has Been Selected",
                    "Warning!", JOptionPane.OK_OPTION);
            } else
            JOptionPane.showMessageDialog(null, "Select a row to be Deleted",
                "Library", JOptionPane.OK_OPTION);
        }
        else{
     
            Object[] options = {"Yes", "No"};
            int confirm = JOptionPane.showOptionDialog(this,
            "Are You Sure ?",
            "Warning!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
                if (confirm == JOptionPane.YES_OPTION) {
                     String id = jTableToDo.getValueAt(jTableToDo.getSelectedRow(), 0).toString();
                    String sql = "DELETE FROM Todo WHERE(No ="+'"'+id+'"'+")";
                    try {
                        conn con = new conn();
                        PreparedStatement st = con.c.prepareStatement(sql);
                        st.executeUpdate();
                        st.close();
                        con.c.close();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Network Error Please Try Again");
                    }
                    model.removeRow(jTableToDo.getSelectedRow());
                    }
            }                
    }
      
      
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableToDo;
    // End of variables declaration//GEN-END:variables
}
