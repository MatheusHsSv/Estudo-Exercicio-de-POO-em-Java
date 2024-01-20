import entities.CalculatorOfRectangle;

import java.util.Scanner;

public class ExercicioPoo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculatorOfRectangle measures;

        measures = new CalculatorOfRectangle();

        System.out.print("Set the height of the rectangle:");
        measures.height = sc.nextDouble();
        System.out.print("Set the width of the rectangle:");
        measures.width = sc.nextDouble();
        System.out.println("The area is: " + measures.Area());
        System.out.println("The perimeter is: " + measures.Perimeter());
        System.out.println("The diagonal is: " + measures.Diagonal());




        sc.close();
    }
}
