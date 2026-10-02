import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len, width;
        double price, totalCost;

        System.out.print("enter len: ");
        len = sc.nextInt();

        System.out.print("enter width: ");
        width = sc.nextInt();

        System.out.print("enter price of a   tile: ");
        price = sc.nextDouble();

        double area = len * width;
        double tilesNeeded = area * 1.05;

        totalCost = tilesNeeded * price;

        System.out.println("total money  = " + totalCost);

        sc.close();
    }
}