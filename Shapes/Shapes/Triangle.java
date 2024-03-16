package Shapes;
public class Triangle{
    public int height,base,side1,side2;
    public double area,perimeter;;
    public void Area(){    
        area=(0.5)*height*base;
        System.out.println("Area of Triangle is : "+area);
    }   
    public void Perimeter(){
        perimeter=base+side1+side2;
        System.out.println("Perimeter of Triangle is : "+perimeter);
    }
}