import java.util.*;
class Cal{
    public void buzzNo(int x)
    {
        if(x%7 == 0)
        {
            System.out.println(x+" is BUZZ Number");
        }
        else if(x%10 == 7)
        {
            System.out.println(x+" is BUZZ Number");
        }
        else
        {
            System.out.println(x+" is NOT BUZZ Number");
        }
    }
}
public class Buzz{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the number is : ");
        num = s.nextInt();
        Cal c = new Cal();
        c.buzzNo(num);
    }
}