import java.util.Scanner;

public class PeakIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int i=0;
		while(a[i]<a[i+1]) {
			i++;
		}
		System.out.println(i);
		sc.close();
	}

}
