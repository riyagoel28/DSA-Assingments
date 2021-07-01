import java.util.*;
public class RemoveElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=k) {
				a[j++]=a[i];
			}
		}
		n=j;
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
