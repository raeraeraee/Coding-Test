import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();

        if (i.equals("A+")){
            System.out.println(4.3);
        } else if (i.equals("A0")) {
            System.out.println(4.0);
        } else if (i.equals("A-")) {
            System.out.println(3.7);
        } else if (i.equals("B+")) {
            System.out.println(3.3);
        } else if (i.equals("B0")) {
            System.out.println(3.0);
        } else if (i.equals("B-")) {
            System.out.println(2.7);
        } else if (i.equals("C+")) {
            System.out.println(2.3);
        } else if (i.equals("C0")) {
            System.out.println(2.0);
        } else if (i.equals("C-")) {
            System.out.println(1.7);
        } else if (i.equals("D+")) {
            System.out.println(1.3);
        } else if (i.equals("D0")) {
            System.out.println(1.0);
        } else if (i.equals("D-")) {
            System.out.println(0.7);
        } else if (i.equals("F")) {
            System.out.println(0.0);
        }
    }
}