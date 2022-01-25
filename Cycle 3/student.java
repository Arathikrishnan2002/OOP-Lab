import java.util.*;

class student
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String s = obj.nextLine();
        System.out.print("Enter the class of the student: ");
        int c = obj.nextInt();
        System.out.print("Enter the roll number of the student: ");
        int r = obj.nextInt();
        System.out.print("Enter the mark of 1st subject: ");
        int m1 = obj.nextInt();
        System.out.print("Enter the mark of 2nd subject: ");
        int m2 = obj.nextInt();
        System.out.print("Enter the mark of 3rd subject: ");
        int m3 = obj.nextInt();
        System.out.print("Enter the mark of 4th subject: ");
        int m4 = obj.nextInt();
        System.out.print("Enter the mark of 5th subject: ");
        int m5 = obj.nextInt();
        
        int t = m1+m2+m3+m4+m5;
        double p = t / 500.00 * 100.00;
        String g;
        if(p>=90)
            g = "A+";
        else if(p>=80)
            g = "A";
        else if(p>=70)
            g = "B+";
        else if(p>=60)
            g = "B";
        else if(p>=50)
            g = "C";
        else if(p>=40)
            g = "D";
        else
            g = "E";
            
        System.out.println("Total Mark is "+t);    
        System.out.println("Total Percentage is "+p);    
        System.out.println("Grade is "+g);
    }
}
