import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int M = sc.nextInt();

        if (K % M == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}