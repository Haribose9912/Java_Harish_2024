package Java_Oops;


public class Interface_usage implements Interface_demo.car{


	@Override
	public void model(String mdl) {
		System.out.println("car model: "+mdl);
		
	}

	@Override
	public void year(int yr) {
		
		System.out.println("car make year: "+yr);
	}

	@Override
	public void owner(String name) {
		System.out.println("car owner: "+name);
		
	}
	public static void main(String[] args) {
		
		Interface_usage iu = new Interface_usage();
		iu.owner("Hariesh");
		iu.model("Audi G100");
		iu.year(2024);
		
	}

}
