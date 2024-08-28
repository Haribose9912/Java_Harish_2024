package Day2;

public class CountWords {

	public void test(String w){
//You can also count character by giving ch=='c' and change int count=1 instead of 0; Beacuse word count will miss 1st word.//
//		as 1st word before no space so it will not count that word.// and count ++ added to times in word count and count++
//		one time for character count
		int count =0;
		for(int i=0;i<w.length();i++) {
			char ch = w.charAt(i);
			
			if(ch==' ') {
			count++;
			}
		}count++;
		System.out.println("count of words: "+w+" = "+count);
		
	}
	
	public static void main(String[] args) {
		String w1 ="Hello am harish thanks to the program";
		String w2 = "Am on my way to office";
		CountWords cw = new CountWords();
		cw.test(w1);
		cw.test(w2);
	}
}
