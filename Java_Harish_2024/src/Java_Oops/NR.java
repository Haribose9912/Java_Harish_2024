package Java_Oops;

public class NR {

	
	public Object Details(String name,int id,String location) {
		return "Customer name:\n"+name+"\nId:\n"+id+"\nLocation:\n"+location;
	}
	
	
	public static void main(String[] args) {
		
		NR r = new NR();
		Object cust1= r.Details("Harish",9911,"Hyderabad");
		Object cust2 = r.Details("Sharanya", 9912, "Lemoor");
		System.out.println(cust1);
		System.err.println(" ");
		System.out.println(cust2);
		
	}
	
}
