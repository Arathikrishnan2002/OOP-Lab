
import java.util.*;

class Oddeven
 
{
   
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number: ");
        
        Scanner obj = new Scanner(System.in);

        num = obj.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
