import java.util.*;

public class trace
{
    public static void main(String args [])
     {         
         int i,j,s=0;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the number of rows of the matrix");
         int n = obj.nextInt();
         System.out.println("Enter the number of columns of the matrix");
         int m = obj.nextInt();
         int a[][] = new int[20][20];
         int b[][] = new int[20][20];
         System.out.println("Enter elements of matrix ");
         for(i=0;i<n;i++)
          for(j=0;j<m;j++)          
          {
              a[i][j] = obj.nextInt();
          }
       if(m==n)
        {
            for(i=0;i<m;i++)
           for(j=0;j<n;j++)
           { 
             if(i==j)
              {
                  s = s + a[i][j];                
              }
           }
            System.out.println("The sum of diagonal elements is :" +s);
        }
       else
             {
              System.out.println("The matrix is not a square matrix");
             }          
     }
}
 
