package Classes;

/**
 * A class for personal trainers
 * @author Mr S Malinga(218021100)
 */

public class personalTrainers {

    private int personalTrainerID;
    private String name;
    private String surname;
    private String cellNumber;
    private String email;
    private int GymID;

    /**
     * A constructor used to declare a personalTrainers class
     * @param inPersonalTrainerID
     * @param inName
     * @param inSurname
     * @param inCellNumber
     * @param inEmail
     * @param inGymID 
     */
    
    public personalTrainers(int inPersonalTrainerID, String inName, String inSurname, String inCellNumber, String inEmail, int inGymID) 
    {
        this.personalTrainerID = inPersonalTrainerID;
        this.name = inName;
        this.surname = inSurname;
        this.cellNumber = inCellNumber;
        this.email = inEmail;
        this.GymID = inGymID;
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
    
    public String getEmail() 
    {
        return this.email;
    }

    /**
     * A typed method used to return the field gymID
     * @return 
     */
    
    public int getGymID() 
    {
        return this.GymID;
    }

    /**
     * A method used to set the field personalTrainerID to a new value
     * @param inPersonalTrainerID 
     */
    
    public void setPersonalTrainerID(int inPersonalTrainerID) 
    {
        this.personalTrainerID = inPersonalTrainerID;
    }

    /**
     * A method used to set the field name to a new value
     * @param inName 
     */
    
    public void setName(String inName) 
    {
        this.name = inName;
    }

    /**
     * A method used to set the field surname to a new value
     * @param inSurname 
     */
    
    public void setSurname(String inSurname) 
    {
        this.surname = inSurname;
    }

    /**
     * A method used to set the field cellNumber to a new value
     * @param inCellNumber 
     */
    
    public void setCellNumber(String inCellNumber) 
    {
        this.cellNumber = inCellNumber;
    }

    /**
     * A method used to set the field email to a new value
     * @param inEmail 
     */
    
    public void setEmail(String inEmail) 
    {
        this.email = inEmail;
    }

    /**
     * A method used to set the field gymID to a new value
     * @param inGymID 
     */
    
    public void setGymID(int inGymID) 
    {
        this.GymID = inGymID;
    }
}
