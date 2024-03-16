import java.util.*;
class Num{
    int num;
    void shownum(){
        System.out.println("The number is : "+num);
    }
}
class HexNum extends Num{
    //int hex;
    void shownum(){
        System.out.println("Hexadecimal Number is : "+Integer.toHexString(super.num));  
    }
} 
public class converter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int nom;
        nom = sc.nextInt();
        Num nm = new Num();
        HexNum hnm = new HexNum();
        hnm.num=nom;
        hnm.shownum();
    }
}