
public class Student
{
    private String firstName;
    private String lastName;
    private int grade;
    private String email;
    private boolean enrolled;
    
    public Student(){
        
        firstName = "None";
        lastName = "None";
        grade = 0;
        email = "None";
        enrolled = false; 
        
    }
    public Student (String fName, String lName, int g, String e, boolean enrollment){
        this();
        firstName = fName;
        lastName = lName;
        grade = g;
        email = e;
        enrolled = enrollment;

        
    }
}
