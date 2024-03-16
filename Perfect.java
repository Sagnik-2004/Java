import java.util.*;
class Checker{
    int num;
    Checker(int n){
        this.num=n;
    }
    void chkpft(){
        int x=this.num,s=0;
        for(int i=1;i<this.num;i++){
            if(this.num%i==0){
                s=s+i;
            }
        }
        if(s==this.num){
            System.out.println(this.num+"is Perfect Number");
        }
        else{
            System.out.println(this.num+" is NOT Perfect Number");
        }
    }
}
public class Perfect{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the number : ");
        x=sc.nextInt();
        Checker ck = new Checker(x);
        ck.chkpft();
    }
}