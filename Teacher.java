// This is a Teacher class.
public class Teacher
{
    // Attributes of Teacher class.
    private int teacherId;               //teacherId with int data type.
    private String teachername;         //teacherName with String data type.
    private String address;            //address with String data type.
    private String workingtype;       //workingType with String data type.
    private String employmentstatus; //employmentStatus with String data type.
    private int workinghours;       //workingHours with int data type.      

    //Constructor with five parameters.
    public Teacher(int teacherId, String teachername, String address,
    String workingtype, String employmentstatus)
    {
        this.teacherId = teacherId;
        this.teachername = teachername;
        this.address = address;
        this.workingtype = workingtype;
        this.employmentstatus = employmentstatus;
    }

    //Getter methods(accessor methods) to retrieve data from each attribute.
    public int getTeacherId()
    {
        return this.teacherId;
    }

    public String getTeacherName()
    {
        return this.teachername;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getWorkingType()
    {
        return this.workingtype;
    }

    public String getEmploymentStatus()
    {
        return this.employmentstatus;
    }

    public int getWorkingHours()
    {
        return this.workinghours;
    }

    //Setter method to accept workingHours as a parameter.
       public void setWorkingHours(int workingHours)
    {
        this.workinghours = workingHours;
    }

    /*Method to display the teacher Id, teacher name, address,  
     working type and employment status.*/
     public void display()
     {
        System.out.println("The Teacher Id is " + getTeacherId());
        System.out.println("The Teacher Name is " + getTeacherName());
        System.out.println("The Address is " + getAddress());
        System.out.println("The Working Type is " + getWorkingType());
        System.out.println("The Employment Status is " + getEmploymentStatus());

        /*Check if the working hours is assigned if not then a suitable
        message is displayed.*/
        if (workinghours == 0)
        {
            System.out.println("The Working hours have not been assgined");
        }
        else
        {
            System.out.println("The Working hours is " + getWorkingHours());
        }
    }
}
