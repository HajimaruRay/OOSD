public class GreenLight extends NewDesign
{
    GreenLight(TrafficLight trafficLight){
        super(trafficLight);
    }
     public String design(){
        return trafficLight.design()+" + GreenLight";
    }
}
