public class Child extends Person
{
    public Child(String name, int age){
        super(name,age);
        if (age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
    }
    
    private void setAge(int age){
       //super.setAge(age);
    }
}
