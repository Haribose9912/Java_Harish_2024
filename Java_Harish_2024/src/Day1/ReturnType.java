package Day1;
//import java.util.*;

public class ReturnType{
	
	public String cars(String name,int id){
		return "Barnd "+name+" ,"+" Id "+id;
	}
	public static void main(String[] args) {
		ReturnType r = new ReturnType();
		System.out.println("Brand names of the car: \n");
		System.out.println(r.cars("Suzuki",9911));
		System.out.println(r.cars("Honda",6012));
		System.out.println(r.cars("Audi",5021));
	}
	
}