package a_Zadania.a_Dzien_1.b_Metody;

public class Main8 {

	public static void main(String[] args) {

	}

	static int maxOfThree(int a, int b, int c) {
		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		return max;
		// return java.util.Arrays.stream(new int[] {a, b, c}).max().getAsInt();
	}
}
