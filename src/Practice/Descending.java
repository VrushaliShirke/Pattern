package Practice;
import java.util.*;
public class Descending {public static void descending(int n){

	boolean descending=true;
	
	while(n>0){
		int firstDigit=n%10;
		n=n/10;
		int secondDigit=n%10;
		if(secondDigit<firstDigit){
			descending=false;
			break;
		}
	
	}
	if(descending==true){
		System.out.println("Descending ordered digits");
	}
	else{
		System.out.println("Not descending ordered digits");
	}
}

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();

		descending(num);
	}


	

}
