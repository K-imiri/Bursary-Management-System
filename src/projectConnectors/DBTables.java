
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
            
           //Biashara Report tables
           st.execute("CREATE TABLE biatotalApplicant(SELECT sum(biatotal.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM biabursaryform UNION ALL SELECT COUNT(*) as totalNumber FROM biaduplicateid)biatotal)");
           st.execute("CREATE TABLE biarejectedApplicant(SELECT sum(biareject.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM biabursaryform WHERE scoreInPercent<50 UNION ALL SELECT COUNT(*) as totalNumber FROM biaduplicateid)biareject)");
           st.execute("CREATE TABLE biasuccessApplicant(SELECT COUNT(*) FROM biaBursaryForm WHERE scoreInPercent>59)");
           st.execute("CREATE TABLE biaDisableApplicant(SELECT COUNT(*) FROM biaBursaryForm WHERE anyDisability = 'Disable')");
           st.execute("CREATE TABLE biamaleApplicant(SELECT COUNT(*) FROM biaBursaryForm WHERE studentGender = 'male')");
           st.execute("CREATE TABLE biafemaleApplicant(SELECT COUNT(*) FROM biaBursaryForm WHERE studentGender = 'female')");
           
           //Flamingo Report tables
           st.execute("CREATE TABLE flatotalApplicant(SELECT sum(flatotal.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM flabursaryform UNION ALL SELECT COUNT(*) as totalNumber FROM fladuplicateid)flatotal)");
           st.execute("CREATE TABLE flarejectedApplicant(SELECT sum(flareject.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM flabursaryform WHERE scoreInPercent<50 UNION ALL SELECT COUNT(*) as totalNumber FROM fladuplicateid)flareject)");
           st.execute("CREATE TABLE flasuccessApplicant(SELECT COUNT(*) FROM flaBursaryForm WHERE scoreInPercent>59)");
           st.execute("CREATE TABLE flaDisableApplicant(SELECT COUNT(*) FROM flaBursaryForm WHERE anyDisability = 'Disable')");
           st.execute("CREATE TABLE flamaleApplicant(SELECT COUNT(*) FROM flaBursaryForm WHERE studentGender = 'male')");
           st.execute("CREATE TABLE flafemaleApplicant(SELECT COUNT(*) FROM flaBursaryForm WHERE studentGender = 'female')");
           
           //Menengai Report tables
           st.execute("CREATE TABLE mentotalApplicant(SELECT sum(mentotal.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM menbursaryform UNION ALL SELECT COUNT(*) as totalNumber FROM menduplicateid)mentotal)");
           st.execute("CREATE TABLE menrejectedApplicant(SELECT sum(menreject.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM menbursaryform WHERE scoreInPercent<50 UNION ALL SELECT COUNT(*) as totalNumber FROM menduplicateid)menreject)");
           st.execute("CREATE TABLE mensuccessApplicant(SELECT COUNT(*) FROM menBursaryForm WHERE scoreInPercent>59)");
           st.execute("CREATE TABLE menDisableApplicant(SELECT COUNT(*) FROM menBursaryForm WHERE anyDisability = 'Disable')");
           st.execute("CREATE TABLE menmaleApplicant(SELECT COUNT(*) FROM menBursaryForm WHERE studentGender = 'male')");
           st.execute("CREATE TABLE menfemaleApplicant(SELECT COUNT(*) FROM menBursaryForm WHERE studentGender = 'female')");
           
           //Nakuru East Report tables
           st.execute("CREATE TABLE nkrtotalApplicant(SELECT sum(nkrtotal.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM nkrbursaryform UNION ALL SELECT COUNT(*) as totalNumber FROM nkrduplicateid)nkrtotal)");
           st.execute("CREATE TABLE nkrrejectedApplicant(SELECT sum(nkrreject.totalNumber)FROM(SELECT COUNT(*) as totalNumber FROM nkrbursaryform WHERE scoreInPercent<50 UNION ALL SELECT COUNT(*) as totalNumber FROM nkrduplicateid)nkrreject)");
           st.execute("CREATE TABLE nkrsuccessApplicant(SELECT COUNT(*) FROM nkrBursaryForm WHERE scoreInPercent>59)");
           st.execute("CREATE TABLE nkrDisableApplicant(SELECT COUNT(*) FROM nkrBursaryForm WHERE anyDisability = 'Disable')");
           st.execute("CREATE TABLE nkrmaleApplicant(SELECT COUNT(*) FROM nkrBursaryForm WHERE studentGender = 'male')");
           st.execute("CREATE TABLE nkrfemaleApplicant(SELECT COUNT(*) FROM nkrBursaryForm WHERE studentGender = 'female')");
           
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
