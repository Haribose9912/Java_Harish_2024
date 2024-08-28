package Java_Oops;

public class overRideing_child extends overRideing_parent{

	@Override
	public void car(int year) {
		System.out.println("child class method called with Year: "+year);
		super.car(99110112);
	}
	
	
	public static void main(String[] args) {
	
		overRideing_parent ov = new overRideing_child();
		ov.car(2024);
	}
	
}
