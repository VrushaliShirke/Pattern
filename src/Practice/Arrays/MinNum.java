package Practice.Arrays;
import java.util.*;
public class MinNum {
	
	public void minNum(int[] arr) {
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(min);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int a[]= new int[num];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		MinNum mn= new MinNum();
		mn.minNum(a);
		
	}

}
