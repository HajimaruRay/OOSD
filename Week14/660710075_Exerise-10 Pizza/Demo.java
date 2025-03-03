public class Demo
{
    public static void test(){
        Pizza pepperoni = new Pepperoni(new PlainPizza());
        Pizza hotPepperoni = new HotPepper(pepperoni);
        System.out.println("Description: " + hotPepperoni.cook());
    }
}
