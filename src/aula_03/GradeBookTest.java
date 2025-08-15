package aula_03;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu curso: ");
        gradeBook.courseName = scanner.next();

        gradeBook.displayMessage();

        scanner.close();



    }
}
