/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vignashwarr
 */
public class Select {
    public static ResultSet getData(String query)
    {
        Connection Con=null;
        Statement st=null;
        ResultSet rs=null;
        try
        {
            Con=ConnectionProvider.getCon();
            st=Con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
