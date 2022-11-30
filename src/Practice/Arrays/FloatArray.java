package Practice.Arrays;
import java.util.*;
public class FloatArray {
	
	public void FloatArray(float a[]) {
		float avg=0,count=0,sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			count++;
		}
		avg=sum/count;
		System.out.print(avg);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		float a[]=new float[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextFloat();
		}

		new FloatArray().FloatArray(a);
	}

}
