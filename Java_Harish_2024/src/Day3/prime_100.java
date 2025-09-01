import java.util.*;
public class prime_100{
  public static void main (String[] args) {
  
  // int n=7;
  ArrayList<Integer> prime = new ArrayList<>();
  ArrayList<Integer> NonPrime= new ArrayList<>();

  for(int n=0;n<=100;n++){
    
  if(n<2){
    NonPrime.add(n);
    continue;
  }
  
  int count =0;
  for(int i=2;i*i<=n;i++){
    if(n%i==0){
      count++;
      break;
    }
  }
  
  if(count==0){
    prime.add(n);
  }else{
    NonPrime.add(n);
  }
    
  }
  System.out.println("is a prime number: "+prime);
  System.out.println("not an prime number: "+NonPrime);
  
  }
  
}
