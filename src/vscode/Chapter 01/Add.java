import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;

        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;

        System.out.println("Sum is : " + sum);

        sc.close();
    }
}
