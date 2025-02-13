public class WalkPatternDemo
{
   public static void test(){
       Context context;
       
       context = new Context(new StairNearParkingLot());
       System.out.println("Time: 8.30, People waiting for elevator: 0 " + context.choosesWays(8.30, 0));
       
       context = new Context(new WaitForElevator());
       System.out.println("Time: 8.29, People waiting for elevator: 9 " + context.choosesWays(8.29, 9));
       
       context = new Context(new StairNearElevator());
       System.out.println("Time: 8.29, People waiting for elevator: 11 " + context.choosesWays(8.29, 11));
       
       
   }
}
