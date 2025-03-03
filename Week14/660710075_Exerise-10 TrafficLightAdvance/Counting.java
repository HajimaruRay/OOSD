public class Counting extends  NewDesign
{
    Counting(TrafficLight trafficLight){
        super(trafficLight);
    }
    public String design(){
        return trafficLight.design()+" + Countdown number";
    }
}
