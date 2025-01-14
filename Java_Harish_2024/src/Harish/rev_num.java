package Harish;

import java.util.*;

public class rev_num{
    public static void main (String[] args) {
       int n=9912;
       int rev=0;
       
       while(n>0){
         int c =n%10;
         rev=rev*10+c;
         
       // System.out.println(rev+"*"+"10"+"+"+c+" = "+rev);
         n/=10;
       }
       System.out.println(rev);
    }
}
