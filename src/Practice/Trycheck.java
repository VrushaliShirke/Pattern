package Practice;
import java.util.*;
public class Trycheck {

	public static void check(int a[],int n){
		boolean isPresent=false;
		for(int i=0;i<a.length;i++){
			
			if(a[i]==n){
				isPresent=true;
				break;
			}
		}
		if(isPresent==true){
			System.out.println("number is present in array");
		}
		else{
			System.out.println("number is not present in array");
		}
	}

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int num=sc.nextInt();
	
	System.out.println("Enter the elements");
	int a[]=new int[num];
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}

	System.out.println("Enter the element to check");
	int n=sc.nextInt();

	check(a,n);

	}

}
