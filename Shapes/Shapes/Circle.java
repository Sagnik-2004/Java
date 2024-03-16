package Shapes;
public class Circle{
    public int r;
    double area,perimeter;
    public void Area(){       
        area=3.14159*r*r;
        System.out.println("Area of Circle is : "+area);
    }   
    public void Perimeter(){
        perimeter=2*3.14159*r;
        System.out.println("Perimeter of Circle is : "+perimeter);
    }
}

