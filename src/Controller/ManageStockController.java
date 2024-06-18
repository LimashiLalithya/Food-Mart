/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class ManageStockController {
    public static void addstock(String id, String name, String cat, String qnt, String price){
     
        
    new Model.AddStockRecord().stock(id, name, cat, qnt, price);
    JOptionPane.showMessageDialog(null, "New Record  has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
