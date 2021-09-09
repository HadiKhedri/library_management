package Tables;

import Coding.conn;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hadi
 */
public class IssuedBooks_Table extends javax.swing.JFrame {

    //this is used for search in jable
    private TableRowSorter sorter;
    
    //this code for font and get header of jtable
    Font headerFont = new Font("Arial", Font.BOLD, 16);
    JTableHeader tableHeader;
    
    //this default rendere for center header of table
    DefaultTableCellRenderer renderer;
    public String Online = "NO";
    
 File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "\\src\\Images\\Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
       
    
    public IssuedBooks_Table() {
        initComponents();
     this.setIconImage(FrameIcon.getImage());
        
        // this code set table header font size
        this.tableHeader = jTableBookIssue.getTableHeader();
        tableHeader.setFont(headerFont);

        // this code center the table header
        this.renderer = (DefaultTableCellRenderer) 
        jTableBookIssue.getTableHeader().getDefaultRenderer();  
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSearchBar = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBookIssue = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LIST OF ISSUED BOOKS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelSearchBar.setBackground(new java.awt.Color(243, 243, 243));
        jPanelSearchBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanelSearchBar.setForeground(new java.awt.Color(0, 51, 51));

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(133, 133, 133));
        jTextFieldSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldSearch.setText("Search");
        jTextFieldSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusLost(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyTyped(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(0, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Remove");
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setText("Search");
        jButtonSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableBookIssue.setAutoCreateRowSorter(true);
        jTableBookIssue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableBookIssue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Customer", "Phone", "Publisher", "Book Price", "Availability", "Edition", " Date Issue", "Money Paid"
            }
        ));
        jTableBookIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableBookIssue.setFocusable(false);
        jTableBookIssue.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableBookIssue.setName(""); // NOI18N
        jTableBookIssue.setRowHeight(30);
        jTableBookIssue.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableBookIssue);

        javax.swing.GroupLayout jPanelSearchBarLayout = new javax.swing.GroupLayout(jPanelSearchBar);
        jPanelSearchBar.setLayout(jPanelSearchBarLayout);
        jPanelSearchBarLayout.setHorizontalGroup(
            jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSearch)))
                .addContainerGap())
        );
        jPanelSearchBarLayout.setVerticalGroup(
            jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusGained
        if(jTextFieldSearch.getText().trim().equals("Search")){
            jTextFieldSearch.setText("");
            jTextFieldSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldSearchFocusGained

    private void jTextFieldSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusLost
        if(jTextFieldSearch.getText().trim().equals("")||
            jTextFieldSearch.getText().trim().equals("Search")){
            jTextFieldSearch.setText("Search");
            jTextFieldSearch.setForeground(new Color(133,133,133));
        }
    }//GEN-LAST:event_jTextFieldSearchFocusLost

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyTyped
        DefaultTableModel model = (DefaultTableModel) jTableBookIssue.getModel();
        sorter = new TableRowSorter<>(model);
        jTableBookIssue.setRowSorter(sorter);
        char num = evt.getKeyChar();

        if(num == KeyEvent.VK_ENTER) {
            String str = jTextFieldSearch.getText();
            if(str.length() == 0) {
                sorter.setRowFilter(null);
            }else {
                sorter.setRowFilter(RowFilter.regexFilter(str));
            }
        }
    }//GEN-LAST:event_jTextFieldSearchKeyTyped

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(Online.equals("YES"))
            DeleteIssuedBook_Online();
        else
            DeleteIssuedBook();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(Online.equals("YES"))
            LoadAll_IssuedBooks_Online();
        else
            LoadAll_IssuedBooks();
    }//GEN-LAST:event_formWindowOpened
/*===========================================================================*/
/**************************** START OF FUNCTIONS. ****************************/
    
    private void LoadAll_IssuedBooks(){ 
    try {
            ResultSet rs;
            conn con = new conn();
            String sql ="SELECT * FROM issueBook";
            DefaultTableModel modele = (DefaultTableModel) jTableBookIssue.getModel();        
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
            Object o[]= {rs.getString("bookName"), rs.getString("customerName"), rs.getString("customerPhone")
                    ,rs.getString("PublisherName"), rs.getString("price"), rs.getString("Numbers")
                    ,rs.getString("edition"), rs.getString("dateOfIssue"), rs.getString("moneyPaid")};
            if(jTableBookIssue.getRowCount()!= Number_Of_Issued())    
                modele.addRow(o);                
            }
                st.close();
                con.c.close();
        } catch(SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error Database");
            }
    }  
    private void LoadAll_IssuedBooks_Online() { 
    try {
            ResultSet rs;
            conn con = new conn("YES");
            String sql ="SELECT * FROM issueBook";
            DefaultTableModel modele = (DefaultTableModel) jTableBookIssue.getModel();        
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
            Object o[]= {rs.getString("bookName"), rs.getString("customerName"), rs.getString("customerPhone")
                    ,rs.getString("PublisherName"), rs.getString("price"), rs.getString("Numbers")
                    ,rs.getString("edition"), rs.getString("dateOfIssue"), rs.getString("moneyPaid")};
            if(jTableBookIssue.getRowCount()!= Number_Of_Issued_Online())    
                modele.addRow(o);                
            }
                st.close();
                con.c.close();
        } catch(SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error Database");
            }
    }
    
    
    
    private int Number_Of_Issued() {
        String query = "SELECT COUNT(*) FROM issueBook";
        ResultSet rs;
        int numberRow = 0;
        try {
            conn con = new conn();
            PreparedStatement st = con.c.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                    numberRow = rs.getInt("count(*)");
                }
            st.close();
                con.c.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error");
            }     
            return numberRow;
    }
    private int Number_Of_Issued_Online() {
        String query = "SELECT COUNT(*) FROM issueBook";
        ResultSet rs;
        int numberRow = 0;
        try {
            conn con = new conn("YES");
            PreparedStatement st = con.c.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                    numberRow = rs.getInt("count(*)");
                }
            st.close();
                con.c.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error");
            }     
            return numberRow;
    }
    
    private void DeleteIssuedBook()  {
        DefaultTableModel model = 
            (DefaultTableModel) jTableBookIssue.getModel();
        if(jTableBookIssue.getSelectedRow() == -1){
            if(jTableBookIssue.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "No Row Has Been Selected",
                    "Error", JOptionPane.OK_OPTION);
            } else
            JOptionPane.showMessageDialog(null, "Select a Row to be Deleted",
                "Library", JOptionPane.OK_OPTION);
        }
        else{
     
            Object[] options = {"Yes", "No"};
            int confirm = JOptionPane.showOptionDialog(this,
            "Are You Sure ?",
            "Warning",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
            
                if (confirm == JOptionPane.YES_OPTION) {
                    String BookName = jTableBookIssue.getValueAt(jTableBookIssue.getSelectedRow(), 0).toString();
                    String phoneNumber = jTableBookIssue.getValueAt(jTableBookIssue.getSelectedRow(), 2).toString();
                    String sql = "DELETE FROM issueBook"
                                +" WHERE( bookName = "+'"'+BookName+'"'+" AND"
                                +" customerPhone="+'"'+phoneNumber+'"'+" )";
                    try {
                        conn con = new conn();
                        PreparedStatement st = con.c.prepareStatement(sql);
                        st.executeUpdate();
                        model.removeRow(jTableBookIssue.getSelectedRow());
                        st.close();
                        con.c.close();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Error Database");
                    }
                    }
            }                
    }
    private void DeleteIssuedBook_Online()  {
        DefaultTableModel model = 
            (DefaultTableModel) jTableBookIssue.getModel();
        if(jTableBookIssue.getSelectedRow() == -1){
            if(jTableBookIssue.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "No Row Has Been Selected",
                    "Error", JOptionPane.OK_OPTION);
            } else
            JOptionPane.showMessageDialog(null, "Select a Row to be Deleted",
                "Library", JOptionPane.OK_OPTION);
        }
        else{
     
            Object[] options = {"Yes", "No"};
            int confirm = JOptionPane.showOptionDialog(this,
            "Are You Sure ?",
            "Warning",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
            
                if (confirm == JOptionPane.YES_OPTION) {
                    String BookName = jTableBookIssue.getValueAt(jTableBookIssue.getSelectedRow(), 0).toString();
                    String phoneNumber = jTableBookIssue.getValueAt(jTableBookIssue.getSelectedRow(), 2).toString();
                    String sql = "DELETE FROM issueBook"
                                +" WHERE( bookName = "+'"'+BookName+'"'+" AND"
                                +" customerPhone="+'"'+phoneNumber+'"'+" )";
                    try {
                        conn con = new conn("YES");
                        PreparedStatement st = con.c.prepareStatement(sql);
                        st.executeUpdate();
                        model.removeRow(jTableBookIssue.getSelectedRow());
                        st.close();
                        con.c.close();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Error Database");
                    }
                    }
            }                
    }
    
    
    
    
    private void searchTable()  {
      DefaultTableModel model = (DefaultTableModel) jTableBookIssue.getModel();
            sorter = new TableRowSorter<>(model);
            jTableBookIssue.setRowSorter(sorter);
                String str = jTextFieldSearch.getText();
                    if  (str.length() == 0) 
                        sorter.setRowFilter(null);
                    else 
                        sorter.setRowFilter(RowFilter.regexFilter(str));
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
            java.util.logging.Logger.getLogger(IssuedBooks_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssuedBooks_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IssuedBooks_Table().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JPanel jPanelSearchBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBookIssue;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
