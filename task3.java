package codsoft;
import java.util.*;
class atm {
    public int totalamt=100000;
    public void withdrawamount(int wamt) {
    	if(wamt<totalamt )
    	    totalamt=totalamt-wamt;
    	else
    		System.out.println("you don't have sufficient balance to withdraw money");
    }
    public void depositamount(int damt) {
    	totalamt=totalamt+damt;
    }
    public void displayamount() {
    	System.out.println("Current balance:"+totalamt);
    }
}
class task3 extends atm{
  
	public static void main(String[] args) {
		task3 obj=new task3();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to withdraw amount from your account");
			System.out.println("Press 2 to deposit amount in your account");
			System.out.println("Press 3 to check balance of your account");
			System.out.println("Press 0 to exit");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the amount you want to withdraw:");
					int wamt=sc.nextInt();
					obj.withdrawamount(wamt);
					break;
				case 2:
					System.out.println("Enter the amount you want to deposit:");
					int damt=sc.nextInt();
					obj.depositamount(damt);
					break;
				case 3:
					obj.displayamount();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("please enter valid chooice");
				}
		}
	}
}
