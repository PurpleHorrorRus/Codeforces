import java.util.Scanner;

public class App {
    public static String solve(String source){  
        if(source.matches("^[a-z]?[A-Z]*$")){
			String ans = source.toLowerCase();
			if(source.charAt(0) >= 'a' && source.charAt(0) <= 'z')
				ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
			source = ans;
		}
        return source;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String source = scn.nextLine(); scn.close();
        System.out.println(solve(source));
    }
}