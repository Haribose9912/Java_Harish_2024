package Day1;
import java.util.*;

public class EvenString {
	public static void main(String[] args) {
	      ArrayList<Character> al = new ArrayList<>();
	      String s ="automation";
	      for(int i=2;i<s.length();i=i+2){
	        char ch = s.charAt(i);
	        al.add(ch);
	        System.out.println("index: "+i+" char: "+ch);
	      }System.out.println(al);
	      StringBuilder sb = new StringBuilder();
	      for(char ch:al) {
	    	  sb.append(ch);
	      }
	      String ss =sb.toString();
	      System.out.println(ss);
	  }
}
