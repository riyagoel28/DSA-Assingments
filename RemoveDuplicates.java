import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int j=0;
		if(n==0 || n==1) {
			System.out.println(n);
		}
		else {
			for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					a[j++]=a[i];
				}
			}
			a[j++]=a[n-1];
			n=j;
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
		}
		sc.close();
	}
}
