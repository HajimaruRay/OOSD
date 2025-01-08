public class Pet implements Birthable
{
    private String name;
    private String birthDate;
    
    public Pet(String newName, String newBirthDate){
        name = newName;
        birthDate = newBirthDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String getBirthDate(){
        return birthDate;
    }
}
