import java.util.*;
class ThreeDObject{
    void wholeSurfaceArea( ){
        System.out.println("This Calculates AREA");
    }
    void volume( ){
        System.out.println("This Calculates VOLUME");
    }
}
class Box extends ThreeDObject{
    int ht,wt,lt;
    void Box(){
        System.out.println("This is BOX ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        lt = sc.nextInt();
        System.out.println("Enter Width : ");
        wt = sc.nextInt();
        System.out.println("Enter Height : ");
        ht = sc.nextInt();
    }
    void wholeSurfaceArea( ){
        System.out.println("Surface area of the Box is : "+(2*(ht*lt+lt*wt+ht*wt)));
    }
    void volume( ){
        System.out.println("Volume of the Box is : "+(lt*ht*wt));
    }
}
class Cube extends ThreeDObject{
    int lt;
    void Cube(){
        System.out.println("This is CUBE ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side_Length : ");
        lt = sc.nextInt();
    }
    void wholeSurfaceArea( ){
        System.out.println("Surface area of the Cube is : "+(6*lt*lt));
    }
    void volume( ){
        System.out.println("Volume of the Box is : "+(lt*lt*lt));
    }
}
class Cylinder extends ThreeDObject{
    float rad,ht;
    void Cylinder(){
        System.out.println("This is CYLINDER ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        rad = sc.nextInt();
        System.out.println("Enter Height : ");
        ht = sc.nextInt();
    }
    void wholeSurfaceArea( ){
        double srfs,pi=3.14159;
        srfs = 2*pi*rad*(rad+ht);
        System.out.println("Surface area of the Cylinder is : "+srfs);
    }
    void volume( ){
        double vlm,pi=3.14159;
        vlm = pi*rad*rad*ht;
        System.out.println("Volume of the Cylinder is : "+vlm);
    }
}
public class AreaVol{
    public static void main(String args[]){
        Box bx = new Box();
        Cube cb = new Cube();
        Cylinder clndr = new Cylinder();
        bx.Box();
        bx.wholeSurfaceArea();
        bx.volume();
        cb.Cube();
        cb.wholeSurfaceArea();
        cb.volume();
        clndr.Cylinder();
        clndr.wholeSurfaceArea();
        clndr.volume();
    }
}