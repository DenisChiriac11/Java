package ro.digitalnation.conditionsloops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Logic.ex1(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("Cel mai mare numar este: " + Logic.ex2(in.nextInt(), in.nextInt(), in.nextInt()));
		Logic.ex3(in.nextInt(), in.nextInt());
		Logic.ex4(in.nextInt());
		Logic.ex5(in.next());
		Logic.ex6(in.nextInt());
		Logic.ex7(in.nextInt());
		Logic.ex8(in.nextInt());
		Logic.ex9(in.next(),in.nextInt());
		Logic.ex10(in.next());
	}

	
}
