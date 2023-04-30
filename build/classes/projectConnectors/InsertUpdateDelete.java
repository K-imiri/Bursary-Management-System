
package projectConnectors;

//This is the public class for inserting, deleting and updating the data in the bursaryManagement Database

import java.sql.*;
import javax.swing.JOptionPane;

public class InsertUpdateDelete {
    public static void setData(String Query, String msg){
        Connection con = null;
        Statement st = null;
        
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
                
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
             try{
            
             }catch(Exception e){
            
             }
        }
    }
}
