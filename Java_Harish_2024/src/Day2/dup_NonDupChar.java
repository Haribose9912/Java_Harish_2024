package Day2;
import java.util.*;

public class dup_NonDupChar {

	public void dup_remover(String s){
	    int dup_count =0;
	    ArrayList<Character> uc = new ArrayList<>();
	    ArrayList<Character>dc = new ArrayList<>();
	    
	    char []chars = s.toCharArray();
	    for(char i:chars){
	      if(uc.contains(i)){
	  
	      if(!dc.contains(i)){
	        dc.add(i);
	        dup_count++;
	      }
	      }
	      else{
	        uc.add(i);
	        
	      }
	        
	    }System.out.println("unique characters: "+uc);
	    System.out.println("duplicate characters: "+dc);
	    System.out.println("duplicate characters count: "+dup_count);
	  }

	    public static void main(String[] args) {
	    	dup_NonDupChar dp= new dup_NonDupChar();
	    	dp.dup_remover("tigaghjaaerr");
	    	
	     
	  }
	}