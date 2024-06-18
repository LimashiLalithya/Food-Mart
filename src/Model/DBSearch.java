package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearch {
    
     Statement stmt; 
     ResultSet rs;
     
    public ResultSet Login(){
      try{
         stmt = DbConnection.getStatementConnection();
         rs = stmt.executeQuery("SELECT * FROM student");
      }
      catch(Exception e){  
      }
      return rs;
    }
   
    
    
    public ResultSet searchLogin(String id){
      try{
        stmt = DbConnection.getStatementConnection();
        String name = id;
        
        rs = stmt.executeQuery("SELECT * FROM login where username = '"+name+"'");
      }
      catch(Exception e){
        e.printStackTrace();
      }
      return rs;
    }
}

//public ResultSet product{


 

//}