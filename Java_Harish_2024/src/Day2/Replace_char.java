package Day2;
import java.util.*;
public class Replace_char {

	  public static void main (String[] args) {
		  
	  //print only even chars  // 
		  
	  String s="harieshkumar";
	  ArrayList<Character>al = new ArrayList<>();
	  for(int i=2;i<s.length();i=i+2){
	    char c=s.charAt(i); 
	    al.add(c);
	  }System.out.println(al);
	  
	  StringBuilder st = new StringBuilder();
	 for(char ch:al){
	   st.append(ch);
	 }
	 String ss = st.toString();
	 System.out.println("even chars: "+ss);
	 
	 
	 //Replacing only even characters with 'H' //
	 String m = "tigerontheroad";
	 StringBuilder sb= new StringBuilder(m);
	 for(int i=2;i<sb.length();i=i+2) {
		 sb.setCharAt(i, 'H');
		 
	 }System.out.println("after replacing even chars with '*' : "+sb);
	 
	 
	 //Replacing character in a string;
	 String sl = "harieshkumarh";
	 StringBuilder sl1 = new StringBuilder(sl);
	 for (int i = 0; i < sl1.length(); i++) {
         if (sl1.charAt(i) == 'h') {
        	 sl1.setCharAt(i, 'L');
         }
     }System.out.println(sl1);
  }
}
