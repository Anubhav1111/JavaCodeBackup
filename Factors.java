package lec2;

public class Factors {
	public static void main(String[] args) {
		int N = 9;
		int c = 1;
		int factors = 0;
		while (c <= N) {
            if (N%c == 0) {
            	
            	factors++;
            }
            c++;
		}
		System.out.println(factors);

	}
}
