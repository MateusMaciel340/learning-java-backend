package arrays;

public class Arrays {
    public static void main(String[] args) {
        
        String[] carsOne = {"Camaro", "Corvette", "Tesla", "BMW"};
        
        carsOne[0] = "Mustang";
        
        System.out.println(carsOne[3]);
        
        System.out.println("-----------------");
        
        String[] cars = new String[3];
        
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
