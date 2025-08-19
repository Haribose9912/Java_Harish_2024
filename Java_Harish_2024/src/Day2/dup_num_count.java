package Day2;

import java.util.*;

public class dup_num_count {
    public static void main(String[] args) {
     
     int[] nums ={4,5,6,7,4,6,5};
     
     List<Integer> nl = new ArrayList<>();
     

     for(int num:nums){
       nl.add(num);
     }
     System.out.println("converted to list: "+nl);
     
     ArrayList<Integer> ul = new ArrayList<>();
     ArrayList<Integer> dl = new ArrayList<>();
     
     for(int num:nums){
       if(!ul.contains(num)){
         ul.add(num);
       }else{
         dl.add(num);
         int count = 0;
         for(int n:nums){
           if(n==num){
             count++;
           }
         }
         System.out.println("duplicate list: "+num+" count : "+count);
       }
     }System.out.println("unique list: "+ul);
     
  }
}