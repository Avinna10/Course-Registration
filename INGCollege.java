//importing different classes and packages to use in the program
import javax.swing.*;   
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class INGCollege implements ActionListener       //creater class INGCollege which implements ActionListener
{
    private JFrame frame;       
    private JPanel panel1, panel2;
    private JLabel title1, courseAC, coursenameAC, durationAC, courseleaderAC, lecturerAC, levelAC, creditAC, startAC, completeAC, noaAC;
    private JLabel title2, courseNAC, coursenameNAC, durationNAC, preNAC, instructorNAC, courseleaderNAC, startNAC, completeNAC, examNAC;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    private JTextField text1, text2, text3, text4, text5, text6, text7, text8, text9;
    private JButton registerAC, addAC, clearAC, displayAC, switch1;
    private JButton registerNAC, addNAC, removeNAC, displayNAC, clearNAC, switch2;

    ArrayList<Course> courselist = new ArrayList<Course>();

    //creation of GUI components inside the constructor
    public INGCollege()     //constructor of INGCollege class
    {
        frame = new JFrame("Course Regsitration");  //title to the JFrame window

        /*Creating panel
        All the components required in GUI is created and
        later is added in panel*/         
        panel1 = new JPanel();      
        panel2 = new JPanel();

        //JComponents to be added in panel1 i.e. for academic course
        title1 = new JLabel("Academic Course");       
        title1.setBounds(345, 10, 210, 40);
        title1.setFont(new Font("Sans Serif", Font.BOLD, 25));        

        courseAC = new JLabel("Course ID: ");
        courseAC.setBounds(45, 70, 100, 30);
        courseAC.setFont(new Font("Arial",Font.PLAIN , 16));        

        txt1 = new JTextField();
        txt1.setBounds(150, 70, 200, 35);

        coursenameAC = new JLabel("Course Name:");
        coursenameAC.setBounds(530, 70, 120, 30);
        coursenameAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt2 = new JTextField();
        txt2.setBounds(650, 70, 200, 35);

        levelAC = new JLabel("Level: ");
        levelAC.setBounds(75, 120, 80, 30);
        levelAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt3 = new JTextField();
        txt3.setBounds(150, 120, 200, 35);

        creditAC = new JLabel("Credit: ");
        creditAC.setBounds(570, 120, 100, 30);
        creditAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt4 = new JTextField();
        txt4.setBounds(650, 120, 200, 35);

        durationAC = new JLabel("Duration: ");
        durationAC.setBounds(55, 170, 70, 30);
        durationAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt5 = new JTextField();
        txt5.setBounds(150, 170, 200, 35);

        noaAC = new JLabel("Number of Assessments: ");
        noaAC.setBounds(460, 170, 200, 30);
        noaAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt6 = new JTextField();
        txt6.setBounds(650, 170, 200, 35);

        addAC = new JButton("Add");
        addAC.setBounds(375, 220, 150, 30);
        addAC.setFont(new Font("Arial",Font.BOLD , 16));

        courseleaderAC = new JLabel("Course Leader: ");
        courseleaderAC.setBounds(30, 280, 120, 30);
        courseleaderAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt7 = new JTextField();
        txt7.setBounds(150, 280, 200, 35);

        lecturerAC = new JLabel("Lecturer name: ");
        lecturerAC.setBounds(530, 280, 120, 30);
        lecturerAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt8 = new JTextField();
        txt8.setBounds(650, 280, 200, 35);

        startAC = new JLabel("Start Date: ");
        startAC.setBounds(50, 330, 120, 30);
        startAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt9 = new JTextField();
        txt9.setBounds(150, 330, 200, 35);

        completeAC = new JLabel("Completion Date: ");
        completeAC.setBounds(520, 330, 130, 30);
        completeAC.setFont(new Font("Arial",Font.PLAIN , 16));

        txt10 = new JTextField();
        txt10.setBounds(650, 330, 200, 35);

        registerAC = new JButton("Register");
        registerAC.setBounds(670, 410, 150, 40);
        registerAC.setFont(new Font("Arial",Font.BOLD , 16));

        displayAC = new JButton("Display");
        displayAC.setBounds(65, 410, 150, 40);
        displayAC.setFont(new Font("Arial",Font.BOLD , 16));

        clearAC = new JButton("Clear");
        clearAC.setBounds(375, 440, 150, 40);
        clearAC.setFont(new Font("Arial",Font.BOLD , 16));

        switch1 = new JButton("Go to Non-Academic");
        switch1.setBounds(350, 500, 200, 40);
        switch1.setFont(new Font("Arial",Font.BOLD , 16));

        //Adding all the components to panel1
        panel1.add(title1);
        panel1.add(courseAC);
        panel1.add(txt1);
        panel1.add(coursenameAC);
        panel1.add(txt2);
        panel1.add(levelAC);
        panel1.add(txt3);
        panel1.add(creditAC);
        panel1.add(txt4);
        panel1.add(durationAC);
        panel1.add(txt5);
        panel1.add(noaAC);
        panel1.add(txt6);
        panel1.add(courseleaderAC);
        panel1.add(txt7);
        panel1.add(lecturerAC);
        panel1.add(txt8);
        panel1.add(startAC);
        panel1.add(txt9);
        panel1.add(completeAC);
        panel1.add(txt10);
        panel1.add(addAC);
        panel1.add(registerAC);
        panel1.add(clearAC);
        panel1.add(displayAC);        
        panel1.add(switch1);

        //JComponents to be added in panel2 i.e. for non-academic course
        title2 = new JLabel("Non Academic Course");
        title2.setBounds(315, 10, 280, 40);
        title2.setFont(new Font("Sans Serif", Font.BOLD, 25)); 

        courseNAC = new JLabel("Course ID: ");
        courseNAC.setBounds(45, 70, 100, 30);
        courseNAC.setFont(new Font("Arial",Font.PLAIN , 16));         

        text1 = new JTextField();
        text1.setBounds(150, 70, 200, 35);

        coursenameNAC = new JLabel("Course Name:");
        coursenameNAC.setBounds(530, 70, 120, 30);
        coursenameNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text2 = new JTextField();
        text2.setBounds(650, 70, 200, 35);

        durationNAC = new JLabel("Duration: ");
        durationNAC.setBounds(100, 130, 70, 30);
        durationNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text3 = new JTextField();
        text3.setBounds(180, 130, 200, 35);

        preNAC = new JLabel("Prerequisite: ");
        preNAC.setBounds(510, 130, 100, 30);
        preNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text4 = new JTextField();
        text4.setBounds(620, 130, 200, 35);

        addNAC = new JButton("Add");
        addNAC.setBounds(375, 190, 150, 30);
        addNAC.setFont(new Font("Arial",Font.BOLD , 16));

        instructorNAC = new JLabel("Instructor Name: ");
        instructorNAC.setBounds(20, 270, 140, 30);
        instructorNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text5 = new JTextField();
        text5.setBounds(150, 270, 200, 35);

        courseleaderNAC = new JLabel("Course leader: ");
        courseleaderNAC.setBounds(530, 270, 120, 30);
        courseleaderNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text6 = new JTextField();
        text6.setBounds(650, 270, 200, 35);

        startNAC = new JLabel("Start Date: ");
        startNAC.setBounds(50, 320, 120, 30);
        startNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text7 = new JTextField();
        text7.setBounds(150, 320, 200, 35);

        completeNAC = new JLabel("Completion Date: ");
        completeNAC.setBounds(510, 320, 130, 30);
        completeNAC.setFont(new Font("Arial",Font.PLAIN , 16));

        text8 = new JTextField();
        text8.setBounds(650, 320, 200, 35);
        
        examNAC = new JLabel("Exam Date: ");
        examNAC.setBounds(300, 370, 110, 30);
        examNAC.setFont(new Font("Arial",Font.PLAIN , 16));
        
        text9 = new JTextField();
        text9.setBounds(390, 370, 200, 35);
        
        removeNAC = new JButton("Remove");
        removeNAC.setBounds(210, 450, 150, 40);       
        removeNAC.setFont(new Font("Arial",Font.BOLD , 16));

        registerNAC = new JButton("Register");
        registerNAC.setBounds(670, 400, 150, 40);
        registerNAC.setFont(new Font("Arial",Font.BOLD , 16));

        displayNAC = new JButton("Display");
        displayNAC.setBounds(65, 400, 150, 40);
        displayNAC.setFont(new Font("Arial",Font.BOLD , 16));

        clearNAC = new JButton("Clear");
        clearNAC.setBounds(530, 450, 150, 40);
        clearNAC.setFont(new Font("Arial",Font.BOLD , 16));

        switch2 = new JButton("Go to Academic");
        switch2.setBounds(350, 500, 200, 40);
        switch2.setFont(new Font("Arial",Font.BOLD , 16)); 

        //Adding all the components to panel2
        panel2.add(title2);
        panel2.add(courseNAC);
        panel2.add(text1);
        panel2.add(coursenameNAC);
        panel2.add(text2);
        panel2.add(durationNAC);
        panel2.add(text3);
        panel2.add(preNAC);
        panel2.add(text4);
        panel2.add(instructorNAC);
        panel2.add(text5);
        panel2.add(courseleaderNAC);
        panel2.add(text6);
        panel2.add(startNAC);
        panel2.add(text7);
        panel2.add(completeNAC);
        panel2.add(text8);
        panel2.add(examNAC);
        panel2.add(text9);
        panel2.add(addNAC);
        panel2.add(removeNAC);
        panel2.add(registerNAC);
        panel2.add(displayNAC);
        panel2.add(clearNAC);
        panel2.add(switch2);

        //Adding action Listener to the buttons
        switch1.addActionListener(this);
        switch2.addActionListener(this);
        addAC.addActionListener(this);
        registerAC.addActionListener(this);
        clearAC.addActionListener(this);
        displayAC.addActionListener(this);
        addNAC.addActionListener(this);
        registerNAC.addActionListener(this);
        removeNAC.addActionListener(this);
        clearNAC.addActionListener(this);
        displayNAC.addActionListener(this);

        frame.add(panel1);          //adding panel1 in frame
        frame.add(panel2);          //adding panel2 in frame
        panel1.setLayout(null);     //setting default location of panel1 to null
        panel2.setLayout(null);     //setting default location of panel2 to null
        frame.setSize(900,600);     //size of the frame
        panel1.setSize(900,600);    //size of the panel1
        panel2.setSize(900,600);    //size of the panel2

        /*Visibility of panel1 is set true but panel2 is set false.
         * It is done to show panel1 in frame by default.
         * and later with the help of button visibility of panel is controlled.
         */
        panel1.setVisible(true);    
        panel2.setVisible(false);
        frame.setResizable(false);  //resizability of frame is set false        
        frame.setVisible(true);     //visibilty of frame is set true
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //actionPerformed method to add actions to the buttons
    public void actionPerformed(ActionEvent e)
    {
        //for switch1 button, when switch1 button is pressed, panel2 is shown in frame
        if(e.getSource() == switch1)    
        {
            panel1.setVisible(false);
            panel2.setVisible(true);
        }

        //for switch2 button, when switch2 button is pressed, panel1 is shown in frame
        else if(e.getSource() == switch2)    
        {
            panel1.setVisible(true);
            panel2.setVisible(false);
        }

        //adding course for academic course
        else if (e.getSource() == addAC)
        {
            //Declaring variables
            String courseID = txt1.getText();
            String coursename = txt2.getText();
            String duration = txt5.getText();
            String level = txt3.getText();
            String credit = txt4.getText();
            String assessments = txt6.getText();
            int durationf = 0;
            int creditf = 0;
            int noaf = 0;
            
            //it checks if the textfield are empty or not
            if(courseID.isEmpty() || coursename.isEmpty() || duration.isEmpty() || level.isEmpty() ||  credit.isEmpty() || assessments.isEmpty())
            {                    
                JOptionPane.showMessageDialog(frame,"Fields cannot be empty. Fill all.","Warning Message",JOptionPane.ERROR_MESSAGE);
                return;
            }            
            else
            {     
                //for each loop to check if courseID is already present in arraylist
                for(Course c : courselist)  
                {
                    if(c instanceof AcademicCourse)
                    {
                        if(c.getCourseID().equals(courseID))
                        {
                            JOptionPane.showMessageDialog(frame,"Academic course with courseID: "+ courseID +" is already added.","Alert",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                //try block in which string is converted into integer
                try
                {
                    durationf = Integer.parseInt(duration);
                    creditf = Integer.parseInt(credit);
                    noaf = Integer.parseInt(assessments);     
                }
                //catch block to generate dialog box if try block fails
                catch(Exception e2)
                {
                    JOptionPane.showMessageDialog(frame,"Write the proper numeric values for duration, credit and number of assessments.","Warning Message",JOptionPane.ERROR_MESSAGE);
                    return;
                } 
                        
                //creating object of academic course class
                AcademicCourse academic = new AcademicCourse(courseID, coursename, durationf, level, credit, noaf);
                        
                courselist.add(academic);   //adding academic object to the arraylist
                        
                JOptionPane.showMessageDialog(frame,"Academic Course added successfully with below information:\n CourseID: "+courseID+"\n Course Name: "+coursename+"\n Duration: "+duration+"\n Level: "+level+"\n Credit: "+credit+"\n Number of assessments: "+noaf,"Successfull",JOptionPane.INFORMATION_MESSAGE);
                return;                                                                                                             
            }
        }       
   
        //adding course for Non-academic course
        else if(e.getSource() == addNAC)
        {      
            //Declaring variables
            String courseID = text1.getText();
            String coursename = text2.getText();
            String duration = text3.getText();
            String prerequisite = text4.getText();
            int durationf = 0;
            
            //checks if textfield are empty or not
            if(courseID.isEmpty() || coursename.isEmpty() || duration.isEmpty() || prerequisite.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fields cannot be empty. Fill all.","Warning Message",JOptionPane.ERROR_MESSAGE);
                return;
            }                
            else
            {
                //iterating thorugh the arraylist to check if courseID already exists or not
                for(Course c: courselist)
                {
                    if(c instanceof NonAcademicCourse)
                    {
                        if(c.getCourseID().equals(courseID))
                        {
                            JOptionPane.showMessageDialog(frame,"Non-Academic course with courseID: "+ courseID +"  is already added.","Alert",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }
                //try block in which string duration is converted into integer
                try
                {
                    durationf =  Integer.parseInt(duration); 
                }
                //catch block to handele number format exception
                catch(NumberFormatException e4)
                {
                    JOptionPane.showMessageDialog(frame,"Write the proper numeric value for duration.","Warning Message",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                        
                //creating object of NonAcademicCourse class
                NonAcademicCourse nonacademic = new NonAcademicCourse(courseID, coursename, durationf, prerequisite);
                        
                courselist.add(nonacademic);    //adding object nonacademic to course
                        
                JOptionPane.showMessageDialog(frame,"Non-Academic Course added successfully with below information: \n CourseID: "+courseID+"\n Course Name: "+coursename+"\n Duration: "+duration+"\n Prerequisite: "+prerequisite,"Successfull",JOptionPane.INFORMATION_MESSAGE);
                return;             
            }
        }
        
        //to register the academic course
        else if(e.getSource() == registerAC)
        {
            //Declaring variables
            String courseID = txt1.getText();
            String leader = txt7.getText();
            String lecturer = txt8.getText();
            String start = txt9.getText();
            String complete = txt10.getText();
            
            //checks if the text fields are empty or not
            if(courseID.isEmpty() || leader.isEmpty() || lecturer.isEmpty() || start.isEmpty() || complete.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"CourseID, leader and lecturer name similarly starting and completion date cannot be empty. \n Please fill it all.","Alert",JOptionPane.ERROR_MESSAGE);
                return;
            }
            //else if condition to run if size of arraylist is greater than 0
            else if(courselist.size() != 0)
            {
                //for each loop to iterate through list
                for(Course c: courselist)
                {
                    if(c instanceof AcademicCourse) //checking if c is instance of AcademicCourse or not
                    {
                        if((c.getCourseID()).equals(courseID))  
                        {
                            //if courseID enetered matches with existed ID register method is performed.
                            //downcasting is done to call the method register
                            AcademicCourse ac = (AcademicCourse)c;
                        
                            if(ac.getIsRegistered() == false)   //if status of register is false
                            {
                                ac.register(leader, lecturer, start, complete); //calls register method
                            
                                JOptionPane.showMessageDialog(frame,"Academic course registered successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else    //if status of register is true
                            {
                                JOptionPane.showMessageDialog(frame,"Academic Course with ID: "+courseID+" is already registered.","Alert",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                
                //if courseID does not match dialog box is displayed
                JOptionPane.showMessageDialog(frame,"CourseID you mentioned cannot be found. \n Please enter valid courseID.","Warning",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else    //else condition if the size of arraylist is zero
            {
                JOptionPane.showMessageDialog(frame,"No Academic course is added yet.","Invalid",JOptionPane.ERROR_MESSAGE);
                return;                    
            }
        }

        //to register the non-academic course
        else if(e.getSource() == registerNAC)
        {
            //Declaring variables
            String courseID = text1.getText();
            String instructor = text5.getText();
            String leader = text6.getText();
            String start = text7.getText();
            String complete = text8.getText();
            String exam = text9.getText();
            
            //checks whether texfields are empty or not
            if(courseID.isEmpty() || instructor.isEmpty() || start.isEmpty() || complete.isEmpty() || exam.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fill all the fields in courseID, instructor name, start, completion and exam date.","Warning Message",JOptionPane.ERROR_MESSAGE);
                return; 
            }
            //else if condition if size of arraylist is zero
            else if(courselist.size() == 0)
            {
                JOptionPane.showMessageDialog(frame,"No Non-Academic course is added yet.","Invalid",JOptionPane.ERROR_MESSAGE);
                return; 
            }
            //else condition to carry out registration process
            else
            {
                //for each loop to iterate through arraylist
                for(Course c: courselist)
                {
                    if(c instanceof NonAcademicCourse)  //checks if c is instance of NonAcademicCourse
                    {
                        if((c.getCourseID()).equals(courseID))  //if ID matches with existed ID below codes are carried out
                        {
                            //downcasting is done to call the method of NonAcademicCourse class
                            NonAcademicCourse nac = (NonAcademicCourse)c;                    
                            if(nac.getIsRegistered() == false)  //if status of register is false
                            {
                                nac.register(leader, instructor, start, complete, exam);    //calls method register
                            
                                JOptionPane.showMessageDialog(frame,"Non-Academic course registered successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else    //if status of register is true
                            {
                                JOptionPane.showMessageDialog(frame,"Non-Academic Course with ID: "+courseID+" is already registered.","Alert",JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                //if ID does not matches
                JOptionPane.showMessageDialog(frame,"CourseID you mentioned cannot be found. \n Please enter valid courseID.","Warning",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        //to remove non-academic course
        else if(e.getSource() == removeNAC)
        {
            //Declaring courseID
            String courseID = text1.getText();
            
            //checks if ID field is empy or not
            if(courseID.isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please fill the courseID to remove non-academic course.","Warning",JOptionPane.ERROR_MESSAGE);
                return;
            }
            //else if condition runs if size of arraylist is zero
            else if(courselist.size() == 0)
            {
                JOptionPane.showMessageDialog(frame,"No courses are available to remove.","Invalid",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                //for each loop to iterate through arraylist
                for(Course c: courselist)
                { 
                    if(c instanceof NonAcademicCourse)  //checks if c is instance of NonAcademicCourse
                    {
                        if((c.getCourseID()).equals(courseID))  //if ID matches with existed ID below codes are carried out
                        {
                            //downcasting is done to call the method of NonAcademicCourse class
                            NonAcademicCourse nac = (NonAcademicCourse)c;
                            if(nac.getIsRemoved() == false) //if the remove status is false 
                            {
                                nac.remove();   //calls the remove method of NonAcademicCourse class
                            
                                JOptionPane.showMessageDialog(frame,"Non Academic Course having CourseID: "+ courseID +" removed successfully.","INFO",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else    //if the remove status is true
                            {   
                                JOptionPane.showMessageDialog(frame,"ID of Non-Academic Course you mentioned is already removed.","INFO",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                //If ID does not matches
                JOptionPane.showMessageDialog(frame,"Course ID entered cannot be found.","Invalid",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // for clear button, which clears all the values form the text field
        else if(e.getSource() == clearAC || e.getSource() == clearNAC)
        {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            text8.setText("");
        }
        
        //to display details of academic course class
        else if(e.getSource() == displayAC)
        {
            //if arraylist is empty
            if(courselist.size() == 0)
            {
                JOptionPane.showMessageDialog(frame,"No courses are available to display.","Invalid",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                //for each loop to iterate through arraylist
                for(Course c: courselist)
                {
                    //checks if c is instance of AcademicCourse 
                    if(c instanceof AcademicCourse)
                    {
                        System.out.println("\n---------ACADEMIC COURSE---------");
                        //Downcasting
                        AcademicCourse ac = (AcademicCourse)c;
                    
                        ac.display();   //calls method display of AcademicCourse class
                    }
                }
            }
        }
        
        //to display details of non-academic course
        else if(e.getSource() == displayNAC)
        {
            //if arraylist is empty
            if(courselist.size() == 0)
            {
                JOptionPane.showMessageDialog(frame,"No courses are available to display.","Invalid",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else
            {
                //for each loop to iterate through arraylist
                for(Course c: courselist)
                {
                    //checks if c is instance of NonAcdemicCourse
                    if(c instanceof NonAcademicCourse)
                    {
                        System.out.println("\n---------NON-ACADEMIC COURSE---------");
                        //Downcasting
                        NonAcademicCourse nac = (NonAcademicCourse)c;
                    
                        nac.display();  //calls method display of NonAcademicCourse class
                    }
                }
            }
        }
    }

    //main method 
    public static void main(String[] args)
    {
        new INGCollege();   //calling constructor
    }
}
