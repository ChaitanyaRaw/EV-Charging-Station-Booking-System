/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evchargingstaionfinder;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class singin extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
     
    /**
     * Creates new form singin
     */
    public singin() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2- getHeight()/2);
        conn= DBConecter.java_db();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        evupass = new javax.swing.JTextField();
        mno = new javax.swing.JTextField();
        ResitationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/14JPG.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/5IMG.png"))); // NOI18N
        login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(255, 102, 0))); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 160, 170));

        jLabel5.setFont(new java.awt.Font("Andalus", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Find EV Station");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 180, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/7IMG.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 50, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("Passwprd");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 80, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Mobile NO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 80, 30));

        evupass.setBackground(new java.awt.Color(0, 0, 0,80));
        evupass.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        evupass.setForeground(new java.awt.Color(255, 255, 255));
        evupass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        evupass.setBorder(null);
        jPanel1.add(evupass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 110, 30));

        mno.setBackground(new java.awt.Color(0, 0, 0,80));
        mno.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        mno.setForeground(new java.awt.Color(255, 255, 255));
        mno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mno.setBorder(null);
        jPanel1.add(mno, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 110, 30));

        ResitationButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        ResitationButton.setText(" Resiter Now");
        ResitationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResitationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResitationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/13IMG.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 260, 370));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/15JPG.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    String sql="SELECT no,mobile,pass from userinfo where( mobile= ? and pass = ? )";
    try{
        int count=0;
        pst=conn.prepareStatement(sql);     
        pst.setString(1 ,mno.getText());
        pst.setString(2 ,evupass.getText());
        rs=pst.executeQuery();
        while(rs.next()){
        count=count+1;        
        }       
        JOptionPane.showMessageDialog(null,"User Login successfuly (*-*) ");
        HomePage j=new HomePage();
        j.setVisible(true);
        this.dispose();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Username and Password is Incorrect!...");
        }        
        finally {
        try{
        rs.close();
        pst.close();
        }catch(Exception e){
        }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void ResitationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResitationButtonActionPerformed
        // TODO add your handling code here:
        EVadminp j=new EVadminp();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResitationButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResitationButton;
    private javax.swing.JTextField evupass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField mno;
    // End of variables declaration//GEN-END:variables
}
