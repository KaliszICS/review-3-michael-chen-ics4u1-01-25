import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String word = s.nextLine();
		System.out.println(word.charAt(0));
		s.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean word = s.nextBoolean();
		System.out.println(!word);
		s.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int word = s.nextInt();
		System.out.println(word > 5);
		s.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int word = s.nextInt();
		System.out.println(word <= 2 && word >= -2);
		s.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String word = s.nextLine();
		System.out.println(word.equals("Hello World"));
		s.close();
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int word = s.nextInt();
		System.out.print("In: ");
		int word2 = s.nextInt();
		System.out.println(word <= word2);
		s.close();
	}

	public static void q7() {
		//Write question 7 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double word = s.nextDouble();
		System.out.print("In: ");
		double word2 = s.nextDouble();
		System.out.println(word > word2);
		s.close();
	}

}
