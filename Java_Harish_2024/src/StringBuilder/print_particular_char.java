package StringBuilder;

public class print_particular_char {
	public static void main(String[] args) {
	     
	     String s="jhgfhhhjj";
	     
	     
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<s.length();i++){
	        char sc = s.charAt(i);
	       if(sc=='j'){
	         sb.append(sc);
	       }
	     }
	     System.out.println(sb);
	     
	     
	  }
}
