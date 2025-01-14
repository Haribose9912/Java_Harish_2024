package Harish;

import java.util.*;
public class char_chek{
    public static void main (String[] args) {
       System.out.println("enter char: ");
       Scanner sc = new Scanner(System.in);
       
       char ch = sc.next().trim().charAt(0);
       if(ch>='a'&&ch<='z'){
           System.out.println("Small letter");
       }
       else{
           System.out.println("Caplital letter");
       }
    }
}
