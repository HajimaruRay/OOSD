public class ChashuPork extends Ingredient{
    ChashuPork(Ramen ramen){
        super(ramen);
    }
    public String cook(){
        return getRamen().cook() + " + Chashu Pork";
    }
}
