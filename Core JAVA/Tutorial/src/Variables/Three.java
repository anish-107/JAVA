package Variables;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Enter X : ");
        x = sc.nextDouble();

        System.out.print("Enter Y : ");
        y = sc.nextDouble();

        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        double temp = x;
        x = y;
        y = temp;

        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        sc.close();
    }
}
