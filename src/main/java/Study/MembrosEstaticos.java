package Study;

import entities.CurrencyConverter;

import java.util.Scanner;

public class MembrosEstaticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price?: ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought?: ");
        double amount = sc.nextDouble();
        System.out.println("amount to be payed in reais: " + CurrencyConverter.dollarToReal(price, amount));

        sc.close();

    }
}
