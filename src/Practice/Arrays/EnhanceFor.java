package Practice.Arrays;

public class EnhanceFor {
	
	public void enhanceFor(int a[]) {
		
		for(int odd: a) {
			if(odd%2==1) {
				System.out.print(odd+" ");
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {34,76,65,99,44,23,8,94,1};

		new EnhanceFor().enhanceFor(a);
	}

}
