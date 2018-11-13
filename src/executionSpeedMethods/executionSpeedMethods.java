package executionSpeedMethods;

public class executionSpeedMethods {

    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        for (int i = 0; i < 9000; i++) {
            // Do something
        }
        long endTime = System.nanoTime();

        System.out.println("Total execution time: " + (endTime - startTime));

    }
}
