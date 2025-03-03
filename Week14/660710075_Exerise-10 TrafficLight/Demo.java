public class Demo
{
    public static void test(){
        TrafficLight bliping = new Bliping(new OriginalTrafficLight());
        TrafficLight counting = new Counting(bliping);
        System.out.println("Description: " + counting.design());
    }
}
