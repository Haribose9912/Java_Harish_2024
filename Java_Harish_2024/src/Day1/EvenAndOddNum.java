package Day1;
import java.util.*;


public class EvenAndOddNum {
public static void main(String[] args) {
	int numbers[]= {6,1,5,3,2,8,9,1,20};
	ArrayList<Integer> even = new ArrayList<Integer>();
	ArrayList<Integer>odd= new ArrayList<Integer>();
	
	for(int i: numbers) {
		if(i%2==0) {
			even.add(i);
		}else {
			odd.add(i);
		}
	}System.out.println(even);
	System.out.println(odd);
}
}
