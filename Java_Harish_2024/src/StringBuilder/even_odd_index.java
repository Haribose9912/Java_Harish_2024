package StringBuilder;

import java.util.*;

public class even_odd_index {
    public static void main(String[] args) {
     //print revresed even chars and original odd chars//  
     String s= "hariesp";
     
     StringBuilder sb = new StringBuilder();
     StringBuilder sb2 = new StringBuilder();
     StringBuilder sb3 = new StringBuilder();
     String revs =""; 
     int i=0;
     while(i<s.length()){
       char ch = s.charAt(i);
        if(i%2==0){
          sb3.append(ch);
          System.out.println("index: "+i+" char "+ch);
          revs = ch+revs;
        }else{
          sb2.append(ch);
        }
       i++;
     }
      sb.append(revs);
     System.out.println("Reversed even chars: "+sb);
     System.out.println("Original even chars: "+sb3);
     System.out.println("Original odd chars: "+sb2);
  }
}          