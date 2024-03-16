class IllegalArgumentException extends Exception{
    IllegalArgumentException(String message){
        super(message);
    }
}
public class Factorial{
    public static void main(String args[]){
        try{
            int x = Integer.parseInt(args[0]);
            if(x<0) throw new IllegalArgumentException("Given data is less than 0");
            int s=1;
            for(int i=1;i<=x;i++){
                s=s*i;
            }
            System.out.println("Factorial of "+x+" is : "+s);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Array index out of Bound");
        }
        catch(NumberFormatException e2){
            System.out.println(e2.getMessage());
        }
        catch(IllegalArgumentException e3){
            System.out.println(e3.getMessage());
        }
        
    }
}