import java.util.*;

public class Main {
    
 public static void fullUnique (String[] args) {


int nums [] = {1,5,4,6,1,45,5};

ArrayList<Integer> uni= new ArrayList<>();
ArrayList<Integer> dup= new ArrayList<>();
ArrayList<Integer> fulluni = new ArrayList<>();

for(int num:nums){
if(!uni.contains(num)){
  uni.add(num);
  fulluni.add(num);
 }
  else{
    if(!dup.contains(num)){
      dup.add(num);
      fulluni.remove(Integer.valueOf(num));
    }
  }

}
System.out.println(uni);
System.out.println(dup);
System.out.println(fulluni);
  }
}
