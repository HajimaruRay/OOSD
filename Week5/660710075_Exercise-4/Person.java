public class Person
{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    
    private void setName(String name)throws IllegalArgumentException{
        if (name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }
    
    private void setAge(int age)throws IllegalArgumentException{
        if (age < 0){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }
    
    public String toString(){
        return "Name: " + name + ",Age: " + age;
    }
}
