import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    
    public static void Test() {
        String input = "5 Asen Ivanov -6 2200 B Borisov 57 3333 Ventsislav Ivanov 27 600 Asen H 44 666.66 Boiko Angelov 35 300";
        String[] data = input.split(" ");
        int n = Integer.parseInt(data[0]);
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            persons.add(new Person(data[1 + i*4], data[2+i*4], Integer.parseInt(data[3+i*4]), Double.parseDouble(data[4+i*4])));
        }
        
        for (Person person : persons) {
            if (person.ValidationData()){
                   if (person.getAge() < 30){
                      person.IncreaseSalary(0.10);
                   } else{
                      person.IncreaseSalary(0.20);
                   }
                   System.out.println(person.toString());
            }
        }
    }}        