public class JapanessMeatballs extends Ingredient{
    JapanessMeatballs(Ramen ramen){
        super(ramen);
    }
    
    public String cook(){
        return getRamen().cook() + " + Japaness Meatballs";
    }
}
