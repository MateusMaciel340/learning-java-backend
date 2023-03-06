package expressions;

import javax.swing.JOptionPane;

public class Expressions {
    public static void main(String[] args) {

        int numberValue = 20;

        // Operators
        int addition, subtraction, multiplication, division, rest;

        addition = numberValue + 2;
        subtraction = numberValue - 2;
        multiplication = numberValue * 2;
        division = numberValue / 2;
        rest = numberValue % 2;

        System.out.println(numberValue + " + 2 = " + addition);
        System.out.println(numberValue + " - 2 = " + subtraction);
        System.out.println(numberValue + " * 2 = " + multiplication);
        System.out.println(numberValue + " / 2 = " + division);
        System.out.println(numberValue + " % 2 = " + rest);

        System.out.println("------------------------------");
    }
}