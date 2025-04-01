
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbConnect {
    
     private Connection connect;
     
      public dbConnect(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthingcenter", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
      }
     
      public Connection getConnection() {
        return connect;
      }
      
      
         public boolean insertData(String sql)
    {
        try
        {
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            return true;
        }catch(SQLException ex)
        {
            System.out.println("Connection Error: "+ex);
            return false;
        }
        
        
        
    }
          public ResultSet getData(String sql) throws SQLException
    {
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
        
          
             public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }

    public PreparedStatement getPreparedStatement(String query) {
        try {
            if (connect != null) {
                return connect.prepareStatement(query);
            } else {
                throw new SQLException("Database connection is null");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
    
    

        
    
         
 
      
      
      
      
      
      
      
      


