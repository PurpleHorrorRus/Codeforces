import java.util.Scanner;

public class App {
	public static int solve(double m, double n){
		return (int) ((double)Math.ceil(m*n)/2);
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double m = scn.nextDouble();
		double n = scn.nextDouble();
		System.out.println(solve(m, n));
	}
}
