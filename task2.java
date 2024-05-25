package codsoft;
import java.util.*;
import java.math.*;
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=0;
		double avg;
		System.out.println("enter the number of subjects :");
		int sub=sc.nextInt();
        int[] marks=new int[sub];
        System.out.println("Enter the marks of your subjects out of 100:");
        for(int i=0;i<sub;i++)
        {
        	marks[i]=sc.nextInt();
        }
        for(int i:marks) {
        	total=total+i;
        }
        avg=(double) total/sub;
        System.out.println("Total marks are: "+ total);
        System.out.println("Average percentage is : "+avg+"%");
        if(avg>=90)
        	System.out.println("You got A grade");
        else if(avg>=70 && avg<90)
        	System.out.println("You got B grade");
        else if(avg>=50 && avg<70)
        	System.out.println("You got C grade");
        else if(avg>=30 && avg<50)
        	System.out.println("You got D grade");
        else
        	System.out.println("You got E grade");
	}

}
