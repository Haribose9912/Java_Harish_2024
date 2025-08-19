package Day1;

public class TestCustomEx {

	

	public void age(int age) throws CustomException {
		if(age<18) {
			throw new CustomException("Age less than 18 is not valid");
		}else{
			System.out.println("valid age: "+age);
		}
	}
	
	public static void main(String[] args) {
		TestCustomEx te = new TestCustomEx();
		try {
		te.age(15);
		te.age(19);
		}catch(CustomException e){
			System.out.println("caught exception: "+ e.getMessage());
		}
	}
	
	
}
