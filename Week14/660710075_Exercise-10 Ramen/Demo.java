public class Demo{
    public static void test(){
        Ramen seaweed = new Seaweed(new PlainRamen());
        Ramen chashuPork = new ChashuPork(seaweed);
        Ramen japanessMeatballs = new JapanessMeatballs(chashuPork);
        System.out.println("Description: " + japanessMeatballs.cook());
    }
}
