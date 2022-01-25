import java.util.*;
class factandsum
{
	public static void main(String args[])
	{
    	factandsum obj1=new factandsum();
        obj1.sum();
        obj1.fact();
    }
     void sum()
     {
     Scanner ob=new Scanner(System.in);
     int s=0,a;
     System.out.println("Enter the number :");
     int x=ob.nextInt();
     while(x>0)
     	{
     		a=x%10;
          	s=s+a;
       		x=x/10;
    	 }
     System.out.println("Sum of the digits of the number is :"+s);    
     }
     
     void fact()
     {
        Scanner ob1=new Scanner(System.in);
     	  int fact=1,i;
        System.out.println("Enter number to find factorial:");
        int n=ob1.nextInt();
        for(i=1;i<=n;i++)
        {
        	fact=fact*i;
        }
      System.out.println("Factorial of the given number is:"+fact);   
     }
    }
