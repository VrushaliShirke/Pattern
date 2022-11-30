package PatternHw;
import java.util.*;
public class Anagram {
	
	public static void anagram(String s1,String s2) {
		char str1[]= s1.toLowerCase().toCharArray();
		char str2[]= s2.toLowerCase().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(Arrays.equals(str1, str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
//		boolean isAna=true;
//		for(int i=0;i<str1.length;i++) {
//			isAna=true;
//			for(int j=0;j<str2.length;j++) {
//				if(str1[i]!=str2[j]) {
//					isAna=false;
//					break;
//				}
//			}
//			
//		}
//		if(isAna==true) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not");
//		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1= sc.next();
		String st2= sc.next();
		
		Anagram.anagram(st1, st2);
	}

}
