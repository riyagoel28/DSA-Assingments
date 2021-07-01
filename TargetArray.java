import java.util.*;
public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int[] index=new int[n];
		for(int i=0;i<n;i++) {
			index[i]=sc.nextInt();
		}
		int[] target=new int[n];
		for(int i=0;i<n;i++) {
			int ind=index[i];
			int val=nums[i];
			if(target[ind]==0) {
				target[ind]=val;
			}else {
				for(int j=n-1;j>=ind;j--) {
					target[j]=target[j-1];
				}
				target[ind]=val;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(target[i]+" ");
		}
		sc.close();
	}

}
