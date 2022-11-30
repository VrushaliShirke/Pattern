package Practice;

import java.util.Arrays;

public class TryDup {

	public static void duplicate(int a[],int n) {
		int count=0;
		boolean isPresent=false;
		for(int i=0;i<a.length;i++) {
			
				if(a[i]==n) {
					isPresent=true; 
//					count++;
					break;
				}
			
			
		}
		int d[]= new int[count];
		int j=0;
		if(isPresent==true) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				d[i]=a[i];
				j++;
			}
		}
		}
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		//Write a  program to remove duplicate elements from an array?
		
				int a[]= {4, 3, 2, 4, 9, 2};
				duplicate(a, a.length);
	}

}
