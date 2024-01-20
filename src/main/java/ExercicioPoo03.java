import entities.AverageCalculator;

import java.util.Scanner;

public class ExercicioPoo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");

        AverageCalculator grades;
        grades = new AverageCalculator();

        grades.name = sc.nextLine();
        System.out.print("Enter the first grade: ");
        grades.grade1 = sc.nextDouble();
        System.out.print("Enter the second grade: ");
        grades.grade2 = sc.nextDouble();
        System.out.print("Enter the third grade: ");
        grades.grade3 = sc.nextDouble();
        System.out.println("Final Grade = " + grades.FinalGrade());
        System.out.println(grades.Result());
        if (grades.FinalGrade() < 60){
            System.out.println("Missing " + grades.MissingPoints() +  " Points");
        }



        sc.close();



    }
}
