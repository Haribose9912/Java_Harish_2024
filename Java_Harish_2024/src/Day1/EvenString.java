package Day1;
import java.util.*;

public class EvenString {
	public static void main(String[] args) {
String s ="hariesh";

ArrayList<Character> sl = new ArrayList<>();
for(int i=2;i<s.length();i++){
  char ch = s.charAt(i);
  if(i%2==0){
    sl.add(ch);
  }
}System.out.println(sl);
  
	  }
}
//we can also use stringbuilder to append to show in string format instead of list
