package OOP.objectCounter;

public class program {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(objectsCounter.NextValue());
        }
    
        objectsCounter.Reset();
        System.out.println("\nReset counter\n" + objectsCounter.NextValue() + "\n");
    }
}
