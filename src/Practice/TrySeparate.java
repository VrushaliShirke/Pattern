package Practice;

import java.util.Arrays;

public class TrySeparate {


	public static void even_odd(int[] arr) {
		int evenC=0, oddC=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenC++;
			}
			else {
				oddC++;
			}
		}
		int even[]= new int[evenC];
		int odd[]=new int[oddC];
		int k=0,j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[k++]=arr[i];
			}
			else {
				odd[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
			}
			
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,1};

		even_odd(arr);

	}

}
