package StringBuilder;


public class PrintLast4Chars {
	public static void main(String[] args) {
	      String s ="java1234";
	      StringBuilder sb = new StringBuilder();
	      
	      for(int i=s.length()-4;i<s.length();i++){
	        char sc =s.charAt(i);
	        sb.append(sc);
	      
	     } System.out.println(sb);
	      
	      
	 }
}

