import java.util.Scanner;

public class App {
    public static long solve(long n, long m, long a){
        double n1 = Math.ceil((double)n/a);
        double n2 = Math.ceil((double)m/a);
        return (long) ((long) n2*n1);
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt(); int n = scn.nextInt(); int a = scn.nextInt();
        System.out.println(solve(n,m,a));
    }
}