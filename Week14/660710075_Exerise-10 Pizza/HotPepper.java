public class HotPepper extends ToppingWrapper
{
    HotPepper(Pizza pizza){
        super(pizza);
    }
     public String cook(){
        return pizza.cook()+"HotPepper";
    }
}
