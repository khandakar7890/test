import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v, n;
        double k;

        System.out.print("enter v : ");
        v = sc.nextInt();

        System.out.print("enter n: ");
        n = sc.nextInt();

        k = (v * 12.0) / n;

        System.out.println("Average books read per year by one visitor = " + k);

        sc.close();
    }
}