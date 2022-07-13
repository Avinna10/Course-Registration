    //Sub-class of Course; AcademicCourse is created
public class AcademicCourse extends Course
{
    private String lecturername, level, credit, startingdate, completiondate;
    private int numberofassessments;
    private boolean isRegistered;
    
    //Parameterized constructor of class Academic course is created.
     //It accepts parameters of String and int data types.
    public AcademicCourse(String courseID, String coursename, int duration, String level, String credit, int numberofassessments)
    {
       super(courseID, coursename, duration);   //Call is made to parent class Course.
       this.level = level;
       this.credit = credit;
       this.numberofassessments = numberofassessments;
       lecturername = "";
       startingdate = "";
       completiondate = "";      
       isRegistered = false;      //isRegistered status of Academic course is set false.
    }
    
    //Accessor method for all the attributes of AcademicCourse
    public String getLecturername()
    {
        return lecturername;
    }
    public String getLevel()
    {
        return level;
    }
    public String getCredit()
    {
        return credit;
    }
    public String getStartingdate()
    {
        return startingdate;
    }
    public String getCompletiondate()
    {
        return completiondate;
    }
    public int getNumberofassessments()
    {
        return numberofassessments;
    }
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    //Mutator method for lecturername and numberofassessments
    public void setLecturername(String newLecturername)
    {
        this.lecturername = newLecturername;
    }
    public void setNumberofassessments(int newNumberofassessments)
    {
        this.numberofassessments = newNumberofassessments;
    }
    
    // Method register is created
    public void register(String courseleader, String lecturername, String startingdate, String completiondate)
    {
        //if condition checks whether the academic course is registered or not
        if(isRegistered==true)      //if condition is true lecturer name, starting date and completion date is displayed.
        {
            System.out.println("Name of lecturer= "+lecturername);
            System.out.println("Starting date of course= "+startingdate);
            System.out.println("Completion date of course= "+completiondate);
        } else {                    //if condition is false value from parameters is assigned
            super.setCourseleader(courseleader);    //calls the setCourseleader method from parent class
            this.lecturername = lecturername;
            this.startingdate = startingdate;
            this.completiondate = completiondate;
            this.isRegistered = true;   //status of isRegistered is set true if academic course is not registered yet
        }
    }
    
    //Display method is created which displays all the details of academic course
    public void display()
    {
        super.display();        //calls the display method from the parent class
        
        /* if condition checks whether the course is registered or not.
         If academic course is registered following details are displayed.*/
        if(isRegistered==true)          
        {
            System.out.println("Name of lecturer= "+lecturername);
            System.out.println("Level of academic course= "+level);
            System.out.println("Credit of academic course= "+credit);
            System.out.println("Starting date of academic course= "+startingdate);
            System.out.println("Completion date of acadmic course= "+completiondate);
            System.out.println("Number of assessments in the academic course= "+numberofassessments);
        }
    }
}