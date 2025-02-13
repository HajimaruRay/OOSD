public class StairNearElevator implements Travel
{
    public String goThisWay(double x, int y){
        if (x < 8.30 && y >= 10){
            return "Use stair next to elevator.";
        }
        return "";
    }
}
