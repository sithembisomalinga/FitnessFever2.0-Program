package Classes;

/**
 * A class used for members
 * @author Mr S Malinga(218021100)
 */

public class members {

    private int memberID;
    private String name;
    private String surname;
    private String DateOfBirth;
    private String cellNumber;
    private String email;
    private int gymID;
    private int personalTrainerID;

    /**
     * A constructor used to declare a members object
     * @param inMemberID
     * @param inName
     * @param inSurname
     * @param inDateOfBirth
     * @param inCellNumber
     * @param inEmail
     * @param inGymID
     * @param inPersonalTrainerID 
     */
    
    public members(int inMemberID, String inName, String inSurname, String inDateOfBirth, String inCellNumber, String inEmail, int inGymID, int inPersonalTrainerID)
    {
        this.memberID = inMemberID;
        this.name = inName;
        this.surname = inSurname;
        this.DateOfBirth = inDateOfBirth;
        this.cellNumber = inCellNumber;
        this.email = inEmail;
        this.gymID = inGymID;
        this.personalTrainerID = inPersonalTrainerID;
    }

    /**
     * A typed method used to return the field memberID
     * @return 
     */
    
    public int getMemberID() 
    {
        return this.memberID;
    }

    /**
     * A typed method used to return the field name
     * @return 
     */
    
    public String getName() 
    {
        return this.name;
    }

    /**
     * A typed method used to return the field surname
     * @return 
     */
    
    public String getSurname() 
    {
        return this.surname;
    }

    /**
     * A typed method used to return the field dateOfBirth
     * @return 
     */
    
    public String getDateOfBirth() 
    {
        return this.DateOfBirth;
    }

    /**
     * A typed method used to return the field cellNumber
     * @return 
     */
    
    public String getCellNumber() 
    {
        return this.cellNumber;
    }

    /**
     * A typed method used to return the field email
     * @return 
     */
    
    public String getEmail() {
        return this.email;
    }

    /**
     * A typed method used to return the field gymID
     * @return 
     */
    
    public int getGymID() 
    {
        return this.gymID;
    }

    /**
     * A typed method used to return the field personalTrainerID
     * @return 
     */
    
    public int getPersonalTrainerID() 
    {
        return this.personalTrainerID;
    }

    /**
     * A method used to change the value of the field memberID
     * @param inMemberID 
     */
    
    public void setMemberID(int inMemberID) 
    {
        this.memberID = inMemberID;
    }

    /**
     * A method used to change the value of the field name
     * @param inName 
     */
    
    public void setName(String inName) 
    {
        this.name = inName;
    }

    /**
     * A method used to change the value of the field surname
     * @param inSurname 
     */
    
    public void setSurname(String inSurname) 
    {
        this.surname = inSurname;
    }

    /**
     * A method used to change the value of the field datOfBirth
     * @param inDateOfBirth 
     */
    
    public void setDateOfBirth(String inDateOfBirth)
    {
        this.DateOfBirth = inDateOfBirth;
    }

    /**
     * A method used to change the value of the field cellNumber
     * @param inCellNumber 
     */
    
    public void setCellNumber(String inCellNumber) 
    {
        this.cellNumber = inCellNumber;
    }

    /**
     * A method used to change the value of the field email
     * @param inEmail 
     */
    public void setEmail(String inEmail) 
    {
        this.email = inEmail;
    }
    
    /**
    * A method used to change the value of the field gymID
    * @param inGymID 
    */
    
    public void setGymID(int inGymID) 
    {
        this.gymID = inGymID;
    }

    /**
     * A method used to change the value of the field personalTrainerID
     * @param inPersonalTrainerID 
     */
    
    public void PersonalTrainerID(int inPersonalTrainerID) 
    {
        this.personalTrainerID = inPersonalTrainerID;
    }
}
