
import java.util.*;

public class scndlarge
{
    public static void main(String args [])
     {
         int i,j,l=0,sl;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the number of elements of array");
         int n = obj.nextInt();
         int a[] = new int[20];
         System.out.println("Enter the elements of array");
         for(i=0;i<n;i++)
          {
              a[i] = obj.nextInt();
          } 
         l = a[0]; 
         for(i=0;i<n;i++)
         { 
               if (a[i] > l)
               {
                   l = a[i];
               }
         }
        sl = a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>sl && a[i]<l)
                sl = a[i];
        }
         System.out.println("Second Large = "+sl);
     }
}
