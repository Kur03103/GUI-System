//public class 'Tutor' that extends the 'Teacher' class
public class Tutor extends Teacher
{
   
    // Private instance variables specific to the 'Tutor' class
    private double salary;
    private String specialization;
    private String academicqualifications;
    private int performanceIndex;
    private boolean isCertified;

    // Constructor
    public Tutor(int teacherId, String teachername, String address,
                 String workingtype, String employmentstatus,
                 int workingHours, double salary, String specialization,
                 String academicqualifications,
                 int performanceIndex)
    {
        // Call the constructor of the superclass 'Teacher' using 'super'
        super(teacherId,teachername,address,workingtype,employmentstatus);
        // Initialize instance variables specific to 'Tutor'
        this.salary = salary;
        this.specialization = specialization;
        this.academicqualifications = academicqualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        setWorkingHours(workingHours);
    }

    // Accessor method for 'salary'
    public double getSalary()
    {
        return this.salary;
    }

    // Accessor method for 'specialization'
    public String getSpecialization()
    {
        return this.specialization;
    }

    // Accessor method for 'academicqualifications'
    public String getAcademicqualifications()
    {
        return this.academicqualifications;
    }

    // Accessor method for 'performanceIndex'
    public int getPerformanceIndex()
    {
        return this.performanceIndex;
    }

    // Accessor method for 'isCertified'
    public boolean getisCertified()
    {
        return this.isCertified;
    }

    /* Mutator method (Setter method) to set the salary and update
    certification status*/
    public void setSalary(double newSalary, int newPerformanceIndex)
    {
        // Check eligibility for salary appraisal
        if (newPerformanceIndex >= 5 && getWorkingHours() > 20)
        {
            if (newPerformanceIndex <= 7)
            {
                this.salary = salary + (0.05 * salary);
            }
            else if (newPerformanceIndex <= 9)
            {
                this.salary = salary + (0.10 * salary);
            }
            else if (newPerformanceIndex == 10)
            {
                this.salary = salary + (0.20 * salary);
            }
           
            this.isCertified = true;
        }
       
        else
        {
            System.out.println("Salary cannot be approved");
        }
    }
   
   

    // Method to remove the tutor (if not certified yet)
    public void removeTutor()
    {
        if (this.isCertified != true)
        {
            // Reset attributes to zero and set isCertified to false
            this.salary = 0;
            this.specialization = "";
            this.academicqualifications = "";
            this.performanceIndex = 0;
        }
        this.isCertified = false;
    }
    

    // Method to display information about the tutor
       public void display()
    {  //isCertified set to false.
       if(isCertified = false)
       {
        super.display();
       }
       
       else
       {
        super.display();
        System.out.println("Salary :" +getSalary());
        System.out.println("Specialization:" +getSpecialization());
        System.out.println("Academic Qualifiaction:" +getAcademicqualifications());
        System.out.println("PerformenceIndex:" +getPerformanceIndex());
       }
    }
}
