
package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DbConnection {
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection(){
        try{
        String url="jdbc:mysql://localhost:3306/supermarketdb";
        conn = DriverManager.getConnection(url, "root","");
        
        stat =conn.createStatement();
    }
    catch(Exception e){
       e.printStackTrace();
        
        e.printStackTrace();
    }
        return stat;
    }
    
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
}
