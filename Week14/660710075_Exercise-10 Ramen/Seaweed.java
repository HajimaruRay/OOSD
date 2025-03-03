public class Seaweed extends  Ingredient{
    Seaweed(Ramen ramen){
        super(ramen);
    }
    public String cook(){
        return getRamen().cook() + " + Seaweed";
    }
}
