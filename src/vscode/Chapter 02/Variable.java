import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        
        name = sc.next();

        System.out.println("Hello, " + name + " !");
        System.out.println(Integer.SIZE);
        sc.close();
    }
}