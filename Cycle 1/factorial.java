
import java.util.*;

class factorial

{

public static void main(String args[])
{

        int n,i,fact=1;
        
        System.out.println("Enter the number: ");
        Scanner obj=new Scanner(System.in);
       
         n=obj.nextInt();
        
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("The factorial of the number is "+fact);  
       
}
}
