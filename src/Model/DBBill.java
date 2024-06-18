/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SINGER
 */
public class DBBill {
    
    
    private String idTF;
    private String nameTF;
    private String catCMD;
    private double priceTF;
    private int qTF;
    private double total;

    public DBBill(String id, String name, String cat, double price, int qnt, int tax,double total) {
        this.idTF = id;
        this.nameTF = name;
        this.catCMD = cat;
        this.priceTF = price;
        this.qTF = qnt;
        this.total=total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public DBBill()
    {
    
    }
    
    public void setId(String id) {
        this.idTF = id;
    }

    public void setName(String name) {
        this.nameTF = name;
    }

    public void setCat(String cat) {
        this.catCMD = cat;
    }

    public void setQnt(int qnt) {
        this.qTF = qnt;
    }

    public void setPrice(double price) {
        this.priceTF = price;
    }


    public String getId() {
        return idTF;
    }

    public String getName() {
        return nameTF;
    }

    public String getCat() {
        return catCMD;
    }

    public int getQnt() {
        return qTF;
    }

    public double getPrice() {
        return priceTF;
    }
    
    
}
