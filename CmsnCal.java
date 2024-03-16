import java.util.*;
class Commission{
    int sales;
    void Commission(){
        System.out.println("The Commission is : "+commission());
    }
    int commission(){
        int val;
        val=(sales*15)/100;
        return val;
    }
}
public class CmsnCal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter The Sale : ");
        num = sc.nextInt();
        Commission cmsn = new Commission();
        if(num<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            cmsn.sales=num;
            cmsn.Commission();
        }

    }
}