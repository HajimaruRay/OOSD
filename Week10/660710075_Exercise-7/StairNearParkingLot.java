public class StairNearParkingLot implements Travel
{
    public String goThisWay(double x, int y){
        if (x >= 8.30){
            return "Use stair near parking lot.";
        }
        return "";
    }
}