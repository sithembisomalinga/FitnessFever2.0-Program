package Classes;

/**
 * Class used for activities of a gym
 * @author Mr S Malinga(218021100)
 */
public class activities {

    private int activityID;
    private String name;
    private int duration;
    private String days;
    private String startTime;
    private int gymID;

    /**
     * Constructor to declare an activities object
     * @param inActivityID
     * @param inName
     * @param inDuration
     * @param inDays
     * @param inStartTime
     * @param inGymID
     */
    
    public activities(int inActivityID, String inName, int inDuration, String inDays, String inStartTime, int inGymID) 
    {
        this.activityID = inActivityID;
        this.name = inName;
        this.duration = inDuration;
        this.days = inDays;
        this.startTime = inStartTime;
        this.gymID = inGymID;
    }

    /**
     * A typed method used to return the activity ID (Getter)
     * @return 
     */
    
    public int getActivityID() 
    {
        return this.activityID;
    }

    /**
     * A typed method used to return the name of the activity (Getter)
     * @return 
     */
    
    public String getName() 
    {
        return this.name;
    }

    /**
     * A typed method used to return the duration of the activity (Getter)
     * @return 
     */
    
    public int getDuration() 
    {
        return this.duration;
    }

    /**
     * A typed method used to return the days that the activity is run (Getter)
     * @return 
     */
    
    public String getDays() 
    {
        return this.days;
    }

    /**
     * A typed method used to return the starting time of the activity (Getter)
     * @return 
     */
    
    public String getStartTime() 
    {
        return this.startTime;
    }

    /**
     * A typed method used to return the gym that the activity is being offered (Getter)
     * @return 
     */
    
    public int getGymID() 
    {
        return this.gymID;
    }
    
    /**
     * A method used to set the field: activityID to a new value
     * @param inActivityID 
     */

    public void setActivityID(int inActivityID) 
    {
        this.activityID = inActivityID;
    }

    /**
     * A method used to set the field: name to a new value
     * @param inName 
     */
    
    public void setName(String inName) 
    {
        this.name = inName;
    }

    /**
     * A method used to set the field: duration to a new value
     * @param inDuration 
     */
    
    public void setDuration(int inDuration) 
    {
        this.duration = inDuration;
    }

    /**
     * A method used to set the field: days to a new value
     * @param inDays 
     */
    
    public void setDays(String inDays) 
    {
        this.days = inDays;
    }

    /**
     * A method used to set the field: startTime to a new value
     * @param inStartTime 
     */
    
    public void setStartTime(String inStartTime) {
        this.startTime = inStartTime;
    }

    /**
     * A method used to set the field: gymID to a new value
     * @param inGymID 
     */
    
    public void setGymID(int inGymID) {
        this.gymID = inGymID;
    }

}
