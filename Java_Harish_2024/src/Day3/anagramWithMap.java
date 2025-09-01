import java.util.*;

public class anagramWithMap {

  public static void main(String args[]) {
    String words[]  ={"haris","name","anme","hari"};
    
Map<String,String> maps = new HashMap<>();

for(String word:words){
  String Cleaned =word.replaceAll("\\s","");
  
  char chars[]  = word.toCharArray();
  
  Arrays.sort(chars);
  
  String sorted = new String(chars);
  
  
  if(maps.containsKey(sorted)){
    System.out.println("found anagrams: "+word +" match with  "+maps.get(sorted));
  }else{
    maps.put(sorted,word);
  }
  
  
}
  }
}
