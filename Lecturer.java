//  public class 'Lecturer' that extends the 'Teacher' class
public class Lecturer extends Teacher
{
   
    // Private instance variables specific to the 'Lecturer' class
    private String Department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    char scoreGrade;

    //id,name,address,workingType,employmentStatus,department,experince,gradedScore
    // Constructor
    public Lecturer(int teacherId, String teachername, String address,String workingtype
    , String employmentstatus,String Department,int YearsOfExperience,int gradedScore){
        // Call the constructor of the superclass 'Teacher' using 'super'
        super(teacherId, teachername, address, workingtype, employmentstatus);
        // Initialize instance variables specific to 'Lecturer'
        this.Department = Department;
        this.YearsOfExperience = YearsOfExperience;
        this.gradedScore = gradedScore ;
        this.hasGraded = false;
        super.setWorkingHours(5);
    }

    // Accessor method(Getter Method) for 'Department'
    public String getDepartment()
    {
        return Department;
    }

    // Accessor method(Getter Method) for 'YearsOfExperience'
    public int getYearsOfExperience()
    {
        return YearsOfExperience;
    }

    // Accessor method(Getter Method) for 'gradedScore'
    public int getGradedScore()
    {
        return gradedScore;
    }

    // Accessor method(Getter Method) for 'hasGraded'
    public boolean gethasGraded()
    {
        return hasGraded;
    }

    // Mutator method(Setter Method) for 'gradedScore'
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }

    // Method to grade an assignment based on the score and student's department
    public char gradeAssignment(int gradedscore, String department,
                                int YearsOfExperience)
    {
        // Check eligibility criteria for grading
    if (hasGraded ==false)
         {
            if (YearsOfExperience >= 5 && department == this.Department)
                {
                if(gradedScore >=70)
                   {
                       scoreGrade = 'A';
                   }
               else if(gradedScore >=60 && gradedScore < 70)
                   {
                       scoreGrade = 'B';
                   }
               else if(gradedScore >=50 && gradedScore < 60)
                   {
                       scoreGrade = 'C';
                   }
               else if(gradedScore >=40 && gradedScore < 50)
                   {
                       scoreGrade = 'D';
                   }
               else
                   {
                       scoreGrade = 'E';
                   }
                       hasGraded = true;
                }  
       
            else
                {
                   System.out.println("Cannot assign grades for this student");
                }
        }
    else
        {
        System.out.println("Assignment have already been graded" );
        }
   
        return scoreGrade;
    }
   
    public void display()
    {
        // Call the display method of the superclass 'Teacher'
        super.display();
       
        // Display additional information specific to 'Lecturer'
        System.out.println(" Department is " + getDepartment());
        System.out.println(" Years of Experience is " + getYearsOfExperience());
        System.out.println(" Graded Score " + getGradedScore());

        //if the assignment is not graded a suitable message is displayed.
        if (gethasGraded() != true)
        {
            System.out.println("The Assignments have not been graded yet. " );
        }
        else
        {
            System.out.println("The Assignments have been graded:- " + "Grade: " + scoreGrade);
        }
    }
}
