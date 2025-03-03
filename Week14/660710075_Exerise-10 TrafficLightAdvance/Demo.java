public class Demo
{
    public static void test(){
        TrafficLight redLight = new RedLight(new OriginalTrafficLight());
        TrafficLight yellowLight = new YellowLight(redLight);
        TrafficLight greenLight = new GreenLight(yellowLight);
        System.out.println("Original TrafficLight: " + greenLight.design());
        
        TrafficLight bliping = new Bliping(yellowLight);
        System.out.println("Bliping TrafficLight: " + bliping.design());
        
        TrafficLight counting = new Counting(yellowLight);
        System.out.println("Counting TrafficLight: " + counting.design());
    }
}
