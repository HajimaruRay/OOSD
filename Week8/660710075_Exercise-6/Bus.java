public class Bus extends Vehicles
{
    public Bus(double fuelInTank, double fuelConsumption, double fuelQuantity){
        setFuelQuantity(fuelQuantity);
        setCurrentFuel(fuelInTank);
        setFuelConsumption(fuelConsumption);
    }
    
    public boolean CalculateDistance(double distance){
       return (distance*(getFuelConsumption()+1.4)) <= getCurrentFuel();
       }
    
    public boolean CalculateDistanceNoAir(double distance){
        return (distance*(getFuelConsumption())) <= getCurrentFuel();
    }
    
   public void Drive(double distance){
       if (CalculateDistance(distance)){
           System.out.println("Bus travelled " + distance +" km");
           double updateFuel = (getCurrentFuel() - (distance*(getFuelConsumption()+1.4)));
           setCurrentFuel(updateFuel);
       } else{
           System.out.println("Bus needs refueling");
       }
   }
   
   public void DriveEmpty(double distance){
        if (CalculateDistanceNoAir(distance)){
           System.out.println("Bus travelled " + distance +" km");
           double updateFuel = (getCurrentFuel() - (distance*(getFuelConsumption())));
           setCurrentFuel(updateFuel);
       } else{
           System.out.println("Bus needs refueling");
       }
    }
   
   public void Refuel(double newFuel){
        double currentFuel = getCurrentFuel();
        double fuelCapacity = getFuelQuantity();
        if((getCurrentFuel() + newFuel) > getFuelQuantity()){
            System.out.println("Cannot fit fuel in tank");
        } else if (newFuel > 0){
            setCurrentFuel(getCurrentFuel() + newFuel);
        } else{
            System.out.println("Fuel must be a positive number");
        } 
   }
   
   public void getFuel(){
       System.out.printf("Bus: %.2f\n" ,getCurrentFuel());
   }
}


