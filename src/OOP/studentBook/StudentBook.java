package OOP.studentBook;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class StudentBook {

    public static void main(String[] args) {

        Student PeshoStudent = new Student();

        PeshoStudent.FirstName = "Pesho";
        PeshoStudent.LastName = "Ivanov";
        PeshoStudent.Age = 21;

        System.out.println(PeshoStudent.FirstName + " "
                + PeshoStudent.LastName + ", Age: "
                + PeshoStudent.Age);
        
        System.out.println(Student.Information);
    }
}
