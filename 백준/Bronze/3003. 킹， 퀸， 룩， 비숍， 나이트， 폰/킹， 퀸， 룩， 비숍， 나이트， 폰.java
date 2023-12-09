import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rooks = 2;
        int bishops = 2;
        int knights = 2;
        int pawns = 8;

        king = king - sc.nextInt();
        queen = queen - sc.nextInt();
        rooks = rooks - sc.nextInt();
        bishops = bishops - sc.nextInt();
        knights = knights - sc.nextInt();
        pawns = pawns - sc.nextInt();
        
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rooks + " ");
        System.out.print(bishops + " ");
        System.out.print(knights + " ");
        System.out.print(pawns);

    }
}