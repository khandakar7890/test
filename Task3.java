import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;
        int len, width, s, p;

        System.out.print("enter x1: ");
        x1 = sc.nextInt();

        System.out.print("enter y1: ");
        y1 = sc.nextInt();

        System.out.print("enter x2: ");
        x2 = sc.nextInt();

        System.out.print("enter y2: ");
        y2 = sc.nextInt();

        len = Math.abs(x2   - x1);
        width = Math.abs(y1 - y2);

        s = len * width;
        p = 2 * (len        + width);

        System.out.println("Area = " + s);
        System.out.println("Perimeter = " + p);

        sc.close();
    }
}