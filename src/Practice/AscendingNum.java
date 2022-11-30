package Practice;
import java.util.*;
public class AscendingNum {

	public static void ascendingNum(int n) {
		boolean increase=true;
		while(n>0) {
			int firstDigit=n%10;
			n=n/10;
			int nextDigit=n%10;
			if(firstDigit<nextDigit) {
				increase= false;
				break;
			}		
		}
		if(increase==true) {
			System.out.println("Ascending num");
		}
		else {
			System.out.println(" Not ascending num");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numebr:");
		int num=sc.nextInt();
		
		ascendingNum(num);
	}

}
