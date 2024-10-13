package Problems;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int n1=0, n2=1, nextTerm;
		for(int i=0;i<n;i++) {
			System.out.println(n1);
			nextTerm=n1+n2;
			n1=n2;
			n2=nextTerm;
		}
		
	}
	
}
