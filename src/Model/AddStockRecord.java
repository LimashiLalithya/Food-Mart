/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author asd
 */
public class AddStockRecord {
    Statement stmt;
    public void stock(String id, String name1, String cat, String qnt, String price){
        try{    
            
            
            stmt=DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO product VALUES ('"+id+"','"+name1+"','"+cat+"', '"+qnt+"', '"+price+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
}
