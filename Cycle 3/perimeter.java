import java.util.*;
class perimeter
{
    public static void main(String args[])
    {
        perimeter obj=new perimeter(5);
        perimeter  obj1=new  perimeter(5,4);
    }
    perimeter(int r)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*r));
    }
    perimeter(int a,int b)
    {
        int p=a+b;
        int t=2*p;
        System.out.println("Perimeter  of rectangle is:"+t);
    }
} 
