
package projectConnectors;

import javax.swing.JOptionPane;
import java.sql.*;

public class SelectFromDB {
    public static ResultSet getData(String query){
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
