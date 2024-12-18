public class Person{
    
    private String firstName;
    private String lastName;
    private int age;
    private Double salary;
    
    public Person(String firstName, String lastName, int age, Double salary) {
       this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    
    public void IncreaseSalary(Double bonus){
        salary = (salary * bonus) + salary;
    }
    
    public boolean ValidationData(){
        if (age <= 0){
            System.out.println("Age cannot be zero or negative integer");
            return false;
        } else if (firstName.length() < 3){
            System.out.println("First name cannot be less than 3 symbols");
            return false;
        } else if (lastName.length() < 3){
            System.out.println("Last name cannot be less than 3 symbols");
            return false;
        } else if(salary <= 460){
            System.out.println("Salary cannot be less than 460 leva");
            return false;
        } else{
            return true;
}
   }
    
    public String getFirstName(){
        return firstName;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        // return firstName + " " + lastName + " is " + age + " years old.";
        return firstName + " " + lastName + " gets " + salary + " leva";
    }
   
}
