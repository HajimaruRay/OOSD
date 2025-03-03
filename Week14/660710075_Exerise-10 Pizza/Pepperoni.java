
public class Pepperoni extends  ToppingWrapper
{
    Pepperoni(Pizza pizza){
        super(pizza);
    }
    public String cook(){
        return pizza.cook()+"Pepperoni";
    }
}
