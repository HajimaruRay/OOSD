public class ToppingWrapper implements Pizza
{
    protected Pizza pizza;
    ToppingWrapper(Pizza pizza){
        this.pizza=pizza;
    }
    public String cook(){
        return pizza.cook();
    }
}
