package Shapes;
public class Rectangle{
    public int length,bredth;
    public double area,perimeter;
    public void Area(){ 
        area=length*bredth;
        System.out.println("Area of Rectangle is : "+area);
    }
    public void Perimeter(){
        perimeter=2*(length+bredth);
        System.out.println("Perimeter of Rectangle is : "+perimeter);
    }
}