package twodarrays;

public class TwoDArrays {
    public static void main(String[] args) {
        
        String [][] cars = {
            {"Camaro", "Corvette", "Silverado"},
            {"Mustang", "Ranger", "F-150"},
            {"Ferrari", "Lambo", "Tesla"}
        };
        
        /*
            cars[0][0] = "Car 01";
            cars[0][1] = "Car 02"; ......
        */
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
