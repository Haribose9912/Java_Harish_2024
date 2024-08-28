package Day2;

public class Palindrome {

	public void pal(String s) {
		int count =0;
		String revs= "";
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			count++;
			revs =c+revs;	
		}
		System.out.println("reversed string: \n"+revs);
		System.out.println("count of given string: \n"+count);
		if(revs.equals(s)) {	
			System.out.println("Its a palindrome.");
		}else {
			System.out.println("Not a palindrome.");
		}
		
	}
	
	public static void main(String[] args) {
		String s4="mavam";
		String s1 = "hello";
		String s3 ="dad";
		
		Palindrome p= new Palindrome();
		p.pal(s1);
		p.pal(s4);
		p.pal(s3);
	}
	
}
