/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author SINGER
 */
public class SMS extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SMS() {
        initComponents();
    }

    /**admin
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SMS = new javax.swing.JProgressBar();
        Percent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Welcome to My Food Mart  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 90));
        jPanel1.add(SMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, 20));

        Percent.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        Percent.setForeground(new java.awt.Color(0, 102, 102));
        Percent.setText("%");
        jPanel1.add(Percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SMS MySMS = new SMS();
        MySMS.setVisible(true);
        try{
            for(int i =0; i<=100; i++)
            {
                Thread.sleep(100);
                MySMS.SMS.setValue(i);
                MySMS.Percent.setText(i+"%");
            }
        }catch(Exception e)
    {
        
    }
    new Login().setVisible(true);
    MySMS.dispose();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Percent;
    private javax.swing.JProgressBar SMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
