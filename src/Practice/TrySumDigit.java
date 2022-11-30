package Practice;
import java.util.*;
public class TrySumDigit {
	
	public static void sumDigit(int n) {
		int firstDigit=0,lastDigit=0,sum=0;
		lastDigit=n%10;
		
		while(n>0) {
			firstDigit=n%10;
			n=n/10;
		}
		sum= firstDigit+lastDigit;
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		sumDigit(num);

	}

}
