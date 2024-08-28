package Day2;
import java.util.*;

public class DuplicateChars {
	
	public void dupchar(String s) {
		System.out.println("Given string: "+s);
	ArrayList<Character> d = new ArrayList<>();
	
	for(char i:s.toCharArray()) {
		if(!d.contains(i)) {
			d.add(i);
			
		}else {
			System.out.println("Dupchar: "+i);
		}
	}System.out.println("String after removing duplicates: "+d);
	
	}

	public static void main(String[] args) {
		DuplicateChars dp = new DuplicateChars();
		dp.dupchar("dad");
		dp.dupchar("mavanam");
	}
	
	
}