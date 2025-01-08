public class Citizen implements Person, Identifiable, Birthable
{
   private String name;
   private int age;
   private String id;
   private String birthDate;
   
   public Citizen(String newName, int newAge, String newId, String newBirthDate){
       name = newName;
       age = newAge;
       id = newId;
       birthDate = newBirthDate;
    }
   
   public String getName(){
       return name;
    }
    
   public int getAge(){
       return age;
    }
    
   public String getId(){
       return id;
    }
    
   public String getBirthDate(){
       return birthDate;
    }
    
   /*public String toString(){
       return name + " " + age + " " + id + " " + birthDate;
    }*/
}
