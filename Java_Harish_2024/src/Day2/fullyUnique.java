import java.util.*;

public class fullyUnique {
    public static void main(String[] args) {
int nums []={5,6,2,6,7,2,9,9};
System.out.println(Arrays.toString(nums));
ArrayList<Integer> uni = new ArrayList<>();
ArrayList<Integer> fulluni = new ArrayList<>();
ArrayList<Integer> dups = new ArrayList<>();
    int count =0;
for(int num:nums){
  if(!uni.contains(num)){
     count++;
     uni.add(num);
     if(count < 2){
         fulluni.add(num);
     }
  } else {
     dups.add(num);
  }
}
for(int num:uni){
  if(!dups.contains(num) && !fulluni.contains(num)){
     fulluni.add(num);
  }
}
 System.out.println(uni);
 System.out.println(fulluni);

    }
}
