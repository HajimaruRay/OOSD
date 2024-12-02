
public class Person
{
    private String name;
    private int age;
    private String gender;
    
    Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    
    public void greeting(Person p){
        System.out.println("Hello," + p.getName());
    }
}
