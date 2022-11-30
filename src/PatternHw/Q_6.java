package PatternHw;

public class Q_6 {

	public static void main(String[] args) {
		int alphabet=64;
		int n=9;
		for(int i=1;i<=n;i++){
			for(int k=2*(n-i);k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}

	}

}
