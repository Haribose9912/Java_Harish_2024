package Java_Oops;

public class test {
	private String name;
	private int id;

	public test(String name, int id) {
		this.name= name;
		this.id=id;
	}
	public void run(String car_model ) {
		System.out.println("model of the car: "+car_model);
		System.err.println("Customer name:\n"+name+"\nSince:\n"+id);
	}
	
	
	public static void main(String[] args) {
		
		test t = new test("Apple motors",9911);
		test t2= new test("Doreman",1995);
//		test t3= new test("",0011);
		t.run("Bugati");
		t2.run("Audi");
		
		
	}
	
}
