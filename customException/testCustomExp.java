import java.util.*;

public class testCustomExp {
  
public static int vote(int age)throws custexp{
  if(age<18){
    throw new custexp("your age is not valid for vote");
  }
  else if(age>18){
    System.out.println("Successfully your vote has been registered");
  }
  return age;
}



public static void main (String[] args) {
  try{
   vote(16);
  }catch(custexp e){
      System.out.println("caught exception: "+e.getMessage());    
      e.printStackTrace();
  }
  

  }
}
