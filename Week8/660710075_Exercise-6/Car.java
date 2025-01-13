public class Car extends Vehicles
{ 
   public Car(double fuelInTank, double fuelConsumption, double fuelQuantity){
        setFuelQuantity(fuelQuantity);
        setCurrentFuel(fuelInTank);
        setFuelConsumption(fuelConsumption);
    }
   
   public boolean CalculateDistance(double distance){
       return (distance*(getFuelConsumption()+0.9)) <= getCurrentFuel();
   }
    
   public void Drive(double distance){
       if (CalculateDistance(distance)){
           System.out.println("Car travelled " + distance +" km");
           double updateFuel = (getCurrentFuel() - (distance*(getFuelConsumption()+0.9)));
           setCurrentFuel(updateFuel);
       } else{
           System.out.println("Car needs refueling");
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
       System.out.printf("Car: %.2f\n" ,getCurrentFuel());
   }
}
