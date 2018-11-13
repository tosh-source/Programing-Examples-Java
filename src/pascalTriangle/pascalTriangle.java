package pascalTriangle;

import java.util.Scanner;

public class pascalTriangle {

    public static void main(String[] args) {  //Pascal triangle (with mathematical formula)
        
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + ((rows - i) * 2) + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

//The pseudo code, for this case, is taken from internet.
