import java.util.*;
public class prime_100{
  
  public static void main (String args[]){
  
// int nums [] ={44,22,1,46,21,90};

//int n=3;

for(int n=0;n<=100;n++){
if(n<2){
  System.out.println("not a prime number");
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
System.out.println("its a prime number: "+n);
}else{
  System.out.println("not a prime: "+n);
}


}
  }
  
}
