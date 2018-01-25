import java.util.*;
public class RandomApp {

	public static void main(String[] args) {
		int sumA = 1000;
		int sumB = 0;
		Random random1 = new Random();
		Random random2 = new Random();
		int counter = 0;
		
		
		while(sumA>sumB) {
			counter++;
			sumA += random1.nextInt(10);
			sumB += random2.nextInt(50);
			System.out.println("Loop repetition: " + counter);
			System.out.println("sumA = " + sumA + ", sumB = " + sumB);
		}
		System.out.println("This is the end of the loop because sumA(" + sumA + ") < " + " sumB(" + sumB + ")");
	}

}
