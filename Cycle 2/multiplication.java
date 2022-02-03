
import java.util.*;
public class multiplication 
{
    public static void main(String args [])
     {       
         int i,j,k;   
         int a[][] = new int[20][20];
         int b[][] = new int[20][20];
         int c[][] = new int[20][20];
         Scanner obj = new Scanner(System.in);
         
         System.out.println("Enter the number of rows of the matrix 1");
         int r1 = obj.nextInt();
         System.out.println("Enter the number of columns of the matrix 1");
         int c1 = obj.nextInt();
         System.out.println("Enter elements of matrix 1");
         for(i=0;i<r1;i++)
          for(j=0;j<c1;j++)       
          {
              a[i][j] = obj.nextInt();
          }
          
         System.out.println("Enter the number of rows of the matrix 2");
         int r2 = obj.nextInt();
         System.out.println("Enter the number of columns of the matrix 2");
         int c2 = obj.nextInt();
         System.out.println("Enter elements of matrix 2");
          for(i=0;i<r2;i++)
          for(j=0;j<c2;j++)
          {    
              b[i][j] = obj.nextInt();
          }
         if(c1==r2)
         {
         for(i=0;i<r1;i++)
         {
             for(j=0;j<c2;j++)
              {
                c[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j] +( a[i][k]*b[k][j]);
                }                
              }        
          }
          System.out.println("Resultant matrix is:");             
          for(i=0;i<r1;i++)
          {
             for(j=0;j<c2;j++)
              {
                  System.out.print(c[i][j]+"\t");
              }
              System.out.println();
          } 
        }
        else
        {
            System.out.println("Matrix multiplication is not possible");
        }
        
     }
}
