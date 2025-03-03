public class RedLight extends NewDesign
{
    RedLight(TrafficLight trafficLight){
        super(trafficLight);
    }
     public String design(){
        return trafficLight.design()+" + RedLight";
    }
}
