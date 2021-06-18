package Classes;

import java.io.File;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import javax.swing.JCheckBox;

/**
 * A method that deals with all the database methods
 * @author Mr S Malinga(218021100)
 */

public class databaseManager {

    /**
     * A connection to the FitnessFever database
     */
    
    private Connection conn;
    
    /**
     * A connection to the FirnessFeverLoginDetails database
     */
    private Connection con;
    
    /**
     * A constructor used to get the connection to the database when the object is declared
     */
    
    public databaseManager() 
    {
        try 
        {
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + new File("FitnessFever.accdb").getAbsolutePath());
            con = DriverManager.getConnection("jdbc:ucanaccess://" + new File ("FitnessFeverLoginDetails.accdb").getAbsolutePath());
            System.out.println("Connection successful :D");
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("Error: " + ex);
        }
    }

    /**
     * A typed method used to return an array of the gyms in the database
     * @return
     * @throws SQLException 
     */
    
    public gyms[] getGym() throws SQLException 
    {
        gyms gymArr[] = new gyms[50];
        int counter = 0;

        int gymID;
        String gymName, gymLocation, gymEmail;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM tblGyms");

        while (rs.next()) 
        {
            gymID = rs.getInt("GymID");
            gymName = rs.getString("GymName");
            gymLocation = rs.getString("GymLocation");
            gymEmail = rs.getString("GymEmail");

            gymArr[counter] = new gyms(gymID, gymName, gymLocation, gymEmail);
            counter++;
        }
        
        return gymArr;
    }
    
    /**
     * A method that uses a SQL statement in the parameter and display it into a JTable
     * @param table
     * @param sql
     * @throws SQLException 
     */
    
    public void display(JTable table, String sql) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        table.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * A method that adds the column names to a JTable to allow the user to choose which field they want to order the table by
     * @param combo
     * @param sql
     * @throws SQLException 
     */
    
    public void getColumnNames(JComboBox combo, String sql) throws SQLException 
    {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) 
        {
            combo.addItem(rsmd.getColumnName(i));
        }

    }

    /**
     * A method used to return the ID of any object depending on the parameters they want t o enter
     * @param sql
     * @param field
     * @return
     * @throws SQLException 
     */
    
    public int getID(String sql, String field) throws SQLException 
    {
        int id = 0;

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) 
        {
            id = rs.getInt(field);
        }
        
        return id;
    }

    /**
     * A types method used to return an array of member objects
     * @return
     * @throws SQLException 
     */
    
    public members[] getMembers() throws SQLException 
    {
        members memberArr[] = new members[200];
        int counter = 0;

        int memberID, personalTrainerID, gymID;
        String name, surname, dateOfBirth, cellNo, email;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM tblMembers");

        while (rs.next()) 
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

            memberID = rs.getInt("MemberID");
            name = rs.getString("MemberName");
            surname = rs.getString("MemberSurname");
            dateOfBirth = sdf.format(rs.getDate("MemberDoB"));
            cellNo = rs.getString("MemberCell");
            email = rs.getString("MemberEmail");
            gymID = rs.getInt("GymID");
            personalTrainerID = rs.getInt("PersonalTrainerID");

            memberArr[counter] = new members(memberID, name, surname, dateOfBirth, cellNo, email, gymID, personalTrainerID);
            counter++;
        }
        
        return memberArr;
    }

    /**
     * A typed method used to return an array of personalTrainer objects
     * @return
     * @throws SQLException 
     */
    
    public personalTrainers[] getPersonalTrainers() throws SQLException 
    {
        personalTrainers PTArr[] = new personalTrainers[100];
        int counter = 0;

        int personalTrainerID, gymID;
        String name, surname, cellNo, email;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM tblPersonalTrainers");

        while (rs.next()) 
        {
            personalTrainerID = rs.getInt("PersonalTrainerID");
            name = rs.getString("PersonalTrainerName");
            surname = rs.getString("PersonalTrainerSurname");
            cellNo = rs.getString("PersonalTrainerCell");
            email = rs.getString("PersonalTrainerEmail");
            gymID = rs.getInt("GymID");

            PTArr[counter] = new personalTrainers(personalTrainerID, name, surname, cellNo, email, gymID);
            counter++;
        }
        
        return PTArr;
    }

    /**
     * A typed method used to return an array of activities objects
     * @return
     * @throws SQLException 
     */
    
    public activities[] getActivities() throws SQLException 
    {
        activities activityArr[] = new activities[100];
        int counter = 0;

        int activityID, duration, gymID;
        String name, days, startTime;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM tblActivities");

        while (rs.next()) 
        {
            activityID = rs.getInt("ActivityID");
            name = rs.getString("ActivityName");
            duration = rs.getInt("ActivityDuration");
            days = rs.getString("ActivityDaysCode");
            startTime = rs.getString("ActivityStartTime");
            gymID = rs.getInt("GymID");

            activityArr[counter] = new activities(activityID, name, duration, days, startTime, gymID);
            counter++;
        }
        
        return activityArr;
    }

    /**
     * A typed method used to return an array of exercises objects
     * @return
     * @throws SQLException 
     */
    
    public exercises[] getExercises() throws SQLException 
    {
        exercises exerciseArr[] = new exercises[200];
        int counter = 0;

        int memberID, gymID, activityID;
        String date;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM tblExercises");

        while (rs.next()) 
        {
            memberID = rs.getInt("MemberID");
            gymID = rs.getInt("GymID");
            activityID = rs.getInt("ActivityID");
            date = rs.getString("ExerciseDate");

            exerciseArr[counter] = new exercises(memberID, gymID, activityID, date);
            counter++;
        }
        
        return exerciseArr;
    }

    /**
     * A typed method used to check whether the login details are correct and if they are they return the user type ID
     * @param inUsername
     * @param inPassword
     * @return
     * @throws SQLException 
     */
    public int checkLogin(JTextField inUsername, JPasswordField inPassword) throws SQLException 
    {
        String email, password;
        int userType = 0;

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM tblLoginDetails");

        while (rs.next()) 
        {
            email = rs.getString("EmailAddress");
            password = rs.getString("Password");

            if (email.equals(inUsername.getText())) 
            {
                if (password.equals(inPassword.getText())) 
                {
                    userType = rs.getInt("UserTypeID");
                    break;
                }
            }
        }
        
        return userType;
    }

    /**
     * A typed method to return the password of a specific email
     * @param email
     * @return
     * @throws SQLException 
     */
    
    public String getPassword(String email) throws SQLException 
    {
        String password = "";

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT EmailAddress, Password FROM tblLoginDetails");

        while (rs.next()) 
        {
            if (rs.getString("EmailAddress").equals(email))
            {
                password = rs.getString("Password");
            }
        }
        
        return password;
    }

    /**
     * A typed method that returns false if the email hasn't been used and true if the email has been used
     * @param inEmail
     * @return
     * @throws SQLException 
     */
    
    public boolean checkEmail(String inEmail) throws SQLException
    {
        boolean check = false;
        String email;

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT EmailAddress FROM tblLoginDetails");

        while (rs.next())
        {
            email = rs.getString("EmailAddress");
            if (inEmail.equals(email))
            {
                check = true;
            }
        }
        
        return check;
    }

    /**
     * A typed method used to return true if the gym ID exists and false if the gym ID doesn't exist
     * @param inGymID
     * @return
     * @throws SQLException 
     */
    
    public boolean checkGymID(int inGymID) throws SQLException 
    {
        boolean check = false;
        int gymID;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT GymID FROM tblGyms");

        while (rs.next()) 
        {
            gymID = rs.getInt("GymID");

            if (gymID == inGymID) 
            {
                check = true;
            }
        }
        
        return check;
    }

    /**
     * A typed method to return true if the personal trainer ID exists and false if it doesn't 
     * @param inPTID
     * @return
     * @throws SQLException 
     */
    
    public boolean checkPersonalTrainerID(int inPTID) throws SQLException 
    {
        boolean check = false;
        int PTID;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT PersonalTrainerID FROM tblPersonalTrainers");

        while (rs.next()) 
        {
            PTID = rs.getInt("PersonalTrainerID");

            if (PTID == inPTID) 
            {
                check = true;
            }
        }
        
        return check;
    }
    
    /**
     * A typed method that returns true if the activity ID exists and false if it doesn't
     * @param inActivityID
     * @return
     * @throws SQLException 
     */
    
    public boolean checkActivityID(int inActivityID) throws SQLException
    {
        boolean check = false;
        int ActivityID;

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT ActivityID FROM tblActivities");

        while (rs.next()) 
        {
            ActivityID = rs.getInt("ActivityID");

            if (ActivityID == inActivityID) 
            {
                check = true;
            }
        }
        
        return check;
    }

    /**
     * A method used to insert a new member into the table tblMembers and the login details into tblLoginDetails
     * @param name
     * @param surname
     * @param dateOfBirth
     * @param cellNo
     * @param email
     * @param password
     * @param gymID
     * @param PTID
     * @throws SQLException
     * @throws ParseException 
     */
    
    public void insertMember(String name, String surname, String dateOfBirth, String cellNo, String email, String password, int gymID, int PTID) throws SQLException, ParseException 
    {
        
            Statement s = conn.createStatement();
            Statement st = con.createStatement();

            java.util.Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateOfBirth);
            java.sql.Date BirthDate = new java.sql.Date(date.getTime());

            s.executeUpdate("INSERT INTO tblMembers (MemberName, MemberSurname, MemberDoB, MemberCell, MemberEmail, GymID, PersonalTrainerID)"
                    + "VALUES (\'" + name + "\', \'" + surname + "\', #" + BirthDate + "#, \'" + cellNo + "\', \'" + email + "\', " + gymID + ", " + PTID + ")");

            st.executeUpdate("INSERT INTO tblLoginDetails (EmailAddress, Password, UserTypeID) VALUES (\'" + email + "\', \'" + password + "\', 1)");
        
    }

    /**
     * A method used to insert a new personal trainer into the table tblPersonalTrainers and the login details into tblLoginDetails
     * @param name
     * @param surname
     * @param cell
     * @param email
     * @param gymID
     * @param password
     * @throws SQLException 
     */
    
    public void insertPersonalTrainer(String name, String surname, String cell, String email, int gymID, String password) throws SQLException 
    {
        Statement s = conn.createStatement();
        Statement st = con.createStatement();

        s.executeUpdate("INSERT INTO tblPersonalTrainers (PersonalTrainerName, PersonalTrainerSurname, PersonalTrainerCell, PersonalTrainerEmail, GymID)"
                + "VALUES (\'" + name + "\', \'" + surname + "\', \'" + cell + "\', \'" + email + "\', " + gymID + ")");
        st.executeUpdate("INSERT INTO tblLoginDetails (EmailAddress, Password, UserTypeID) VALUES (\'" + email + "\', \'" + password + "\', 2)");
    }

    /**
     * A method used to insert a new gym into the table tblGyms and the login details into tblLoginDetails
     * @param name
     * @param location
     * @param email
     * @param password
     * @throws SQLException 
     */
    
    public void insertGym(String name, String location, String email, String password) throws SQLException 
    {
        int userType = 3;
        Statement s = conn.createStatement();
        Statement st = con.createStatement();

        s.executeUpdate("INSERT INTO tblGyms (GymName, GymLocation, GymEmail) "
                + "VALUES (\'" + name + "\', \'" + location + "\', \'" + email + "\')");
        st.executeUpdate("INSERT INTO tblLoginDetails (EmailAddress, Password, UserTypeID) VALUES (\'" + email + "\', \'" + password + "\', " + userType + ")");
    }

    /**
     * A method used to insert an activity into the table tblActivities 
     * @param name
     * @param duration
     * @param activityDaysCode
     * @param startTime
     * @param gymID
     * @throws SQLException 
     */
    
    public void insertActivities(String name, int duration, String activityDaysCode, String startTime, int gymID) throws SQLException 
    {
        Statement s = conn.createStatement();

        s.executeUpdate("INSERT INTO tblActivities (ActivityName, ActivityDuration, ActivityDaysCode, ActivityStartTime, GymID)"
                + "VALUES (\'" + name + "\', " + duration + ", \'" + activityDaysCode + "\', \'" + startTime + "\', " + gymID + ")");
    }

    /**
     * A method used to insert an exercise into the table tblExercises
     * @param memberID
     * @param gymID
     * @param activityID
     * @param exerciseDate
     * @throws SQLException
     * @throws ParseException 
     */
    
    public void insertExercise(int memberID, int gymID, int activityID, String exerciseDate) throws SQLException, ParseException 
    {
        Statement s = conn.createStatement();

        java.util.Date date = new SimpleDateFormat("yyyy/MM/dd").parse(exerciseDate);
        java.sql.Date exercise = new java.sql.Date(date.getTime());
            
        s.executeUpdate("INSERT INTO tblExercises (MemberID, GymID, ActivityID, ExerciseDate)"
                + "VALUES (" + memberID + ", " + gymID + ", " + activityID + ", #" + exercise + "#)");
    }

    /**
     * A typed method that returns a member object with a specific member ID that is shown in the parameters
     * @param memberID
     * @return
     * @throws SQLException 
     */
    
    public members searchMember(int memberID) throws SQLException 
    {
        members[] arr = getMembers();
        int found = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].getMemberID() == memberID) 
            {
                found = i;
                break;
            }
        }
        
        return arr[found];
    }

    /**
     * A typed method that returns a personalTrainer object with a specific personal trainer ID that is shown in the parameters
     * @param PTID
     * @return
     * @throws SQLException 
     */
    
    public personalTrainers searchPersonalTrainers(int PTID) throws SQLException 
    {
        personalTrainers[] arr = getPersonalTrainers();
        int found = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].getPersonalTrainerID() == PTID) 
            {
                found = i;
                break;
            }
        }
        
        return arr[found];
    }

    /**
     * A typed method that returns a gym object with a specific gym ID that is shown in the parameters
     * @param gymID
     * @return
     * @throws SQLException 
     */
    
    public gyms searchGyms(int gymID) throws SQLException 
    {
        gyms[] arr = getGym();
        int found = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].getGymID() == gymID) 
            {
                found = i;
                break;
            }
        }
        
        return arr[found];
    }

    /**
     * A typed method that returns an activity object with a specific activity ID that is shown in the parameters
     * @param activityID
     * @return
     * @throws SQLException 
     */
    
    public activities searchActivities(int activityID) throws SQLException 
    {
        activities[] arr = getActivities();
        int found = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i].getActivityID() == activityID)
            {
                found = i;
                break;
            }
        }
        
        return arr[found];
    }

    /**
     * A method used to update a member in the table tblMembers as well as their login details in tblLoginDetails
     * @param memberID
     * @param name
     * @param surname
     * @param dateOfBirth
     * @param cell
     * @param email
     * @param gymID
     * @param PTID
     * @param password
     * @throws SQLException
     * @throws ParseException 
     */
    
    public void updateMembers(int memberID, String name, String surname, String dateOfBirth, String cell, String email, int gymID, int PTID, String password) throws SQLException, ParseException 
    {
        PreparedStatement ps = conn.prepareStatement("UPDATE tblMembers SET MemberName = ?, MemberSurname = ?, MemberDoB = ?, MemberCell = ?, MemberEmail = ?, GymID = ?, PersonalTrainerID = ? WHERE MemberID = " + memberID);
        PreparedStatement pst = con.prepareStatement("UPDATE tblLoginDetails SET EmailAddress = ?, Password = ? WHERE EmailAddress LIKE \'" + email + "\'");

        //stackoverflow
        java.util.Date date = new SimpleDateFormat("yyyy/MM/dd").parse(dateOfBirth);
        java.sql.Date BirthDate = new java.sql.Date(date.getTime());

        ps.setString(1, name);
        ps.setString(2, surname);
        ps.setDate(3, BirthDate);
        ps.setString(4, cell);
        ps.setString(5, email);
        ps.setInt(6, gymID);
        ps.setInt(7, PTID);

        pst.setString(1, email);
        pst.setString(2, password);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to update a personal trainer in the tblPersonalTrainers as well as their login details in tblLoginDetails
     * @param PTID
     * @param name
     * @param surname
     * @param cell
     * @param email
     * @param gymID
     * @param password
     * @throws SQLException 
     */
    
    public void updatePersonalTrainers(int PTID, String name, String surname, String cell, String email, int gymID, String password) throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("UPDATE tblPersonalTrainers SET PersonalTrainerName = ?, PersonalTrainerSurname = ?, PersonalTrainerCell = ?, PersonalTrainerEmail = ?, GymID = ? WHERE PersonalTrainerID = " + PTID);
        PreparedStatement pst = con.prepareStatement("UPDATE tblLoginDetails SET EmailAddress = ?, Password = ? WHERE EmailAddress LIKE \'" + email + "\'");

        ps.setString(1, name);
        ps.setString(2, surname);
        ps.setString(3, cell);
        ps.setString(4, email);
        ps.setInt(5, gymID);

        pst.setString(1, email);
        pst.setString(2, password);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to update a gym in tblGyms as well as their login details in tblLoginDetails
     * @param gymID
     * @param name
     * @param location
     * @param email
     * @param password
     * @throws SQLException 
     */
    
    public void updateGyms(int gymID, String name, String location, String email, String password) throws SQLException 
    {
        PreparedStatement ps = conn.prepareStatement("UPDATE tblGyms SET GymName = ?, GymLocation = ?, GymEmail = ? WHERE GymID = " + gymID);
        PreparedStatement pst = con.prepareStatement("UPDATE tblLoginDetails SET EmailAddress = ?, Password = ? WHERE EmailAddress LIKE \'" + email + "\'");

        ps.setString(1, name);
        ps.setString(2, location);
        ps.setString(3, email);

        pst.setString(1, email);
        pst.setString(2, password);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to update an activity in tblActivities
     * @param activityID
     * @param name
     * @param duration
     * @param days
     * @param startTime
     * @param gymID
     * @throws SQLException 
     */
    
    public void updateActivities(int activityID, String name, int duration, String days, String startTime, int gymID) throws SQLException 
    {
        PreparedStatement ps = conn.prepareStatement("UPDATE tblActivities SET ActivityName = ?, ActivityDuration = ?, ActivityDaysCode = ?, ActivityStartTime = ?, GymID = ? WHERE ActivityID = " + activityID);

        ps.setString(1, name);
        ps.setInt(2, duration);
        ps.setString(3, days);
        ps.setString(4, startTime);
        ps.setInt(5, gymID);

        ps.executeUpdate();
    }

    /**
     * A method used to delete a member given their member ID in tblMembers as well as their login details in tblLoginDetails
     * @param memberID
     * @throws SQLException 
     */
    
    public void deleteMembers(int memberID) throws SQLException 
    {
        members mem = searchMember(memberID);
        String email = mem.getEmail();

        PreparedStatement ps = conn.prepareStatement("DELETE FROM tblMembers WHERE MemberID = ?");
        PreparedStatement pst = con.prepareStatement("DELETE FROM tblLoginDetails WHERE EmailAddress LIKE ?");

        ps.setInt(1, memberID);
        pst.setString(1, email);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to delete a personal trainer given their personal trainer ID in tblPersonalTrainers as well as their login details in tblLoginDetails
     * @param PTID
     * @throws SQLException 
     */
    
    public void deletePersonalTrainer(int PTID) throws SQLException
    {
        personalTrainers pt = searchPersonalTrainers(PTID);
        String email = pt.getEmail();

        PreparedStatement ps = conn.prepareStatement("DELETE FROM tblPersonalTrainers WHERE PersonalTrainerID = ?");
        PreparedStatement pst = con.prepareStatement("DELETE FROM tblLoginDetails WHERE EmailAddress LIKE ?");

        ps.setInt(1, PTID);
        pst.setString(1, email);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to delete a gym given their gym ID in tblGyms as well as their login details in tblLoginDetails
     * @param gymID
     * @throws SQLException 
     */
    
    public void deleteGym(int gymID) throws SQLException 
    {
        gyms gym = searchGyms(gymID);
        String email = gym.getEmail();

        PreparedStatement ps = conn.prepareStatement("DELETE FROM tblGyms WHERE GymID = " + gymID);
        PreparedStatement pst = con.prepareStatement("DELETE FROM tblLoginDetails WHERE EmailAddress LIKE '" + email + "'");

        ps.setInt(1, gymID);
        pst.setString(1, email);

        ps.executeUpdate();
        pst.executeUpdate();
    }

    /**
     * A method used to delete an activity given their activity ID in tblActivities
     * @param activityID
     * @throws SQLException 
     */
    
    public void deleteActivity(int activityID) throws SQLException 
    {
        PreparedStatement ps = conn.prepareStatement("DELETE FROM tblGyms WHERE GymID = ?");

        ps.setInt(1, activityID);

        ps.executeUpdate();
    }

    /**
     * A method used to delete an exercise given their member ID and the exercise date in tblExercises
     * @param memberID
     * @param exerciseDate
     * @throws SQLException
     * @throws ParseException 
     */
    
    public void deleteExercises(int memberID, String exerciseDate) throws SQLException, ParseException 
    {
        PreparedStatement ps = conn.prepareStatement("DELETE FROM tblExercises WHERE MemberID = ? AND ExerciseDate = ?");

        java.util.Date date = new SimpleDateFormat("yyyy/MM/dd").parse(exerciseDate);
        java.sql.Date exercise = new java.sql.Date(date.getTime());
        
        ps.setInt(1, memberID);
        ps.setDate(2, exercise);

        ps.executeUpdate();
    }

    /**
     * A method that uses the days code and selects the check boxes depending on the day the activity is offered. Only used when an activity is being updated
     * @param daysCode
     * @param monday
     * @param tuesday
     * @param wednesday
     * @param thursday
     * @param friday
     * @param saturday
     * @param sunday 
     */
    
    public void days(String daysCode, JCheckBox monday, JCheckBox tuesday, JCheckBox wednesday, JCheckBox thursday, JCheckBox friday, JCheckBox saturday, JCheckBox sunday) 
    {
        if (daysCode.contains("M")) 
        {
            monday.setSelected(true);
        }
        if (daysCode.contains("T")) 
        {
            tuesday.setSelected(true);
        }
        if (daysCode.contains("W")) 
        {
            wednesday.setSelected(true);
        }
        if (daysCode.contains("t")) 
        {
            thursday.setSelected(true);
        }
        if (daysCode.contains("F")) 
        {
            friday.setSelected(true);
        }
        if (daysCode.contains("S")) 
        {
            saturday.setSelected(true);
        }
        if (daysCode.contains("s")) 
        {
            sunday.setSelected(true);
        }
    }

}
