package codsoft;
import java.util.*;
public class task1 {
	
	public static void main(String[] args) {
		 Random r=new Random();
	     Scanner sc=new Scanner(System.in);
        int maxround=10,flag=0,chance=0;
        int rnum =(int)(Math.random()*100);
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        System.out.println("A random number is generated and you need to guess it");
        System.out.println("You may have 10 chances in order to guess the correct number");
            while(chance < maxround)
            {
               chance++;
        	   System.out.println("This is your attempt number " + chance );
        	   System.out.println("Enter a number between 1 to 100:");
        	   int num=sc.nextInt();
        	   if(num==rnum) { 
        		   System.out.println("CONGRATULATIONS!! You have guessed the right number");
        		   flag=1;
        		   break;
        	   }
        	   else if(num>rnum)
        		   System.out.println("Select a number smaller please");
        	   else 
        		   System.out.println("Select a number higher please");
        	   
        	}
            if (flag==0) {
            	System.out.println("You losed !!");
            	System.out.println("The random number generated is " + rnum);
            	System.out.println("THE GAME IS OVER!!");
            }
	}
}
