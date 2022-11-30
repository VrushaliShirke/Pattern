package Practice;

public class Trymerge {
	
	 public static void mergeArray(int a1[],int a2[] ){
	        int i=0,j=0,k=0,m=0;
	        int b[]= new int[a1.length+a2.length];
	        for(i=0;i<a1.length && i<a2.length;i++) {
	        	b[m++]=a1[j++];
	        	b[m++]=a2[k++];
	        }
	        if(a1.length>a2.length) {
	        	for(int n=i;n<a1.length;n++) {
	        		b[m++]=a1[j++];
	        	}
	        }
	        else if(a2.length>a1.length) {
	        	for(int n=i;n<a2.length;n++) {
	        		b[m++]=a1[j++];
	        	}
	        }
	        for( i=0;i<a1.length+a2.length;i++) {
	        	System.out.print(b[i]+" ");
	        }
	    }

	public static void main(String[] args) {
		int a1[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int a2[] = {11, 22, 33, 44};

		mergeArray(a1,a2);
		
	}

}
