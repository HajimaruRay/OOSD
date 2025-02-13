public class Context
{
   private Travel travel;
   
   public Context(Travel travel){
       this.travel = travel;
   }
   
   public String choosesWays(double x, int y){
       return travel.goThisWay(x,y);
   }
}
