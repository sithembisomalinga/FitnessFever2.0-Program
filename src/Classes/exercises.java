package Classes;

/**
 * A class used for the exercises of members
 * @author Mr S Malinga(218021100)
 */
public class exercises {

    private int memberID;
    private int gymID;
    private int activityID;
    private String date;

    /**
     * A constructor used to declare an exercises object
     * @param inMemberID
     * @param inGymID
     * @param inActivityID
     * @param inDate 
     */
    
    public exercises(int inMemberID, int inGymID, int inActivityID, String inDate) 
    {
        this.memberID = inMemberID;
        this.gymID = inGymID;
        this.activityID = inActivityID;
        this.date = inDate;
    }

    /**
     * A typed method that returns the field memberID
     * @return 
     */
    
    public int getMemberID() 
    {
        return this.memberID;
    }

    /**
     * A typed method that returns the field gymID
     * @return 
     */
    
    public int getGymID() 
    {
        return this.gymID;
    }

    /**
     * A typed method that returns the field activityID
     * @return 
     */
    
    public int getActivityID() 
    {
        return this.activityID;
    }

    /**
     * A typed method that return the field date
     * @return 
     */
    
    public String getDate() 
    {
        return this.date;
    }

    /**
     * A method that changes the value of the field memberID
     * @param inMemberID 
     */
    
    public void setMemberID(int inMemberID) 
    {
        this.memberID = inMemberID;
    }

    /**
     * A method that changes the value of the field gymID
     * @param inGymID 
     */
    
    public void setGymID(int inGymID) 
    {
        this.gymID = inGymID;
    }

    /**
     * A method that changes the value of the field activityID
     * @param inActivityID 
     */
    public void setActivityID(int inActivityID) 
    {
        this.activityID = inActivityID;
    }

    /**
     * A method that changes the value of the field date
     * @param inDate 
     */
    
    public void setDate(String inDate) 
    {
        this.date = inDate;
    }
}
