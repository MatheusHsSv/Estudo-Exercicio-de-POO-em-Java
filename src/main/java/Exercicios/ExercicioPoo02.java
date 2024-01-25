package Exercicios;

import entities.DataProcessor;

import java.util.Scanner;

public class ExercicioPoo02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");

        DataProcessor data;
        data = new DataProcessor();

        data.name = sc.nextLine();

        System.out.print("Gross salary: ");
        data.salary = sc.nextDouble();

        System.out.print("Tax: ");
        data.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $%.2f%n", data.name, data.NetSalary());

        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        data.IncreaseSalary(percentage);
        System.out.printf("Employee: %s, $%.2f%n", data.name, data.salary);

        sc.close();

    }

}
