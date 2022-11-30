package Practice.Arrays;

public class EnhancePrime {
	
	public void enhancePrime(int[] a) {
		
		for(int prime : a) {
			boolean isPrime=true;
			for(int j=2;j<prime;j++) {
				if(prime%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
			System.out.print(prime+" ");
			}
		}
		
//		for(int i=0;i<a.length;i++) {
//			int n=a[i];
//			boolean isPrime=true;
//			for(int j=2;j<n;j++) {
//				if(n%j==0) {
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime==true) {
//				System.out.print(n+" ");
//			}
//			
//		}
	}

	public static void main(String[] args) {
		
		int a[]= {3,54,66,7,13,99,57,85};
		new EnhancePrime().enhancePrime(a);
	}

}
