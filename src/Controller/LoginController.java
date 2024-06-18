/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home;
import Model.DbConnection;
import Model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Login;

public class LoginController {
    public static void login(String userid,String pass){
      try{
        String username =null;
        String password = null;
        
        ResultSet rs = new DBSearch().searchLogin(userid);
        while(rs.next()){
        username = rs.getString("userid");
        password = rs.getString("password");
        
        }
        if(username!= null && password != null){
           if(password.equals(pass)){
               System.out.println("Login Successfull ");
               Login.getFrames()[0].dispose();
               new Home().setVisible(true);
           }
           else{
              JOptionPane.showMessageDialog(null, "Please check the credentials ", "Error ", JOptionPane.ERROR_MESSAGE);
           }
        }
           else{
              JOptionPane.showMessageDialog(null, "Please check the credentials ", "Error ", JOptionPane.ERROR_MESSAGE);
           }
           DbConnection.closeCon();
           
        }
      
        catch(SQLException ex){
              Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);  
        }
      }
}

   
    

