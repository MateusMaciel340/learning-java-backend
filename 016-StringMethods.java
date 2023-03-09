package stringmethods;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Mateus";
        
        boolean resultEquals = name.equalsIgnoreCase("Mateus");
        int resultLength = name.length();
        char resultChar = name.charAt(0);
        int resultIndexOf = name.indexOf("a");
        
        boolean resultIsEmpty = name.isEmpty();
        String resultToUpperCase = name.toUpperCase();
        String resultToLowerCase = name.toLowerCase();
        String resultTrim = name.trim();
        
        String resultReplace = name.replace("e", "3");
        
        
        System.out.println("resultEquals: " + resultEquals);
        System.out.println("resultLength: " + resultLength);
        System.out.println("resultChar: " + resultChar);
        System.out.println("resultIndexOf: " + resultIndexOf);
           
        System.out.println("resultIsEmpty: " + resultIsEmpty);
        System.out.println("resultToUpperCase: " + resultToUpperCase);
        System.out.println("resultToLowerCase: " + resultToLowerCase);
        System.out.println("resultTrim: " + resultTrim);
        
        System.out.println("resultReplace: " + resultReplace);
    } 
}
