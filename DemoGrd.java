import java.util.*;
class Grader{
    int score; //Instance Variable 
    void Grader(){
        System.out.println("Grade : "+letterGrade());
    }
    String letterGrade(){
        if(score>90)
        {
            return "O";
        }
        else if(score<=90 && score>80)
        {
            return "E";
        }
        else if(score<=80 && score>70)
        {
            return "A";
        }
        else if(score<=70 && score>60)
        {
            return "B";
        }
        else if(score<=60 && score>=50)
        {
            return "C";
        }
        else
        {
            return "D";
        }
    }
}
public class DemoGrd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter Score : ");
        num = sc.nextInt();
        Grader gd = new Grader();
        gd.score = num;
        if(num>100)
        {
            System.out.println("Not Valid, Number is greater than 100");
        }
        else if(num<0)
        {
            System.out.println("Not Valid, Number is NEGATIVE");
        }
        else
        {
            gd.Grader();
        }
       
    }
}