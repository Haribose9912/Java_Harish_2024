package Java_Oops;


public class overloading {
  
  public Object brand(String action,int id,int id2){
    return action+" "+id+" * "+id2+" = "+id*id2;
  }
  public void brand(int id,int year){
    System.out.println("Id: "+id);
    System.out.println("Year: "+year);
  }
  public void brand(int year,String cust_name){
    System.out.println("Year: "+year);
    System.out.println("Customer Name: "+cust_name);
  }
  
    public static void main(String[] args) {
      
      overloading od = new overloading();
      od.brand(9911,1997);
      System.out.println(od.brand("Multiplication",7,9));
      // od.brand()
      
      
  }
}