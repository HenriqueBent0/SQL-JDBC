package db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class DB {
    
 
    private static Connection conn = null;
    
    
    public static Connection getConnection() {
        
        if (conn == null) {
            try {
                
                Properties props = loadProperties();
               
                String url = props.getProperty("dburl");
          
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
               
                throw new DbException(e.getMessage());
            }
        }
     
        return conn;
    }
    
   
    public static void closeConnection() {
       
        if (conn != null) {
            try {
        
                conn.close();
             
                conn = null;
            } catch (SQLException e) {
             
                throw new DbException(e.getMessage());
            }
        }
    }


    private static Properties loadProperties() {
        Properties props = new Properties();
     
        try (InputStream input = DB.class.getClassLoader().getResourceAsStream("db.properties")) {
           
            if (input == null) {
                throw new DbException("Desculpe, não foi possível encontrar db.properties");
            }
         
            props.load(input);
        } catch (IOException e) {
      
            throw new DbException(e.getMessage());
        }
        
        return props;
    }
    public static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
                    
            }
            
        }
        
    }
    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
                    
                
            }
            
        }
        
    }
}
