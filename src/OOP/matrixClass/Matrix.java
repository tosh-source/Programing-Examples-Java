package OOP.matrixClass;

public class Matrix {

    //field
    private int[][] matrix;

    //Getter for length of rows
    public int getRows() {
        return this.matrix.length;
    }

    //Getter for length of cols
    public int getClumns() {
        return this.matrix[0].length;
    }

    //Constructor
    public Matrix(int rows, int cols) {
        this.matrix = new int[rows][cols];
    }

    //NOTE: Java does NOT provide "operators overloading" (like C#), so for that reason, method will be created!
    //This getter is analogue to -> "indexer for accessing the matrix content" in C# varsion of program
    public int getValue(int row, int col) {
        return this.matrix[row][col];
    }

    //This setter is analogue to -> "indexer for accessing the matrix content" in C# varsion of program
    public void setValue(int row, int col, int value) {
        this.matrix[row][col] = value;
    }

    //Create "method for adding"
    public static Matrix add(Matrix first, Matrix second) {

        Matrix result = new Matrix(first.getRows(), first.getClumns());

        for (int row = 0; row < first.getRows(); row++) {
            for (int col = 0; col < first.getClumns(); col++) {
                result.matrix[row][col] = first.matrix[row][col] + second.matrix[row][col];
            }
        }

        return result;
    }
    
    //Create "method for subtracting"
    public static Matrix subtract(Matrix first, Matrix second) {
        
        Matrix result = new Matrix(first.getRows(), first.getClumns());
        
        for (int row = 0; row < first.getRows(); row++) {
            for (int col = 0; col < first.getClumns(); col++) {
                result.matrix[row][col] = first.matrix[row][col] - second.matrix[row][col];
            }
        }
        
        return result;
    }
    
    //Overload "operators for multiplying"
    public static Matrix multiply(Matrix first, Matrix second) {
        
        Matrix result = new Matrix(first.getRows(), first.getClumns());
        
        for (int row = 0; row < first.getRows(); row++) {
            for (int col = 0; col < first.getClumns(); col++) {
                result.matrix[row][col] = first.matrix[row][col] * second.matrix[row][col];
            }
        }
        
        return result;
    }
    
    //Overload ".ToString()" method
    @Override
    public String toString() {
        String result = "";
        
        for (int row = 0; row < this.getRows(); row++) {
            for (int col = 0; col < this.getClumns(); col++) {
                result += matrix[row][col] + " ";
            }
            result += System.lineSeparator();  //<==> System.out.println(); => Console New Line
        }
        
        return result;
    }
}
