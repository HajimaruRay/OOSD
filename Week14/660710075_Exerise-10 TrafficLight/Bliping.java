public class Bliping extends NewDesign
{
    Bliping(TrafficLight trafficLight){
        super(trafficLight);
    }
     public String design(){
        return trafficLight.design()+" + Bliping green light";
    }
}
