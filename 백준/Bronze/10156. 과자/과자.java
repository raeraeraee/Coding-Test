import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = K * N - M;
        
        if (sum > 0) {
            System.out.println(sum);
        } else 
            System.out.println(0);    
    }
}