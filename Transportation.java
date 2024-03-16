class Vehicle{
    protected int regnNumber, speed;
    protected String color, ownerName;
    void showData( ){
        System.out.println("This is a vehicle class");
    } 
}
class Bus extends Vehicle{
    private int routeNumbere=78;
    {
    super.regnNumber=2000813;
    super.speed=180;
    super.color="Blue";
    super.ownerName="Raj";
    }
    void showData( ){
        super.showData( );
        System.out.println("Registration Number : "+super.regnNumber+" Speed :"+super.speed+" Owner Name : "+super.ownerName);
        System.out.println("Manufacturer Name : "+routeNumbere);
    }
}
class Car extends Vehicle{
    private String manufacturerName="AUDI";
    {
    super.regnNumber=1998761;
    super.speed=314;
    super.color="Red";
    super.ownerName="Sagnik";
    }
    void showData( ){
        super.showData( );
        System.out.println("Registration Number : "+super.regnNumber+" Speed :"+super.speed+" Owner Name : "+super.ownerName);
        System.out.println("Manufacturer Name : "+manufacturerName);
    }
}
public class Transportation{
    public static void main(String args[]){
        Bus bs = new Bus();
        Car cr = new Car();
        bs.showData();
        cr.showData();
    }
}