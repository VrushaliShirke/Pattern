package PatternHw;

public class Q_3 {

	public static void main(String[] args) {
		// pattern:
		
		for(int i=1;i<=6;i++) {
			for(int k=6;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
