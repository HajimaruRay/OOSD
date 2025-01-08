public class Demo
{
   public static void Test(){
       String name = "Joe";
       int age = 20;
       
       try{
           Child child = new Child(name,age);
           System.out.println(child.toString());
           System.out.println(Person.class.getSimpleName());
           System.out.println(Child.class.getSimpleName());
       } catch(Exception e){
           System.out.println(e.getMessage());
       }
       
   }
}
