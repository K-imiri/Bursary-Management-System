
package projectConnectors;



import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBTables {
    public static void main(String [] args){
        Connection con = null;
        Statement st = null;
        
        //Creating tables in bursaryManagement Database
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //User registration and login table
            st.executeUpdate("CREATE TABLE users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),ward varchar(500),status varchar(20))");
            //IEBC Register Table
            st.executeUpdate("CREATE TABLE IEBCRegisterForm(fullName varchar(200),nationalID int NOT NULL,PRIMARY KEY(nationalID))");
            //Biashara Ward Tables
            st.execute("CREATE TABLE biaBursaryForm(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),scoreInPercent int,PRIMARY KEY(nationalID))");
            st.execute("CREATE TABLE biaduplicateID(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),rejectionReason varchar(500))");
            //Flamingo Ward Tables
            st.execute("CREATE TABLE flaBursaryForm(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),scoreInPercent int,PRIMARY KEY(nationalID))");
            st.execute("CREATE TABLE fladuplicateID(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),rejectionReason varchar(500))");
            //Menengai Ward Tables
            st.execute("CREATE TABLE menBursaryForm(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),scoreInPercent int,PRIMARY KEY(nationalID))");
            st.execute("CREATE TABLE menduplicateID(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),rejectionReason varchar(500))");
            //Nakuru East Ward Tables
            st.execute("CREATE TABLE nkrBursaryForm(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),scoreInPercent int,PRIMARY KEY(nationalID))");
            st.execute("CREATE TABLE nkrduplicateID(studentName varchar(200),admNumber varchar(200),nationalID int NOT NULL,studentGender varchar(200),PhoneNumber int,institutionName varchar(200),campusName varchar(200),educationLevel varchar(200),Perfomance varchar(100),yearOfStudy varchar(100),anyDisability varchar (50),disablityProof varchar(200),livingWith varchar(200),supportDocuments varchar(200),siblingSize varchar(50),chiefRecommendation varchar(50),feesArrears varchar(100),memberOfConstituency varchar(200),rejectionReason varchar(500))");
            
           
            JOptionPane.showMessageDialog(null,"Tables created successfuly");
     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
                con.close();
                st.close();
            } catch (Exception e) {
            
            } 
        }
    }
}
