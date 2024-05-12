package Variables;


import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Enter first number : ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        num2 = sc.nextDouble();

        System.out.println("Sum : " + (num1 + num2));

        sc.close();
    }
}
