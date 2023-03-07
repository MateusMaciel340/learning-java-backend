package mathclass;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        
        // Math Floor -> round a number down to the nearest integer value
        double x = 3.14;
        double y = -10.4;
        
        double w = Math.floor(x);
        double z = Math.floor(y);
        
        System.out.println(w);
        System.out.println(z);
        
        System.out.println("----------------------");
        
        // Math.sqrt
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x * x) + (y * y));
        
        System.out.println("The hypotenuse is: " + z);
        scanner.close();
    }   
}