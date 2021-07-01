import java.util.*;

public class ConsistentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String allowed=new String();
		allowed=sc.next();
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			String temp=a[i];
			int len=allowed.length();
			int j=0;
			while(j<len) {
				char ch=allowed.charAt(j);
				if(temp.contains(ch)) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
