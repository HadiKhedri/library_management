package Coding;

import Tables.All_Books;
import Tables.Sell_Books;
import Tables.Customers_Table;
import Settings.Calculator;
import Settings.Settings;
import Tables.IssuedBooks_Table;
import Tables.Returned_Table;
import Tables.Sold_Books_Table;
import Tables.ToDo;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Hadi
 */
public class HomePage extends javax.swing.JFrame {
    String DataBasePath=null;
    String filename;
    public String Online ="NO";
    
    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "/src/Images/Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
        
    
    
    public HomePage() {
        initComponents();
        
        this.setIconImage(FrameIcon.getImage());
        
        
        showDate();
        this.setLocationRelativeTo(null);
       
        
//        Alert();
    }
    
//    
//    private static class MyTimeTask extends TimerTask
//    {
//
//    @Override
//    public void run()
//    {
//        JOptionPane.showMessageDialog(null, "Hello");
//        System.out.println("Hello");
//    }
//    }
//
//    public static void Alert() {
//        try {
//            //the Date and time at which you want to execute
//            DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
//            Date date = dateFormatter .parse("2021-08-25 03:43 PM");
//            
//            //Now create the time and schedule it
//            Timer timer = new Timer();
//            
//            //Use this if you want to execute it once
//            
//            timer.schedule(new MyTimeTask(), date);
//            
//            //Use this if you want to execute it repeatedly
//            //int period = 10000;//10secs
//            //timer.schedule(new MyTimeTask(), date, period );
//        } catch (ParseException ex) {
//            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
//    
//    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanelRentCounts2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanelRentCounts1 = new javax.swing.JPanel();
        jTextDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextTask = new javax.swing.JTextArea();
        jTextTime = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanelCustomerCounts = new javax.swing.JPanel();
        jLabelCustomer = new javax.swing.JLabel();
        jPanelBookCount = new javax.swing.JPanel();
        jLabelNumberOfBooks = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(16, 18, 24));

        jPanel2.setBackground(new java.awt.Color(0, 6, 12));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/79163-200.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
        );

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setText("Customer");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(true);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setText("List of Returns");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(true);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setText("List of Rents");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(true);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton9.setText("List of Sales");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(true);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton10.setText("List of Books");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setOpaque(true);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton11.setText("Return Book");
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setOpaque(true);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setText("Sell Book");
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setOpaque(true);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton13.setText("Issue Book");
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setOpaque(true);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton14.setText("Add Book");
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setOpaque(true);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 255)));

        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateLabel.setText("yyyy/mm/dd");

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(16, 18, 24));
        jPanel4.setToolTipText("");

        jPanelRentCounts2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sellbookicon.png"))); // NOI18N
        jLabel17.setText("Number OF Sold");
        jLabel17.setToolTipText("");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelRentCounts2Layout = new javax.swing.GroupLayout(jPanelRentCounts2);
        jPanelRentCounts2.setLayout(jPanelRentCounts2Layout);
        jPanelRentCounts2Layout.setHorizontalGroup(
            jPanelRentCounts2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        jPanelRentCounts2Layout.setVerticalGroup(
            jPanelRentCounts2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelRentCounts1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRentCounts1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanelRentCounts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRentCounts1MouseEntered(evt);
            }
        });

        jTextDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextDate.setForeground(new java.awt.Color(133, 133, 133));
        jTextDate.setText("yyyy-mm-dd");
        jTextDate.setToolTipText("");
        jTextDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDateFocusLost(evt);
            }
        });

        jTextTask.setColumns(20);
        jTextTask.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextTask.setForeground(new java.awt.Color(133, 133, 133));
        jTextTask.setLineWrap(true);
        jTextTask.setRows(3);
        jTextTask.setText("Enter a Todo Here when time reaches it will send you an alert");
        jTextTask.setToolTipText("");
        jTextTask.setWrapStyleWord(true);
        jTextTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextTask.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTaskFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTaskFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextTask);

        jTextTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextTime.setForeground(new java.awt.Color(133, 133, 133));
        jTextTime.setText("03:30 PM/AM");
        jTextTime.setToolTipText("");
        jTextTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTimeFocusLost(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("OK");
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setOpaque(true);
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRentCounts1Layout = new javax.swing.GroupLayout(jPanelRentCounts1);
        jPanelRentCounts1.setLayout(jPanelRentCounts1Layout);
        jPanelRentCounts1Layout.setHorizontalGroup(
            jPanelRentCounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRentCounts1Layout.createSequentialGroup()
                .addGroup(jPanelRentCounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTime)
                    .addComponent(jTextDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelRentCounts1Layout.setVerticalGroup(
            jPanelRentCounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRentCounts1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanelRentCounts1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRentCounts1Layout.createSequentialGroup()
                        .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );

        jPanelCustomerCounts.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCustomer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Renticon.png"))); // NOI18N
        jLabelCustomer.setText(" Number of Rent");
        jLabelCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6));
        jLabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCustomerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelCustomerCountsLayout = new javax.swing.GroupLayout(jPanelCustomerCounts);
        jPanelCustomerCounts.setLayout(jPanelCustomerCountsLayout);
        jPanelCustomerCountsLayout.setHorizontalGroup(
            jPanelCustomerCountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCustomerCountsLayout.setVerticalGroup(
            jPanelCustomerCountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );

        jPanelBookCount.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNumberOfBooks.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNumberOfBooks.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNumberOfBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookicon.png"))); // NOI18N
        jLabelNumberOfBooks.setText("Available Books");
        jLabelNumberOfBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 6));
        jLabelNumberOfBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNumberOfBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNumberOfBooksMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBookCountLayout = new javax.swing.GroupLayout(jPanelBookCount);
        jPanelBookCount.setLayout(jPanelBookCountLayout);
        jPanelBookCountLayout.setHorizontalGroup(
            jPanelBookCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNumberOfBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBookCountLayout.setVerticalGroup(
            jPanelBookCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNumberOfBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBookCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRentCounts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCustomerCounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRentCounts2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBookCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCustomerCounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRentCounts2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRentCounts1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SettingsIcon.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/openIcon.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/saveIcon.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel12KeyTyped(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calc.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Backup DataBase");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alerticon.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signouticon.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Calculator calc = new Calculator();
        calc.setVisible(true);
        calc.pack();
        calc.setLocationRelativeTo(jLabel9);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(Online.equals("YES")){
            Settings setting = new Settings();
            setting.Online = "YES";
            setting.setVisible(true);
            setting.pack();
            setting.setLocationRelativeTo(jPanel4);
        }
        else {
            Settings setting = new Settings();
            setting.setVisible(true);
            setting.pack();
            setting.setLocationRelativeTo(jPanel4);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyTyped
        
    }//GEN-LAST:event_jLabel12KeyTyped
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(Online.equals("YES"))
            if(showFileDialog(false) == true)
                backupDataBase();
            else {
        }
        else{
            JOptionPane.showMessageDialog(this, "Online mode can be backup");
        }
         
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(Online.equals("YES"))
            if(showFileDialog(true) == true)
                RestoreDatabase();
            else{            
            }
        else{
            JOptionPane.showMessageDialog(this, "Online mode can be Restored");
        }
 
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabelNumberOfBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNumberOfBooksMouseExited
    File file = new File("bookicon.png");
    String absolutePath = file.getAbsolutePath().replace("bookicon.png", "/src/Images/bookicon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
        
        
        jLabelNumberOfBooks.setIcon(SettingHover);
        
        
        jLabelNumberOfBooks.setText("Available Book");
    }//GEN-LAST:event_jLabelNumberOfBooksMouseExited

    private void jLabelNumberOfBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNumberOfBooksMouseEntered
    File file = new File("bookicon2.png");
    String absolutePath = file.getAbsolutePath().replace("bookicon2.png", "/src/Images/bookicon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
        jLabelNumberOfBooks.setIcon(SettingHover);
        
        
        
        if(Online.equals("YES")){
            jLabelNumberOfBooks.setText("Available"+" : "+ String.valueOf(Number_Of_Books_Online()));            
        }
        else{
            jLabelNumberOfBooks.setText("Available"+" : "+ String.valueOf(Number_Of_Books()));
        }
        
    }//GEN-LAST:event_jLabelNumberOfBooksMouseEntered

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
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER){
            Books book = new Books();
            if(Online.equals("YES")){
                book.Online = "YES";
                if (book.GetBookSearchId_Online(jTextFieldSearch.getText()) == true){
                    book.setVisible(true);
                    book.setLocationRelativeTo(null);
                    book.pack();
            }
            }
            else{
                if (book.GetBookSearchId(jTextFieldSearch.getText()) == true){
                    book.setVisible(true);
                    book.setLocationRelativeTo(null);
                    book.pack();
                }
            }
        }
    }//GEN-LAST:event_jTextFieldSearchKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(Online.equals("NO")){
            jLabel11.setEnabled(false);
            jLabel12.setEnabled(false);
        }
        else{
            jLabel12.setEnabled(true);
            jLabel11.setEnabled(true);
                    }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Books book = new Books();
            if(Online.equals("YES")){
                book.Online = "YES";
                if (book.GetBookSearchId_Online(jTextFieldSearch.getText()) == true){
                    book.setVisible(true);
                    book.setLocationRelativeTo(null);
                    book.pack();
            }
            }
            else{
                if (book.GetBookSearchId(jTextFieldSearch.getText()) == true){
                    book.setVisible(true);
                    book.setLocationRelativeTo(null);
                    book.pack();
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseEntered
        File file = new File("Renticon2.png");
        String absolutePath = file.getAbsolutePath().replace("Renticon2.png", "/src/Images/Renticon2.png");
        ImageIcon SettingHover = new ImageIcon(absolutePath);
        jLabelCustomer.setIcon(SettingHover);
        
        
        if(Online.equals("YES")){
            jLabelCustomer.setText(" Number"+" : " + String.valueOf(Number_Of_Rents_Online()));
        }
        else{
            jLabelCustomer.setText(" Number"+" : " + String.valueOf(Number_Of_Rents()));
        }
    }//GEN-LAST:event_jLabelCustomerMouseEntered

    private void jLabelCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseExited
        
        File file = new File("Renticon.png");
        String absolutePath = file.getAbsolutePath().replace("Renticon.png", "/src/Images/Renticon.png");
        ImageIcon SettingHover = new ImageIcon(absolutePath);
        jLabelCustomer.setIcon(SettingHover);
        
        
        jLabelCustomer.setText(" Number of Rent");
    }//GEN-LAST:event_jLabelCustomerMouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        File file = new File("sellbookicon2.png");
        String absolutePath = file.getAbsolutePath().replace("sellbookicon2.png", "/src/Images/sellbookicon2.png");
        ImageIcon SettingHover = new ImageIcon(absolutePath);
        jLabel17.setIcon(SettingHover);
        
        
        if(Online.equals("YES")){
            jLabel17.setText("Sold"+" : " + String.valueOf(Number_Of_Sold_Online()));            
        }
        else {
            jLabel17.setText("Sold"+" : " + String.valueOf(Number_Of_Sold()));
        }
        
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        
        File file = new File("sellbookicon.png");
        String absolutePath = file.getAbsolutePath().replace("sellbookicon.png", "/src/Images/sellbookicon.png");
        ImageIcon SettingHover = new ImageIcon(absolutePath);
        jLabel17.setIcon(SettingHover);
        
        
        jLabel17.setText("Number Of Sold");
    }//GEN-LAST:event_jLabel17MouseExited

    private void jTextDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDateFocusGained
        if(jTextDate.getText().trim().equals("yyyy-mm-dd")){
            jTextDate.setText("");
            jTextDate.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextDateFocusGained

    private void jTextDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDateFocusLost
        if(jTextDate.getText().trim().equals("")||
            jTextDate.getText().trim().equals("yyyy-mm-dd")){
            jTextDate.setText("yyyy-mm-dd");
            jTextDate.setForeground(new Color(133,133,133));
        }
    }//GEN-LAST:event_jTextDateFocusLost

    private void jTextTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTimeFocusGained
        if(jTextTime.getText().trim().equals("03:30 PM/AM")){
            jTextTime.setText("");
            jTextTime.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextTimeFocusGained

    private void jTextTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTimeFocusLost
        if(jTextTime.getText().trim().equals("")||
            jTextTime.getText().trim().equals("03:30 PM/AM")){
            jTextTime.setText("03:30 PM/AM");
            jTextTime.setForeground(new Color(133,133,133));
        }
    }//GEN-LAST:event_jTextTimeFocusLost

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        ToDo todo = new ToDo();
        todo.setVisible(true);
        todo.setLocationRelativeTo(null);
        todo.pack();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTextTaskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTaskFocusGained
         if(jTextTask.getText().trim().equals("Enter a Todo Here when time reaches it will send you an alert")){
            jTextTask.setText("");
            jTextTask.setForeground(Color.BLACK);
        }        
    }//GEN-LAST:event_jTextTaskFocusGained

    private void jTextTaskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTaskFocusLost
        if(jTextTask.getText().trim().equals("")||
            jTextTask.getText().trim().equals("Enter a Todo Here when time reaches it will send you an alert")){
            jTextTask.setText("Enter a Todo Here when time reaches it will send you an alert");
            jTextTask.setForeground(new Color(133,133,133));
        }
    }//GEN-LAST:event_jTextTaskFocusLost
     
    

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
    File file = new File("SettingsIcon2.png");
    String absolutePath = file.getAbsolutePath().replace("SettingsIcon2.png", "/src/Images/SettingsIcon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
        
        
        jLabel10.setIcon(SettingHover);
        
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
    File file = new File("SettingsIcon.png");
    String absolutePath = file.getAbsolutePath().replace("SettingsIcon.png", "/src/Images/SettingsIcon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
        
        
        jLabel10.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        File file = new File("alerticon2.png");
    String absolutePath = file.getAbsolutePath().replace("alerticon2.png", "/src/Images/alerticon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
        
        
        jLabel15.setIcon(SettingHover);
        
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
       File file = new File("alerticon.png");
    String absolutePath = file.getAbsolutePath().replace("alerticon.png", "/src/Images/alerticon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);
      
        jLabel15.setIcon(SettingHover); 
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
    File file = new File("openIcon2.png");
    String absolutePath = file.getAbsolutePath().replace("openIcon2.png", "/src/Images/openIcon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel11.setIcon(SettingHover);
        
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
    File file = new File("openIcon.png");
    String absolutePath = file.getAbsolutePath().replace("openIcon.png", "/src/Images/openIcon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel11.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        File file = new File("saveIcon2.png");
    String absolutePath = file.getAbsolutePath().replace("saveIcon2.png", "/src/Images/saveIcon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel12.setIcon(SettingHover);
        
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        File file = new File("saveIcon.png");
    String absolutePath = file.getAbsolutePath().replace("saveIcon.png", "/src/Images/saveIcon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel12.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.WHITE);
        jButton1.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseExited

    private void jPanelRentCounts1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRentCounts1MouseEntered

    }//GEN-LAST:event_jPanelRentCounts1MouseEntered

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
           File file = new File("signouticon2.png");
    String absolutePath = file.getAbsolutePath().replace("signouticon2.png", "/src/Images/signouticon2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel18.setIcon(SettingHover);
        
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
         File file = new File("signouticon.png");
    String absolutePath = file.getAbsolutePath().replace("signouticon.png", "/src/Images/signouticon.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel18.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        File file = new File("calc2.png");
    String absolutePath = file.getAbsolutePath().replace("calc2.png", "/src/Images/calc2.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel9.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        File file = new File("calc.png");
    String absolutePath = file.getAbsolutePath().replace("calc.png", "/src/Images/calc.png");
    ImageIcon SettingHover = new ImageIcon(absolutePath);

        jLabel9.setIcon(SettingHover);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(new Color(0,102,153));
        jButton6.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setForeground(Color.BLACK);
        jButton6.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(Online.equals("YES")) {
            Customers_Table customer = new Customers_Table();
            customer.Online = "YES";
            customer.setVisible(true);
            customer.pack();
            customer.setLocationRelativeTo(null);    
        }
        else {
            Customers_Table customer = new Customers_Table();
            customer.setVisible(true);
            customer.pack();
            customer.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBackground(new Color(0,102,153));
        jButton7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(Online.equals("YES")) {
            Returned_Table table = new Returned_Table();
            table.Online = "YES";
            table.setVisible(true);
            table.setLocationRelativeTo(null);
            table.pack();    
        }
        else {
            Returned_Table table = new Returned_Table();
            table.setVisible(true);
            table.setLocationRelativeTo(null);
            table.pack();    
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jButton8.setBackground(new Color(0,102,153));
        jButton8.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        jButton8.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(Online.equals("YES")){
            IssuedBooks_Table t = new IssuedBooks_Table();
            t.Online = "YES";
            t.setVisible(true);
            t.setLocationRelativeTo(null);
            t.pack();
        }
        else{
            IssuedBooks_Table t = new IssuedBooks_Table();
            t.setVisible(true);
            t.setLocationRelativeTo(null);
            t.pack();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setBackground(new Color(0,102,153));
        jButton9.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        jButton9.setForeground(Color.BLACK);
        jButton9.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(Online.equals("YES")){
            Sold_Books_Table sold = new Sold_Books_Table();
            sold.Online = "YES";
            sold.setVisible(true);
            sold.pack();
            sold.setLocationRelativeTo(null);  
        }
        else{
            Sold_Books_Table sold = new Sold_Books_Table();
            sold.setVisible(true);
            sold.pack();
            sold.setLocationRelativeTo(null);  
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        jButton10.setBackground(new Color(0,102,153));
        jButton10.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        jButton10.setForeground(Color.BLACK);
        jButton10.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(Online.equals("YES")){
            All_Books all = new All_Books();
            all.setVisible(true);
            all.Online = "YES";
            all.pack();
            all.setLocationRelativeTo(null);    
        }
        else{
            All_Books all = new All_Books();
            all.setVisible(true);
            all.pack();
            all.setLocationRelativeTo(null);  
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        jButton11.setBackground(new Color(0,102,153));
        jButton11.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        jButton11.setForeground(Color.BLACK);
        jButton11.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(Online.equals("YES")){
            Return_Book rb = new Return_Book();
            rb.Online = "YES";
            rb.setVisible(true);
            rb.pack();
            rb.setLocationRelativeTo(null);
        }
        else{
            Return_Book rb = new Return_Book();
            rb.setVisible(true);
            rb.pack();
            rb.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        jButton12.setBackground(new Color(0,102,153));
        jButton12.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        jButton12.setForeground(Color.BLACK);
        jButton12.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(Online.equals("YES")){
            Sell_Books book = new Sell_Books();
            book.Online = "YES";
            book.setVisible(true);
            book.pack();
            book.setLocationRelativeTo(null);           
       }
       else {
            Sell_Books book = new Sell_Books();
            book.setVisible(true);
            book.pack();
            book.setLocationRelativeTo(null); 
       }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        jButton13.setBackground(new Color(0,102,153));
        jButton13.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        jButton13.setForeground(Color.BLACK);
        jButton13.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(Online.equals("YES")){
            IssueBook issue = new IssueBook();
            issue.Online = "YES";
            issue.setVisible(true);
            issue.setLocationRelativeTo(null);
            issue.pack();
        }
        else {
            IssueBook issue = new IssueBook();
            issue.setVisible(true);
            issue.setLocationRelativeTo(null);
            issue.pack();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        jButton14.setBackground(new Color(0,102,153));
        jButton14.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        jButton14.setForeground(Color.BLACK);
        jButton14.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(Online.equals("YES")){
            Add_Book  add = new Add_Book();
            add.Online = "YES";
            add.setVisible(true);
            add.setLocationRelativeTo(null);
            add.pack();            
        }
        else {
            Add_Book  add = new Add_Book();
            add.setVisible(true);
            add.setLocationRelativeTo(null);
            add.pack(); 
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        jButton15.setBackground(new Color(0,102,153));
        jButton15.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        jButton15.setForeground(Color.WHITE);
        jButton15.setBackground(Color.BLACK);
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(Online.equals("YES")){
            Todo();
        }
        else{
            Todo_Online();
        }
    }//GEN-LAST:event_jButton15ActionPerformed
/****************ّFunctions. ********************************************/
    
    private void showDate() {    
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        DateLabel.setText(sdf.format(date));
    }
    private int Number_Of_Books() {
        String query = "SELECT COUNT(*) FROM book";
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
    private int Number_Of_Books_Online() {
        String query = "SELECT COUNT(*) FROM book";
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
    
    private int Number_Of_Rents() {
        String query = "SELECT COUNT(*) FROM issuebook";
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
    private int Number_Of_Rents_Online() {
        String query = "SELECT COUNT(*) FROM issuebook";
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
    
    private int Number_Of_Sold() {
        String query = "SELECT COUNT(*) FROM soldBooks";
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
    private int Number_Of_Sold_Online() {
        String query = "SELECT COUNT(*) FROM soldBooks";
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
    
    private void backupDataBase() {
        Process p;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -pHadi313 --add-drop-database -B library_system -r"+DataBasePath);
            
            int processComplete = p.waitFor();
            if (processComplete==0) {
                JOptionPane.showMessageDialog(this, "Backup succesfully");
            }else{
                JOptionPane.showMessageDialog(this, "Error Saving Database");
            }
        } catch (IOException | InterruptedException | HeadlessException e) {
        }
    }
    
    private void RestoreDatabase() {
        String dbUserName = "root";// username
        String dbPassword = "Hadi313";//Password
        String[] restoreCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe ", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + DataBasePath};
        Process runtimProcess;
        try {
            runtimProcess = Runtime.getRuntime().exec(restoreCmd);
            int proceCom = runtimProcess.waitFor();
            if (proceCom==0) {
                JOptionPane.showMessageDialog(this, "Database Loaded succesfully");
            }else{
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (IOException | InterruptedException | HeadlessException e) {
        
        }
    }
    
    private boolean showFileDialog(final boolean open) {
        JFileChooser fc = new JFileChooser("Open a File");
        javax.swing.filechooser.FileFilter ff = new javax.swing.filechooser.FileFilter() {
       @Override
       public boolean accept(java.io.File f) {
          String name = f.getName().toLowerCase();
          if(open==true)
                return f.isDirectory()||name.endsWith(".sql");
          return f.isDirectory()||name.endsWith(".sql");
          }
       @Override
       public String getDescription() {
          if(open==true)
             return "Database (*.sql)";
          return "sql (*.sql)";
          }
       };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(ff);

        if(open && fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){    
            DataBasePath  =  fc.getSelectedFile().getAbsolutePath();
            DataBasePath = DataBasePath.replace('\\', '/');
            return true;
        }
        else if(!open && fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            DataBasePath  =  fc.getSelectedFile().getAbsolutePath();
            DataBasePath = DataBasePath.replace('\\', '/');
            DataBasePath = DataBasePath + "_" + date + ".sql";
            return true;
        }
        return false;
    } 
    
    private void Todo() {
        String Query = "INSERT INTO todo (No, Date, Time, Task)"
        + " VALUES(?,?,?,?)";
        PreparedStatement ps;
        conn con = new conn();
        try {
            ToDo todo = new ToDo();
            ps = con.c.prepareStatement(Query);
            
            ps.setInt(1, todo.getRowNumber()+1);
            ps.setString(2, jTextDate.getText());
            ps.setString(3, jTextTime.getText());
            ps.setString(4, jTextTask.getText());
            
            int rs = ps.executeUpdate();

            if(rs > 0){
                JOptionPane.showMessageDialog(this, "Added Succesfully");
                jTextTask.setText("");
                jTextTime.setText("");
                jTextDate.setText("");
            }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    private void Todo_Online() {
        String Query = "INSERT INTO todo (No, Date, Time, Task)"
        + " VALUES(?,?,?,?)";
        PreparedStatement ps;
        conn con = new conn("YES");
        try {
            ToDo todo = new ToDo();
            ps = con.c.prepareStatement(Query);
            
            ps.setInt(1, todo.getRowNumber()+1);
            ps.setString(2, jTextDate.getText());
            ps.setString(3, jTextTime.getText());
            ps.setString(4, jTextTask.getText());
            
            int rs = ps.executeUpdate();

            if(rs > 0){
                JOptionPane.showMessageDialog(this, "Added Succesfully");
                jTextTask.setText("");
                jTextTime.setText("");
                jTextDate.setText("");
            }
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Error");
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelNumberOfBooks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBookCount;
    private javax.swing.JPanel jPanelCustomerCounts;
    private javax.swing.JPanel jPanelRentCounts1;
    private javax.swing.JPanel jPanelRentCounts2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextDate;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextArea jTextTask;
    private javax.swing.JTextField jTextTime;
    // End of variables declaration//GEN-END:variables
}
