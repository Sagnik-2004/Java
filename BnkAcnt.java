import java.util.*;
abstract class Accounts{
    int Balance=500000, accountNumber;
    String accountHoldersName, address ;
    abstract void withdrawl(int x);
    abstract void deposit(int x);
    void display(){
        System.out.println("Account Balance = "+Balance);
    } 
}
class SavingsAccount extends Accounts{
    int rateOfInterest=5; 
    void withdrawl(int x){
        super.Balance=super.Balance-x;
    }
    void deposit(int y){
        super.Balance=super.Balance+y;
    }
    void calculateAmount(int time){
        int interest;
        interest=super.Balance*time*rateOfInterest/100;
        System.out.println("Interest is : "+interest);
    }
} 
public class BnkAcnt{
    public static void main(String args[]){
        SavingsAccount sa = new SavingsAccount();
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Withdral : ");
                System.out.println("Enter amount to Withdraw : ");
                int m=sc.nextInt();
                sa.withdrawl(m);
                sa.display();
                break;
            case 2:
                System.out.println("Deposit : ");
                System.out.println("Enter amount to Deposit : ");
                int n=sc.nextInt();
                sa.deposit(n);
                sa.display();
                break;
            case 3:
                System.out.println("Calculate Interest : ");
                System.out.println("Enter Time : ");
                int r=sc.nextInt();
                sa.calculateAmount(r);
                sa.display();
                break;
            default:
                System.out.println("Enter correct choice !! ");
        }
    }
}

