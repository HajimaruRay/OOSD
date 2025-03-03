public class Ingredient implements Ramen{
    private Ramen ramen;
    Ingredient(Ramen ramen){
        this.ramen=ramen;
    }
    public String cook(){
        return ramen.cook();
    }
    
    public Ramen getRamen(){
        return ramen;
    }
}
