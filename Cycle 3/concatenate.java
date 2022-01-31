import java.util.*;
public class concatenate
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 2 strings to be concatenated :");
        String c = obj.nextLine();
        String d = obj.nextLine();
        
        System.out.print("Enter 2 numbers to be concatenated :");
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        concatenate sc = new  concatenate();
        sc.consum(a,b);
        sc.consum(c,d);
    }
    void consum(int a,int b)
       { 
          System.out.println("Concatenated numbers = " +a+b);
       }   
    void consum(String a,String b)  
       {
           System.out.println("Concatenated strings = "+a+b);
       }
}
