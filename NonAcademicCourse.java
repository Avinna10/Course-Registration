    //Another sub-class of Course; NonAcademicCourse is created
public class NonAcademicCourse extends Course
{
    private String instructorname, startdate, completiondate, examdate, prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    //Constructor NonAcademicCourse is created
    public NonAcademicCourse(String courseID, String coursename, int duration, String prerequisite)
    {
        super(courseID, coursename, duration);  //calls the parent class constructor with parameters
        this.prerequisite = prerequisite;
        startdate = "";
        completiondate = "";
        examdate = "";
        isRegistered = false;
        isRemoved = false;
    }
    
    //Accessor method is created for all the attributes
    public String getInstructorname()
    {
        return instructorname;
    }
    public String getStartdate()
    {
        return startdate;
    }
    public String getCompletiondate()
    {
        return completiondate;
    }
    public String getExamdate()
    {
        return examdate;
    }
    public String getPrerequisite()
    {
        return prerequisite;
    }
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    public boolean getIsRemoved()
    {
        return isRemoved;
    }
    
    //Setter method of instructor name 
    public void setInstructorname(String newInstructorname)
    {
        /*If condition checks the registered status of non academic course
         if status is false instuctor name is assigned.
         if status is true a suitable message is displayed.*/
        if(isRegistered==false)        
        {
            this.instructorname=newInstructorname;
        } else {
            System.out.println("Non-academic Course is already registered so it is not possible to change the instructor name.");
        }
    }
    
    //Register method is created with parameters of data type string 
    public void register(String courseleader, String instructorname, String startdate, String completiondate, String examdate)
    {
        /*If condition checks the registered status of non academic course.
          if non academic course is not registered it calls method setInstructorname.
          if registered a suitable message is displayed.*/
        if(isRegistered==false)     
        {
            setInstructorname(instructorname);  
            super.setCourseleader(courseleader);
            this.startdate = startdate;
            this.completiondate = completiondate;
            this.examdate = examdate;
            this.isRegistered = true;           
        } else {
            System.out.println("Non-academic Course is already registered.");
        }
    }
    
    //Remove method is created
    public void remove()
    {
        //if condition checks the removed status
        if(isRemoved==true)     //if non academic course is removed a suitable message is displayed.
        {
            System.out.println("Non-academic course is already removed.");
        } else {                //if non academic course is not registered it goes to else condition.
            super.setCourseleader("");      //method to setCourseleader is called with empty string as parameter.
            this.instructorname = "";
            this.startdate = "";            //empty string is assigned to instructorname, startdate, completiondate and examdate.
            this.completiondate = "";
            this.examdate = "";
            this.isRegistered = false;      //isRegistered status is set to false
            this.isRemoved = true;          //isRemoved status is set to true
        }
    }
    
    //Display method which have the same signature as display method in parent class is created
    public void display()
    {
        super.display();        //calls the display method of parent class
        if(isRegistered==true)      //if non academic course is registered details of non academic course is displayed
        {
            System.out.println("Name of instructor= "+instructorname);
            System.out.println("Starting date of non-academic course= "+startdate);
            System.out.println("Completion date of non-academic course= "+completiondate);
            System.out.println("Exam date of non-academic course= "+examdate);
        }
    }
}
