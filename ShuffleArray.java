import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=2*n;
		int[] a=new int[len];
		for(int i=0;i<len;i++) {
			a[i]=sc.nextInt();
		}
		int i=0,j=0,k=n;
		int[] b=new int[len];
		while(i<len) {
			b[i++]=a[j++];
			b[i++]=a[k++];
		}
		for(int c=0;c<len;c++) {
			System.out.print(b[c]+" ");
		}
		sc.close();
	}

}
