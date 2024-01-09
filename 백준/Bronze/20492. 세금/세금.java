import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans1 = (int) (N * 0.78);
        int ans2 = (int) (N * 0.8 + N * 0.2 * 0.78);
        
        System.out.println(ans1 + " " + ans2);
    }
}