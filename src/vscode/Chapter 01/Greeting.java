import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        name = sc.nextLine();

        System.out.println("Hello, " + name + " !");
        
        sc.close();
    } 
    
}
