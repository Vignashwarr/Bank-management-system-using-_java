/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author janani
 */
public class tables {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
         
          /*st.executeUpdate("CREATE TABLE CUSTOMER (\n" +
"    ID INT AUTO_INCREMENT PRIMARY KEY,\n" +
"    CUST_ID VARCHAR(255),\n" +
"    FIRSTNAME VARCHAR(255),\n" +
"    LASTNAME VARCHAR(255),\n" +
"    STREET VARCHAR(255),\n" +
"    CITY VARCHAR(255),\n" +
"    BRANCH VARCHAR(255),\n" +
"    MOBILE_NO VARCHAR(255)\n" +
");");?*/
          /*st.executeUpdate("CREATE TABLE ACCOUNT (\n" +
"    ID INT(11) PRIMARY KEY AUTO_INCREMENT,\n" +
"    ACC_ID VARCHAR(255),\n" +
"    CUST_ID VARCHAR(255),\n" +
"    ACC_TYPE VARCHAR(255),\n" +
"    BALANCE INT(11)\n" +
");");*/


/*st.executeUpdate("CREATE TABLE BRANCH (\n" +
"    ID INT PRIMARY KEY AUTO_INCREMENT,\n" +
"    BRANCH VARCHAR(255)\n" +
");");*/

st.executeUpdate("CREATE TABLE DEPOSIT (\n" +
"    ID INT(11) PRIMARY KEY AUTO_INCREMENT,\n" +
"    ACC_ID VARCHAR(255),\n" +
"    CUST_ID VARCHAR(255),\n" +
"    DATE VARCHAR(255),\n" +
"    BALANCE INT(11),\n" +
"    DEPOSIT INT(11)\n" +
");");

/*st.executeUpdate("CREATE TABLE WITHDRAW (\n" +
"    ID INT(11) PRIMARY KEY AUTO_INCREMENT,\n" +
"    ACC_ID VARCHAR(255),\n" +
"    CUST_ID VARCHAR(255),\n" +
"    DATE VARCHAR(255),\n" +
"    BALANCE INT(11),\n" +
"    WITHDRAW INT(11)\n" +
");");*/

/*st.executeUpdate("CREATE TABLE TRANSFER (\n" +
"    ID INT(11) PRIMARY KEY AUTO_INCREMENT,\n" +
"    F_ACCOUNT VARCHAR(255),\n" +
"    TO_ACCOUNT VARCHAR(255),\n" +
"    AMOUNT INT(11)\n" +
");");?*/
           JOptionPane.showMessageDialog(null, "TABLE CREATED SUCCESSFULLY");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch(SQLException e)
        {}
        }
    }
}
