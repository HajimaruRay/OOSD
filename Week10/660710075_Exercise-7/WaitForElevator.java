public class WaitForElevator implements Travel
{
    public String goThisWay(double x, int y){
        if (x < 8.30 && y < 10){
            return "Waiting for elevator.";
        }
            return "";
    }
}
