package hotelmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;


class DBConnection {
    
    static Connection connection=null;
    public static Connection getConnection(){ 
    
        try {   Class.forName("com.mysql.jdbc.Driver");
                String url= "jdbc:mysql://localhost/fake_hotel_db";
                connection =DriverManager.getConnection(url,"root","root");
                System.out.println("Connected !!!");
        
        
        }catch(Exception e){ e.printStackTrace(); }
    
    
    return connection;
    }
    
    
    
    public static void main(String[] args){
        getConnection();
    
    }
    
    
}
