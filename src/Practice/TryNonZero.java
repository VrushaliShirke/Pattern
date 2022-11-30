package Practice;

import java.util.Arrays;

public class TryNonZero {

	public static void duplicateNum(int a[]) {
		int i=0,j=0;
	for( i=0;i<a.length;i++) {
		boolean isPresent=false;
		for(int k=i-1;k>=0;k--) {
			if(a[i]==a[k]) {
				isPresent=true;
				
				continue;
			}
//			if(isPresent==false) {
//			for( j=0;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					
//					continue;
//				}
//				
//			}
//			
////			System.out.print(a[i]);
//			}
//			System.out.print(a[i]);
//		}
		System.out.print(a[i]);
		}
	}
	}
	public static void main(String[] args) {
		int a[]= {4, 3, 2, 4, 9, 2};
		duplicateNum(a);
		
	}

}
