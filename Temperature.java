class TooHot extends Exception{
    TooHot(String message){
        super (message);
    }  
}
class TooCold extends Exception{
    TooCold(String message){
        super (message);
    } 
}
public class Temperature{
    public static void main(String args[]){
        try{
            double tempC=Double.parseDouble(args[0]);
            if(tempC>35) throw new TooHot("Too Hot");
            if(tempC<5) throw new TooCold("Too Cold");
            double tempF;
            tempF=(9*tempC/5)+32;
            System.out.println("Temperature in Fahrenheit is : "+tempF);
        }
        catch(TooHot th){
            System.out.println("Too Hot !! ");
        }
        catch(TooCold tc){
            System.out.println("Too Cold !! ");
        }
        
    }
}