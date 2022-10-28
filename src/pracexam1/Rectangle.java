package pracexam1;
public interface Rectangle {
    float PI = 3.14F;

    float compute(float w, float h);
}



    class Area extends Rectangle {
    public float compute (float w, float h)
    {
        return (w*h);
        String area
        System.out.println("Area of rectangle is:"+area);
    }

        public void area() {
        }
    }
class Perimeter extends Rectangle {
    public Object perimeter;

    public float compute (float l, float b)
    {
        return (2*(l+b));
        String perimeter;
        System.out.println("Perimeter of rectangle is:"+perimeter);
    }
}
class InterfaceTest2
{
    public static void main(String[]args){
        Area ar = new Area();
        Perimeter pr = new Perimeter();
        ar.area();
        pr.perimeter();
    }
}
