import java.util.Scanner;

public class App {
	static Scanner scan; static String scanstring; static int x = 0;
	public static int solve(String scanline, int a){	
		if(scanstring.contains("X++") || scanstring.contains("++X")){
			x++;
		}
		else if(scanstring.contains("X--") || scanstring.contains("--X")){
			x--;
		}
		return x;
	}
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		int a = scan.nextInt(); int b = 0;
		for(int i = 0; i < a+1; i++){
			scanstring = scan.nextLine();
			b = solve(scanstring, a);
		}
		scan.close();
		System.out.println(b);
	}
}
