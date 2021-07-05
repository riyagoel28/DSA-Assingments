import java.util.Scanner;

public class SortIntegerOneBits {
	static int countBits(int a)
	{
	    int count = 0;
	    while (a > 0)
	    {
	        if ((a & 1) > 0)
	            count+= 1;
	        a = a >> 1;
	    }
	    return count;
	}
static void insertionSort(int a[], int b[], int n)
{
	for (int i = 1; i < n; i++){
		int k1 = b[i];
		int k2 = a[i];
		int j = i - 1;
		while (j >= 0 && b[j] < k1){
			b[j + 1] = b[j];
			a[j + 1] = a[j];
			j = j - 1;
		}
		b[j + 1] = k1;
		a[j + 1] = k2;
	}
}

static void sortBySetBitCount(int a[],int n) {
	int b[] = new int[n];
	for (int i = 0; i < n; i++)
		b[i] = countBits(a[i]);
	insertionSort(a, b, n);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		 sortBySetBitCount(a, n);
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]+" ");
		 }
		 sc.close();
	}

}
