import java.util.*;

public class fullyUnique {
    public static void main(String[] args) {
int nums []={5,6,2,6,7,2,9,9};
System.out.println(Arrays.toString(nums));
ArrayList<Integer> uni = new ArrayList<>();
ArrayList<Integer> fulluni = new ArrayList<>();
    int count =0;
for(int num:nums){
  if(!uni.contains(num)){
     count++;
     uni.add(num);
     fulluni.add(num); // Add to fulluni initially
  } else {
     fulluni.remove(Integer.valueOf(num)); // Remove if duplicate
  }
   
}
 System.out.println(uni);
 System.out.println(fulluni);

    }
}
