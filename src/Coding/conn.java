package Coding;


import java.sql.*;  
import javax.swing.JOptionPane;

public class conn{
    public Connection c;
    public Statement s;
    
    public conn(){
        String url = "jdbc:sqlite:C:\\Library Management\\Database.db";
        try {  
            Class.forName("org.sqlite.JDBC");
            c =DriverManager.getConnection(url);    
            s =c.createStatement();  
            
        }   catch(ClassNotFoundException | SQLException e)  { 
            System.out.println(e);
        }  
    }
    
    
    public conn(String login){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost/library_system?useUnicode=true&character_set_server=utf8mb4?autoReconnect=true&useSSL=false", "root", "Hadi313");
        s =c.createStatement();
     } catch(ClassNotFoundException | SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
}  
