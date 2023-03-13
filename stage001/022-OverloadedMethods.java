package overloadedmethods;

public class OverloadedMethods {
    public static void main(String[] args) {
        
        int x = add(2,3);
        System.out.println(x);
        
        double y = add(2.0,3.0);
        System.out.println(y);
        
    }
    
    // Static Int
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1 - Integer");
        return a + b;
    }
    
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2 - Integer");
        return a + b + c;
    }
    
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3 - Integer");
        return a + b + c + d;
    }
    
    // Static Double
    static double add(double a, double b){
        System.out.println("This is overloaded method #1 - Double");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #2 - Double");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #3 - Double");
        return a + b + c + d;
    }
    
}
