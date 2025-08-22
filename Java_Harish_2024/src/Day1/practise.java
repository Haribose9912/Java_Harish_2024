package Day1;

import java.util.*;


public class practise{
  
  public static void main (String[] args) {
    
  String n ="hariesharanya";
  ArrayList<Character> nums = new ArrayList<>();
 
  for( int i=0;i<n.length();i++){
    char ch = n.charAt(i);
    nums.add(ch);
  }
  
  ArrayList<Object> dl = new ArrayList<>();
  ArrayList<Object> ul = new ArrayList<>();
  for(Object num:nums){
    if(!ul.contains(num)){
      ul.add(num);
    }else{
      dl.add(num);
    }
  }System.out.println("unique list: "+ul);
System.out.println("dupli list: "+dl);
}
}