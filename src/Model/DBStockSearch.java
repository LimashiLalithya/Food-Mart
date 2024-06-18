/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asd
 */
public class DBStockSearch {
    ResultSet rs;
    public ResultSet searchStock(){
        
        try{
            Statement stmt = DbConnection.getStatementConnection();
            rs=stmt.executeQuery("Select * FROM product");
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
            
        return rs;
    }
    
    public ResultSet searchItem(String ID){
        
        try{
            Statement stmt = DbConnection.getStatementConnection();
            rs=stmt.executeQuery("Select * FROM product Where pid='"+ID+"' ");
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
            
        return rs;
    }
}
