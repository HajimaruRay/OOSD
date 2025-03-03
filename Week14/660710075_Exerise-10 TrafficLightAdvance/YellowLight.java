public class YellowLight extends NewDesign
{
    YellowLight(TrafficLight trafficLight){
        super(trafficLight);
    }
     public String design(){
        return trafficLight.design()+" + YellowLight";
    }
}
