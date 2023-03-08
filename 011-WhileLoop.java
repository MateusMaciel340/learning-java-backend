package whileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        // While
        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        
        System.out.println("-------------------------");
        
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        
        System.out.println("Hello " + name);
    }
}
