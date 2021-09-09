package Coding;

import Tables.Sell_Books;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Hadi
 */
public class Books extends javax.swing.JFrame {

    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "/src/Images/Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
    public String Online = "NO";
    
    
    public Books() {
        initComponents();
        
        this.setIconImage(FrameIcon.getImage());
        jComboBoxEdition.setBackground(Color.WHITE);
        jComboBoxEdition.setForeground(Color.BLACK);

        jTextNumber.setEditable(false);
        jTextBookName.setEditable(false);
        jTextBookPublisher.setEditable(false);
        jTextCountINStock.setEditable(false);
        jTextBookSaleId.setEditable(false);
        jComboBoxEdition.setEditable(false);
        jTextTotal.setEditable(false);
        jTextPrice.setEditable(false);
        jTextDiscount.setText("0");
        
    //jspinner accept only numbers    
    JFormattedTextField txt = ((JSpinner.NumberEditor) jTextBookCount.getEditor()).getTextField();
    ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);

    }
    
    public void GetBook(String first, String second, String third, String Fourth,
            String fifth, String seventh){
        jTextNumber.setText(first);
        jTextBookName.setText(second);
        jTextBookPublisher.setText(third);
        jTextPrice.setText(Fourth);
        jTextCountINStock.setText(fifth);
        jComboBoxEdition.setSelectedItem(seventh);    
        jLabelPicture.setIcon(null); 
//        if(Number_Of_LastSold_Books() == null)
//            jTextBookSaleId.setText("1");
//        else{
        if(Online.equals("YES")){
            jTextBookSaleId.setText(String.valueOf(Number_Of_LastSold_Books_Online()+1));
        }
        else{
            jTextBookSaleId.setText(String.valueOf(Number_Of_LastSold_Books()+1));   
        }
    }
    public boolean GetBookSearchId(String id) {
        String sql = "select * from book where book_id ="+id+" ";
        conn con = new conn();
        try {
        PreparedStatement st = con.c.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        rs.next();
        if (rs.getRow() == 1){
        jTextNumber.setText(id);
        jTextBookName.setText(rs.getString("bookName"));
        jTextBookPublisher.setText(rs.getString("publisher"));
        jTextCountINStock.setText(rs.getString("Numbers"));
        jTextPrice.setText(rs.getString("price"));
        jTextBookSaleId.setText(String.valueOf(Number_Of_LastSold_Books()+1));
                    st.close();
                    con.c.close();
        return true;
        }
                    
        else  {
            JOptionPane.showMessageDialog(this, "Book With this Id Does not Exist");
                    st.close();
                    con.c.close();
            return false;
        }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error");
        }
        return false;
    }
    public boolean GetBookSearchId_Online(String id) {
        String sql = "select * from book where book_id ="+id+" ";
        conn con = new conn("YES");
        try {
        PreparedStatement st = con.c.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        rs.next();
        if (rs.getRow() == 1){
        jTextNumber.setText(id);
        jTextBookName.setText(rs.getString("bookName"));
        jTextBookPublisher.setText(rs.getString("publisher"));
        jTextCountINStock.setText(rs.getString("Numbers"));
        jTextPrice.setText(rs.getString("price"));
        jTextBookSaleId.setText(String.valueOf(Number_Of_LastSold_Books_Online()+1));
                    st.close();
                    con.c.close();
        return true;
        }
                    
        else  {
            JOptionPane.showMessageDialog(this, "Book With this Id Does not Exist");
                    st.close();
                    con.c.close();
            return false;
        }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, "Error");
        }
        return false;
    }
    
    
    
    private void Remove_TextFields(){
        jButtonSale.setEnabled(false);
        jPanel2.remove(jTextBookCount);
        jPanel2.remove(jLabelCount);
        jPanel2.remove(jTextDiscount);
        jPanel2.remove(jLabelDiscount);
        jPanel2.remove(jTextTotal);
//        jPanel2.remove(jLabelTotal);
        jPanel2.remove(jTextPrice);
        jPanel2.remove(jLabelPrice);
        jPanel2.remove(jTextBookSaleId);
        jPanel2.remove(jLabelSaleId);
        jLabelTotal.setText("This Book out of Stock");
        jPanel2.add(Box.createHorizontalGlue());
        jPanel2.add(Box.createHorizontalGlue()); 
    }
    
    private int Number_Of_LastSold_Books(){
        String sql = "SELECT sale_Id FROM soldbooks ORDER BY sale_Id DESC LIMIT 1";
        int Last_Id = 0;
        ResultSet rs;
        try {
            conn con = new conn();
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            rs.next();
            if(rs.getRow() == 1){
            Last_Id = rs.getInt("sale_Id");           
                    st.close();
                    con.c.close();
            return Last_Id;
            }
            else{
                    st.close();
                    con.c.close();
                    return 0;   
                    }
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error");
            }     
            return 0;
    }
    private int Number_Of_LastSold_Books_Online(){
        String sql = "SELECT sale_Id FROM soldbooks ORDER BY sale_Id DESC LIMIT 1";
        int Last_Id = 0;
        ResultSet rs;
        try {
            conn con = new conn("YES");
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            rs.next();
            if(rs.getRow() == 1){
            Last_Id = rs.getInt("sale_Id");           
                    st.close();
                    con.c.close();
            return Last_Id;
            }
            else{
                    st.close();
                    con.c.close();
                    return 0;   
                    }
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error");
            }     
            return 0;
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
        jLabelPicture = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextPrice = new javax.swing.JTextField();
        jTextBookCount = new javax.swing.JSpinner();
        jLabelPrice = new javax.swing.JLabel();
        jLabelCount = new javax.swing.JLabel();
        jTextDiscount = new javax.swing.JTextField();
        jLabelDiscount = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jLabelSaleId = new javax.swing.JLabel();
        jTextBookSaleId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextNumber = new javax.swing.JTextField();
        jTextBookName = new javax.swing.JTextField();
        jTextBookPublisher = new javax.swing.JTextField();
        jTextCountINStock = new javax.swing.JTextField();
        jComboBoxEdition = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSale = new javax.swing.JButton();
        jLogin2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Sell Books   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabelPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Counting   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        jTextPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPriceKeyTyped(evt);
            }
        });

        jTextBookCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookCount.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jTextBookCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextBookCount.setNextFocusableComponent(jTextDiscount);
        jTextBookCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBookCountFocusGained(evt);
            }
        });
        jTextBookCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookCountKeyTyped(evt);
            }
        });

        jLabelPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrice.setText("Price of Book :");

        jLabelCount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCount.setText("Number of Sale :");

        jTextDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextDiscount.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDiscountKeyTyped(evt);
            }
        });

        jLabelDiscount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDiscount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDiscount.setText("Discount :");

        jTextTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTotalKeyTyped(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("Total Payment :");

        jLabelSaleId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSaleId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSaleId.setText("Sell Id :");

        jTextBookSaleId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookSaleId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextBookSaleId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBookSaleIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelSaleId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBookSaleId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPrice))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextBookCount, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jLabelDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jTextTotal))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSaleId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBookSaleId, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBookCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "   Book Details   ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jTextNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNumberKeyTyped(evt);
            }
        });

        jTextBookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextBookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookNameKeyTyped(evt);
            }
        });

        jTextBookPublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextBookPublisher.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextBookPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextBookPublisherKeyTyped(evt);
            }
        });

        jTextCountINStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextCountINStock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextCountINStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCountINStockKeyTyped(evt);
            }
        });

        jComboBoxEdition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxEdition.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxEdition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Edition", "Second Edition", "Third Edition", "Fourth Edition", "Fifth Edition", "Sixth Edition", "Seventh Edition" }));
        jComboBoxEdition.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBoxEdition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxEditionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxEditionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxEditionMouseExited(evt);
            }
        });
        jComboBoxEdition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxEditionKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Id :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Publisher :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Availability :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNumber)
                            .addComponent(jTextBookName)
                            .addComponent(jTextBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEdition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextCountINStock))))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBookPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCountINStock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButtonSale.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSale.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonSale.setText("Sell");
        jButtonSale.setBorder(null);
        jButtonSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSaleMouseExited(evt);
            }
        });
        jButtonSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaleActionPerformed(evt);
            }
        });
        jButtonSale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonSaleKeyTyped(evt);
            }
        });

        jLogin2.setBackground(new java.awt.Color(255, 255, 255));
        jLogin2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLogin2.setText("List of All Books");
        jLogin2.setBorder(null);
        jLogin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLogin2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLogin2MouseExited(evt);
            }
        });
        jLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogin2ActionPerformed(evt);
            }
        });
        jLogin2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLogin2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSale, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNumberKeyTyped

    }//GEN-LAST:event_jTextNumberKeyTyped

    private void jTextBookNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookNameKeyTyped

    }//GEN-LAST:event_jTextBookNameKeyTyped

    private void jTextPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPriceKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextBookCount.grabFocus();

        else if(!(Character.isDigit(num)
            ||(num == KeyEvent.VK_BACK_SPACE)
            ||(num == KeyEvent.VK_DELETE)))
        evt.consume();
    }//GEN-LAST:event_jTextPriceKeyTyped

    private void jTextCountINStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCountINStockKeyTyped
    
    }//GEN-LAST:event_jTextCountINStockKeyTyped

    private void jComboBoxEditionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxEditionKeyTyped
 
    }//GEN-LAST:event_jComboBoxEditionKeyTyped

    private void jTextBookCountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookCountKeyTyped
              
    }//GEN-LAST:event_jTextBookCountKeyTyped

    private void jTextBookPublisherKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBookPublisherKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBookPublisherKeyTyped

    private void jTextTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTotalKeyTyped
        if(jTextDiscount.getText().equals(""))
            jTextDiscount.setText("0");
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER){
            if( (int) jTextBookCount.getValue() > Integer.valueOf(jTextCountINStock.getText()))
                JOptionPane.showMessageDialog(this, "This Number of Book is Not Available");
            else{
            int price = Integer.valueOf(jTextPrice.getText());
            int count = (int) jTextBookCount.getValue();
            int Discount = Integer.valueOf(jTextDiscount.getText());
            int total = (price * count) - Discount; 
            jTextTotal.setText(String.valueOf(total));
            jButtonSale.grabFocus();
            }
        }
        
        
    }//GEN-LAST:event_jTextTotalKeyTyped

    private void jTextDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDiscountKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextTotal.grabFocus();

        else if(!(Character.isDigit(num)
            ||(num == KeyEvent.VK_BACK_SPACE)
            ||(num == KeyEvent.VK_DELETE)))
        evt.consume();
    }//GEN-LAST:event_jTextDiscountKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// set picture from database
        if(Online.equals("YES"))
            SetPicture_Online();
        else
            SetPicture();
        
        
// remove jtextfields if number of book in stock is less than 1        
        if(Integer.valueOf(jTextCountINStock.getText()) <= 0)
            Remove_TextFields();
      
// jSpinner  Set minimum and maximum value        
        SpinnerNumberModel model = (SpinnerNumberModel) jTextBookCount.getModel();
        model.setMaximum(Integer.valueOf(jTextCountINStock.getText()));
        model.setMinimum(1);
  
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaleMouseEntered
        jButtonSale.setBackground(Color.BLACK);
        jButtonSale.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSaleMouseEntered

    private void jButtonSaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaleMouseExited
        jButtonSale.setForeground(Color.BLACK);
        jButtonSale.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonSaleMouseExited

    private void jButtonSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaleActionPerformed
            int count = (int) jTextBookCount.getValue();
            int available_book = Integer.valueOf(jTextCountINStock.getText());
            int totalCount = available_book - count;
            jTextCountINStock.setText(String.valueOf(totalCount));
            
            if (available_book <= 0 )
                Remove_TextFields();
            else if(jTextTotal.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please Calculate the Final Price");
            }
            else
                if(Online.equals("YES")){
                    AddToSoldBooks_Online();
                }
                else{
                    AddToSoldBooks();
                }
    }//GEN-LAST:event_jButtonSaleActionPerformed

    private void jButtonSaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSaleKeyTyped

    }//GEN-LAST:event_jButtonSaleKeyTyped

    private void jLogin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogin2MouseEntered
        jLogin2.setBackground(Color.BLACK);
        jLogin2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLogin2MouseEntered

    private void jLogin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogin2MouseExited
        jLogin2.setForeground(Color.BLACK);
        jLogin2.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLogin2MouseExited

    private void jLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogin2ActionPerformed
        if(Online.equals("YES")){        
            Sell_Books book = new Sell_Books();
            book.Online = "YES";
            book.setVisible(true);
            book.pack();
            book.setLocationRelativeTo(null);
            this.dispose();
        }
        else{
            Sell_Books book = new Sell_Books();
            book.setVisible(true);
            book.pack();
            book.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jLogin2ActionPerformed

    private void jLogin2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLogin2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLogin2KeyTyped

    private void jComboBoxEditionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEditionMouseEntered
        jComboBoxEdition.setBackground(new Color(197,218,255));
    }//GEN-LAST:event_jComboBoxEditionMouseEntered

    private void jComboBoxEditionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEditionMouseExited
        jComboBoxEdition.setBackground(Color.WHITE);
        jComboBoxEdition.setForeground(Color.BLACK);
    }//GEN-LAST:event_jComboBoxEditionMouseExited

    private void jComboBoxEditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEditionMouseClicked
        jComboBoxEdition.setBackground(Color.WHITE);
    }//GEN-LAST:event_jComboBoxEditionMouseClicked

    private void jTextBookCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBookCountFocusGained
       
    }//GEN-LAST:event_jTextBookCountFocusGained

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jTextBookSaleIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBookSaleIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBookSaleIdActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified
    
    private void SetPicture(){
        try{
        ResultSet rs;
        conn con = new conn();
        String sql = "SELECT * FROM book where "
            + "(book_id = "+'"'+jTextNumber.getText()+'"'+" );  ";
        PreparedStatement st = con.c.prepareStatement(sql);        
        rs = st.executeQuery();
        rs.next();
        if(rs.getRow() == 1){   
            if(rs.getBytes("picture")== null){
                jLabelPicture.setText("No Picture");
                    st.close();
                    con.c.close();
           }
            else{
            Image image=getToolkit().createImage(rs.getBytes("picture"));
            Image img = image.getScaledInstance(230,275,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
            jLabelPicture.setIcon(icon);
                    st.close();
                    con.c.close();
            }
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void SetPicture_Online(){
        try{
        ResultSet rs;
        conn con = new conn("YES");
        String sql = "SELECT * FROM book where "
            + "(book_id = "+'"'+jTextNumber.getText()+'"'+" );  ";
        PreparedStatement st = con.c.prepareStatement(sql);        
        rs = st.executeQuery();
        rs.next();
        if(rs.getRow() == 1){   
            if(rs.getBytes("picture")== null){
                jLabelPicture.setText("No Picture");
                    st.close();
                    con.c.close();
           }
            else{
            Image image=getToolkit().createImage(rs.getBytes("picture"));
            Image img = image.getScaledInstance(230,275,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
            jLabelPicture.setIcon(icon);
                    st.close();
                    con.c.close();
            }
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    private void SetUpdatedNumberInStock(){
            conn con = new conn();
            String sql = "UPDATE book SET Numbers = ? WHERE book_id = ?";
            try{
                
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, jTextCountINStock.getText());
            st.setInt(2, Integer.valueOf(jTextNumber.getText()));
            st.executeUpdate();
            
                    st.close();
                    con.c.close();
            
            }catch(SQLException | NumberFormatException e){
            }
    }
    private void SetUpdatedNumberInStock_Online(){
            conn con = new conn("YES");
            String sql = "UPDATE book SET Numbers = ? WHERE book_id = ?";
            try{
                
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, jTextCountINStock.getText());
            st.setInt(2, Integer.valueOf(jTextNumber.getText()));
            st.executeUpdate();
            
                    st.close();
                    con.c.close();
            
            }catch(SQLException | NumberFormatException e){
            }
    }
    
    
    private void AddToSoldBooks(){      
         conn con = new conn();           
            String sql = "insert into soldBooks (sale_Id, bookId, bookName, publisher, price,"
                + " Numbers, discount, Total, date) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";               
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            try{
                
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setInt(1, Integer.valueOf(jTextBookSaleId.getText()));
                    st.setInt(2, Integer.valueOf(jTextNumber.getText()));
                    st.setString(3, jTextBookName.getText());
                    st.setString(4, jTextBookPublisher.getText());
                    st.setInt(5, Integer.valueOf(jTextPrice.getText()));
                    st.setInt(6, Integer.valueOf(jTextBookCount.getValue().toString()));
                    st.setInt(7, Integer.valueOf(jTextDiscount.getText()));
                    st.setInt(8, Integer.valueOf(jTextTotal.getText()));
                    st.setString(9, date);
                    int rs = st.executeUpdate();
		if (rs > 0){
                    JOptionPane.showMessageDialog(null, "Book Has Been Sold Succesfuly");
                    SetUpdatedNumberInStock();
                    int BookNum = Integer.valueOf(jTextBookSaleId.getText());
                    BookNum = BookNum + 1;
                    jTextBookSaleId.setText(String.valueOf(BookNum));
                    st.close();
                    con.c.close();
                }
                    st.close();
                    con.c.close();
            }catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
    }
    private void AddToSoldBooks_Online(){      
         conn con = new conn("YES");           
            String sql = "insert into soldBooks (sale_Id, bookId, bookName, publisher, price,"
                + " Numbers, discount, Total, date) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";               
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            try{
                
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setInt(1, Integer.valueOf(jTextBookSaleId.getText()));
                    st.setInt(2, Integer.valueOf(jTextNumber.getText()));
                    st.setString(3, jTextBookName.getText());
                    st.setString(4, jTextBookPublisher.getText());
                    st.setInt(5, Integer.valueOf(jTextPrice.getText()));
                    st.setInt(6, Integer.valueOf(jTextBookCount.getValue().toString()));
                    st.setInt(7, Integer.valueOf(jTextDiscount.getText()));
                    st.setInt(8, Integer.valueOf(jTextTotal.getText()));
                    st.setString(9, date);
                    int rs = st.executeUpdate();
		if (rs > 0){
                    JOptionPane.showMessageDialog(null, "Book Has Been Sold Succesfuly");
                    SetUpdatedNumberInStock_Online();
                    int BookNum = Integer.valueOf(jTextBookSaleId.getText());
                    BookNum = BookNum + 1;
                    jTextBookSaleId.setText(String.valueOf(BookNum));
                    st.close();
                    con.c.close();
                }
                    st.close();
                    con.c.close();
            }catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
    }
    
     private int Number_Of_Sold_Books() {
        String query = "SELECT COUNT(*) FROM soldbooks";
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
                JOptionPane.showMessageDialog(this, "Network Error!");
            }     
            return numberRow;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSale;
    private javax.swing.JComboBox jComboBoxEdition;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JLabel jLabelDiscount;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSaleId;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JButton jLogin2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jTextBookCount;
    private javax.swing.JTextField jTextBookName;
    private javax.swing.JTextField jTextBookPublisher;
    private javax.swing.JTextField jTextBookSaleId;
    private javax.swing.JTextField jTextCountINStock;
    private javax.swing.JTextField jTextDiscount;
    private javax.swing.JTextField jTextNumber;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextTotal;
    // End of variables declaration//GEN-END:variables
}
