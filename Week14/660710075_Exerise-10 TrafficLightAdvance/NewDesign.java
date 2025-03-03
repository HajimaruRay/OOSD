public class NewDesign implements TrafficLight
{
    protected TrafficLight trafficLight;
    NewDesign(TrafficLight trafficLight){
        this.trafficLight=trafficLight;
    }
    public String design(){
        return trafficLight.design();
    }
}
