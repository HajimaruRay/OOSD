import java.util.Arrays;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo
{
   public static void test(){
       // P1
       /*
       Class[] citizenInterfaces = Citizen.class.getInterfaces();
       if(Arrays.asList(citizenInterfaces).contains(Person.class)){
           Method[] fields = Person.class.getDeclaredMethods();
           Scanner scanner = new Scanner(System.in);
           String name = scanner.nextLine();
           int age = Integer.parseInt(scanner.nextLine());
           Person person = new Citizen(name,age);
           System.out.println(fields.length);
           System.out.println(person.getName());
           System.out.println(person.getAge());
         }*/
         
       // P2
       /*Class[] citizenInterfaces = Citizen.class.getInterfaces();
       if(Arrays.asList(citizenInterfaces).contains(Identifiable.class)){
           Method[] methods = Identifiable.class.getDeclaredMethods();
           methods = Identifiable.class.getDeclaredMethods();
           String name = "Pesho";
           int age = 25;
           String id = "91";
           String birthdate = "15/05/1995";
           Identifiable identifiable = new Citizen(name,age,id,birthdate);
           System.out.println(methods.length);
           System.out.println(methods[0].getReturnType().getSimpleName());
           System.out.println(methods.length);
           System.out.println(methods[0].getReturnType().getSimpleName());
        }*/
        
       // P3
        Birthable[] thingsWithBirthday = new Birthable[10];
        int count = 0;
        
        String input = "Citizen Pesho 22 9010101122 10/10/1990";
        String[] textSplit = input.split(" ");
        String objectType = textSplit[0];
        
        switch (objectType) {
            case "Citizen":
                String citizenName = textSplit[1];
                int citizenAge = Integer.parseInt(textSplit[2]);
                String citizenId = textSplit[3];
                String citizenBirthDate = textSplit[4];
                Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthDate);
                if (count < thingsWithBirthday.length) {
                    thingsWithBirthday[count++] = citizen;
                }
                break;
            case "Pet":
                String petName = textSplit[1];
                String petBirthDate = textSplit[2];
                Pet pet = new Pet(petName, petBirthDate);
                if (count < thingsWithBirthday.length) {
                    thingsWithBirthday[count++] = pet;
                }
                break;
            case "Robot":
                Robot robot = new Robot(textSplit[1], textSplit[2]);
                if (count < thingsWithBirthday.length) {
                    thingsWithBirthday[count++] = robot;
                }
                break;
        }
        
        String year = "1990";
        boolean isFound = false;
        
        for (int i = 0; i < count; i++) {
            if (thingsWithBirthday[i] != null && thingsWithBirthday[i].getBirthDate().endsWith(year)) {
                isFound = true;
                System.out.println(thingsWithBirthday[i].getBirthDate());
            }
        }
        
        if (!isFound) {
            System.out.println("<no output>");
        }

    }
}
