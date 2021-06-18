package Classes;

/**
 * A class used for gyms
 * @author Mr S Malinga(218021100)
 */

public class gyms {

    private int GymID;
    private String name;
    private String location;
    private String email;

    /**
     * A constructor used to declare a gyms object
     * @param inGymID
     * @param inName
     * @param inLocation
     * @param inEmail 
     */
    
    public gyms(int inGymID, String inName, String inLocation, String inEmail) 
    {
        this.GymID = inGymID;
        this.name = inName;
        this.location = inLocation;
        this.email = inEmail;
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
     * A typed method used to return the field name
     * @return 
     */
    
    public String getName() {
        return this.name;
    }

    /**
     * A typed method used to return the field location
     * @return 
     */
    
    public String getLocation() 
    {
        return this.location;
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
     * A method used to change the value of the field gymID
     * @param inGymID 
     */
    
    public void setGymID(int inGymID) 
    {
        this.GymID = inGymID;
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
     * A method used to change the value of the field location
     * @param inLocation 
     */
    
    public void setLocation(String inLocation) 
    {
        this.location = inLocation;
    }

    /**
     * A method used to change the value of the field email
     * @param inEmail 
     */
    
    public void setEmail(String inEmail)
    {
        this.email = inEmail;
    }
}
