public class Demo
{
  public static void test(){
    Car car = new Car(30, 0.04, 70);
    Truck truck = new Truck(100, 0.5, 300);
    Bus bus = new Bus(40,0.3,150);
      
    /*
    // Test#1
    car.Drive(9)
    car.Drive(30);
    car.Refuel(50);
    truck.Drive(10);
    car.getFuel();
    truck.getFuel();
    
    // Test#2
    car.Drive(500);
    car.Drive(13.5);
    truck.Refuel(10.300);
    truck.Drive(56.2);
    car.Refuel(100.2);
    car.getFuel();
    truck.getFuel();
    */
    
    //Test#3
    car.Refuel(-10);
    truck.Refuel(0);
    car.Refuel(10);
    car.Refuel(3000);
    bus.Drive(10);
    bus.Refuel(1000);
    bus.DriveEmpty(100);
    truck.Refuel(1000);
    
    car.getFuel();
    truck.getFuel();
    bus.getFuel();
  }
}
