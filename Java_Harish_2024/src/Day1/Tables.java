package Day1;

public class Tables {


	public static int i;
	
	public void Test(int n) {
		for(i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}
	}
	public static void main(String[] args) {
		Tables t = new Tables();
		t.Test(9);
		System.out.println("\n");
		t.Test(6);
	}
	
}
