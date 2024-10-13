package Problems;

public class Pattern_Printing {

	public static void main(String [] args) {
		
		int n=5;
		for(int i=0,p=1;i<=n;i++,p++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(p+"");
			}
			System.out.println("");
		}
		
		int n1=5;
		for(int i=0;i<=n1;i++) {
			for(int j=0;j<i+1;j++) {
				if(i%2==0) {
					System.out.print("a");
				}else {
					System.out.print("b");
				}
			}
			System.out.println("");
		}
		
	}
	
}
