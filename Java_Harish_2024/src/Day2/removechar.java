package Day2;


public class removechar {
    public static void main(String[] args) {
     
     String s ="hariesh am here";
      StringBuilder sb= new StringBuilder();
    
     
     for(int i=0;i<s.length();i++){
       char chars =s.charAt(i);
       if(chars!='e'){
         sb.append(chars);
       }
     }System.out.println(sb);
     
  }
}