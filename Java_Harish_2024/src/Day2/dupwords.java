package Day2;

import java.util.*;

public class dupwords{
  
  public void dwords(String s){
    ArrayList<String> uw = new ArrayList<>();
    ArrayList<String>dw= new ArrayList<>();
    
    int count=0;
    String[] st= s.split(" ");
    
    for(String word:st){
      if(uw.contains(word)){
        if(!dw.contains(word)){
          dw.add(word);
          count++;
        }
      }else{
       
        uw.add(word);
      }
    }
    System.out.println("duplicate words: "+dw);
    System.out.println("Unique words: "+uw);
    System.out.println("Count of duplicate words: "+count); 
  }
  
  public static void main (String[] args) {
    dupwords dp= new dupwords();
    String ws = "hello am hello hariesh hello am";
    dp.dwords(ws);
    
  }
  
}
