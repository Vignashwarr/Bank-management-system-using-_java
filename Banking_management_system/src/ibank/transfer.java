/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vigna
 */
public class transfer extends javax.swing.JInternalFrame {

    /**
     * Creates new form transfer
     */
    public transfer() {
        initComponents();
    }
    Connection con;
    PreparedStatement ps1;
    PreparedStatement st1;
    PreparedStatement st2;
    PreparedStatement st3;
    ResultSet rs;
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfacc = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        txttoaccount = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 4, true), "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setText("FromAccount");

        jLabel2.setText("Balance");

        jLabel3.setText("To Account");

        jLabel4.setText("Amount");

        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TRANSFER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfacc)
                            .addComponent(txtbal)
                            .addComponent(txttoaccount)
                            .addComponent(txtamount, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttoaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            String cust_id=txtfacc.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BANK", "root", "31102004");
            ps1=con.prepareStatement("select C.CUST_ID,C.FIRSTNAME,C.LASTNAME,A.BALANCE FROM CUSTOMER C, ACCOUNT A where C.CUST_ID=A.CUST_ID and A.ACC_ID=?");
            ps1.setString(1, cust_id);
            rs=ps1.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Account ID No not Found");
            }
            else
            {
                String bal = rs.getString(4);
                txtbal.setText(bal.trim());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            // TODO add your handling code here:
           String facc = txtfacc.getText();
String bal = txtbal.getText();
String toaccount = txttoaccount.getText();
String amount = txtamount.getText();
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BANK", "root", "31102004");

    // Start the transaction
    con.setAutoCommit(false);

    // Update sender's account balance
    st1 = con.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE - ? WHERE ACC_ID = ?");
    st1.setString(1, amount);
    st1.setString(2, facc);
    st1.executeUpdate();

    // Update receiver's account balance
    st2 = con.prepareStatement("UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ACC_ID = ?");
    st2.setString(1, amount);
    st2.setString(2, toaccount);
    st2.executeUpdate();

    // Insert transfer record
    st3 = con.prepareStatement("INSERT INTO TRANSFER(F_ACCOUNT, TO_ACCOUNT, AMOUNT) VALUES (?, ?, ?)");
    st3.setString(1, facc);
    st3.setString(2, toaccount);
    st3.setString(3, amount);
    st3.executeUpdate();

    // Commit the transaction
    con.commit();
    
    JOptionPane.showMessageDialog(this, "Amount Transferred Successfully");
} catch (ClassNotFoundException | SQLException ex) {
    try {
        if (con != null) {
            con.rollback(); // Rollback the transaction in case of an exception
        }
    } catch (SQLException ex1) {
        Logger.getLogger(transfer.class.getName()).log(Level.SEVERE, null, ex1);
    }
    Logger.getLogger(transfer.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(this, "Error occurred while transferring amount");
} finally {
    try {
        if (con != null) {
            con.setAutoCommit(true); // Reset auto-commit to true
        }
    } catch (SQLException ex) {
        Logger.getLogger(transfer.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtfacc;
    private javax.swing.JTextField txttoaccount;
    // End of variables declaration//GEN-END:variables
}
