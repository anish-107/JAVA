package code;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radix;
        sc.useRadix(2);

        System.out.print("Enter a binary number : ");
        radix = sc.nextInt();

        System.out.println(radix);

        sc.close();
    }

}
