class areas
{
    public static void main(String args[])
    {
        areas obj=new areas();
        obj.area(5);
        obj.area(4,5);
        obj.area(4.5,5.5);
    }
    void area(int r)
    {
        System.out.println("Area of circle is:"+(3.14*r*r));
    }
    void area(int l,int b)
    {
        System.out.println("Area of Rectangle is:"+(l*b));
    }
    void area(double a,double b)
    {
        System.out.println("Area of triangle is:"+(0.5*a*b));
    }
}
