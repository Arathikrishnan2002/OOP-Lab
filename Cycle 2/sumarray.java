import java.util.*;

public class sumarray
{
	public static void main(String[] args) {
		{   
		    int i,s=0;
		    Scanner obj = new Scanner (System.in);
		    System.out.println("Enter the number of elements of array");
		    int n =  obj.nextInt();
		    int a[] = new int[20];
		    System.out.println("Enter the elements of array");
		    for (i=0;i<n;i++) 
		        a[i] = obj.nextInt();
		    for (i=0;i<n;i++)
		         s = s+a[i];
		    System.out.println("Sum of the array elements = "+s);
		}
	}
}

