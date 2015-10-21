import java.util.Scanner;

public class App {
    public static String solve(int a){
        return (a%2 > 0 || a/2 == 1) ? "NO" : "YES";
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a >= 1 && a <= 100){
            System.out.println(solve(a));
        }
    }
    
}