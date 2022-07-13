public class Course //course class is created
{
    private String courseID, coursename, courseleader;
    private int duration;
    
    //parameterized constructor of class course is created
    public Course(String courseID, String coursename, int duration)
    {
        this.courseID = courseID;
        this.coursename = coursename;
        this.duration = duration;
        courseleader = "";     //value of courseleader is assigned empty.
    } 
    
    /*Accessor method of all the attributes of course class is assigned.
     Similarly mutator method of courseleader is assigned*/
     
    public String getCourseID()
    {
        return courseID;       
    }
    public String getCoursename()
    {
        return coursename;
    }
    public String getCourseleader()
    {
        return courseleader;
    }
    public int getDuration()
    {
        return duration;
    }
    public void setCourseleader(String newCourseleader)
    {
        this.courseleader = newCourseleader;
    }
    
    //All the details of the course is displayed in display method.
    public void display()
    {
        System.out.println("ID of course= "+courseID);
        System.out.println("Name of course= "+coursename);
        System.out.println("Duration of course= "+duration);
        
        /*If condition checks whether the courseleader is empty or not.
         if non-empty course leader name is displayed.*/
         if(courseleader!="") 
        {
            System.out.println("Name of course leader= "+courseleader);
        }
    }
}