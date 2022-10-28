package pracexam1;
import java.lang.Math;
import java.sql.SQLOutput;

abstract class Shape {
    abstract void area();
    double area;
}
class Rectangle extends Shape {
    double w = 25, h = 15;

    void area() {
        area = w * h;
        System.out.println("Area of rectangle is:" + area);
    }
}
class Square extends Shape
{
    double a = 40;
    void area()
    {
        area = a*a;
        System.out.println("Area of square is:"+area);
    }
}
class Circle extends Shape
{
    double r = 8;
    void area()
    {
        area = Math.PI*r*r;
        System.out.println("Area of square is:"+area);
    }
}
class calculate_area
{
    public static void main(String[]args){
            Square sq= new Square();
            Rectangle rec = new Rectangle();
            Circle cc = new Circle();
            sq.area();
            rec.area();
            cc.area();
    }
}