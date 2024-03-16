//import Shapes.*;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Triangle;

import java.util.*;
public class ShapeCal{
    public static void main(String args[]){
        Triangle tg =new Triangle();
        Circle cr =new Circle();
        Rectangle rt=new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Triangle Selected");
                System.out.println("Enter Height : ");
                tg.height=sc.nextInt();
                System.out.println("Enter base : ");
                tg.base=sc.nextInt();
                System.out.println("Enter side1 : ");
                tg.side1=sc.nextInt();
                System.out.println("Enter side2 : ");
                tg.side2=sc.nextInt();
                tg.Area();
                tg.Perimeter();
                break;
            case 2:
                System.out.println("Rectangle Selected");
                System.out.println("Enter Length : ");
                rt.length=sc.nextInt();
                System.out.println("Enter Bredth : ");
                rt.bredth=sc.nextInt();
                rt.Area();
                rt.Perimeter();
                break;
            case 3:
                System.out.println("Circle Selected");
                System.out.println("Enter Radius : ");
                cr.r=sc.nextInt();
                cr.Area();
                cr.Perimeter();
                break;
            default:
                System.out.println("Enter Correct Choice");
        }
    }
}