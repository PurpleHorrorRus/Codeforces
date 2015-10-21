import java.util.Scanner;

public class App {
	public static String solve(String slovo){
		if(slovo.length() > 10){
			String[] s = new String[slovo.length()];
			s[0] = Character.toString(slovo.charAt(0));
			s[1] = Character.toString(slovo.charAt(slovo.length()-1));
			StringBuilder[] sb = new StringBuilder[4];
			sb[0]= new StringBuilder(slovo);
			sb[1] = sb[0].deleteCharAt(0);
			
			s[3] = sb[1].toString();
			sb[2] = new StringBuilder(s[3]);
			sb[3] = sb[2].deleteCharAt(s[3].length()-1);
			
			int len = sb[3].length();
			String lenstr = String.valueOf(len);
			
			slovo = s[0]+lenstr+s[1];
			System.out.println(slovo);
		} else { System.out.println(slovo); }
		return slovo;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int scnint = scn.nextInt();
		String[] slovo = new String[scnint+1];
		for(int i = 0; i < scnint+1; i++){
			slovo[i] = scn.nextLine();
			if(i == scnint){
				for(int b = 0; b < i; b++){
					solve(slovo[b+1]);
				}
			}
		}
	}
}
