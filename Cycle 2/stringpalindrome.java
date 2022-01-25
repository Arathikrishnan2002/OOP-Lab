import java.util.*;

class stringpalindrome
{
    public static void main(String args [])
     {  
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String Str = sc.nextLine();
        int flag=0;
        int len = Str.length();
        for(i=0;i<len/2;i++)
        {
            if(Str.charAt(i)!= Str.charAt(len-i-1))
            {
                flag=1;
                break;
            }          
        }
        if(flag==0)
        {
           System.out.println("The given string is pallindrome");
        }
        else
        {
           System.out.println("The given string is not pallindrome");
        }
     }
}
