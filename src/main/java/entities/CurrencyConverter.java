package entities;

public class CurrencyConverter {

    public static final double iof = 0.06;

    public static double dollarToReal(double price, double amount){
        double totalToPay = price * amount;
        return totalToPay * iof + totalToPay;

    }
}
