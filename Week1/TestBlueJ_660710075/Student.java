
public class Student extends Person
{
   private String stdID;
   
   Student(String name, int age, String gender, String stdID){
       super(name, age, gender);
       this.stdID = stdID;
   }
}
