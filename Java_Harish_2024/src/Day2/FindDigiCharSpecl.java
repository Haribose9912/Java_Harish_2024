package Day2;

import java.util.*;

public class FindDigiCharSpecl {

	public void test(String s) {
		ArrayList<Character> alpha= new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Object>spec = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				alpha.add(ch);
			}else if(Character.isDigit(ch)) {
//				num.add(Integer.parseInt(String.valueOf(ch)));
				num.add(Character.getNumericValue(ch));
			}else {
				spec.add(ch);
			}
		}System.out.println("digits: "+num);
		System.out.println("alphabets: "+alpha);
		System.out.println("Special chars: "+spec);
	}
	public static void main(String[] args) {
		FindDigiCharSpecl fds= new FindDigiCharSpecl();
		fds.test("w5!e$r12t3y9yu(");
	}
	
}
