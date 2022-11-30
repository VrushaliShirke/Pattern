package Practice;

import java.util.Arrays;

public class TreySqr {

	public static void sqr(int arr[]) {
		int count=0,sqr=0;
//		int sqr_arr[]=new int[count];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<=arr[i];j++) {
				 sqr=j*j;
				if(arr[i]==sqr) {
					count++;
					break;
				}	
			}
		}
	
		int sqr_arr[]=new int[count];
		
		int c=0,n=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<=arr[i];j++) {
				 sqr=j*j;
				
				if(arr[i]==sqr) {
					sqr_arr[c]=arr[i];
					c++;
				}
			}
		}
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Count: "+count);
		System.out.println("Square array:"+Arrays.toString(sqr_arr));
	}
	public static void main(String[] args) {
		int arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		sqr(arr);

	}

}
