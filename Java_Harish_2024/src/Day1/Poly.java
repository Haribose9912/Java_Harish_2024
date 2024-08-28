package Day1;

public class Poly {
	//constructor
	public Poly() {
	System.out.println("Hello Welcome");
	}
	
	public String name(String n,int a,int b) {
		
		return "Am "+n+" "+a*b;
	}
	
	public static void main(String[] args) {
		String pp;
		Poly p = new Poly();
		pp=p.name("Harish",7,9);
		System.out.println(pp);
	}
}
