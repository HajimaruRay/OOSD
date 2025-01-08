public class Robot implements Birthable
{
   private String id;
   private String model;
   
   public Robot(String newId, String newModel){
       id = newId;
       model = newModel;
    }
    
   public String getId(){
       return id;
    } 
    
   public String getModel(){
       return model;
    }
    
    public String getBirthDate() {
        return "N/A";  // Since robots don't have a birth date, we return a default value
    }
}
