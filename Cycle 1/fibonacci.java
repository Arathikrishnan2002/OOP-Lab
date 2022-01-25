import java.util.*;

class fibonacci

{

public static void main(String args[])
{    
 int n,f=0,s=1,i,temp;   
 
 System.out.println("Enter the number");
 Scanner obj = new Scanner(System.in);
 n = obj.nextInt();
 System.out.println("The fibonacci series is:");
 System.out.println(f+"\n"+s);
    
 for(i=3;i<n;i++)
 {    
  temp = f+s; 
  System.out.println(+temp);
  
  f=s;    
  s=temp;
 }    
  
}
    
}

