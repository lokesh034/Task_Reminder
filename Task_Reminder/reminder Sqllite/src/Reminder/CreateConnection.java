
package Reminder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateConnection {

    String u;
    
    Connection con=null;
    public void setU(String url)
      {
       u=url;
    }
        
    public Connection setConnection() throws SQLException, ClassNotFoundException{
        
       Class.forName("org.sqlite.JDBC");
       con=DriverManager.getConnection("jdbc:sqlite:"+u+"\\data.db");
       return con;
     
    }
    
    public void disconnecte() throws SQLException
    {
        con.close();
    }
    
    

       
}
