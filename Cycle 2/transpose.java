import java.util.*;

public class transpose
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
         for(i=0;i<n;i++)
          for(j=0;j<m;j++)         
          {
              b[j][i] = a[i][j];
          }
        System.out.println("The transposed Matrix is:");
        for(i=0;i<m;i++)
          for(j=0;j<n;j++)          
          {              
              for(j=0;j<n;j++)
              System.out.print(b[i][j]+"\t");
              System.out.println();
          }
     }
}
