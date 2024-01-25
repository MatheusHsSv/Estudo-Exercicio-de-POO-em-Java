package entities;

public class BankSystem {

    private int conta;
    private String name;
    private double balance;

    public BankSystem(int conta, String name, double depositoInicial){
        this.name = name;
        this.conta = conta;
        BalanceAfterDeposit(depositoInicial);
    }

    public BankSystem(int conta, String name) {
        this.conta = conta;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getConta() {
        return conta;
    }

    public double getBalance() {
        return balance;
    }

    public void BalanceAfterDeposit(double deposit){
        this.balance += deposit;
    }

    public void BalanceAfterWithDraw(double withDraw){
        this.balance = this.balance - withDraw - 5.00;
    }

    public String showBankAccountData() {
        return "Conta: "
                + getConta()
                + ", "
                + "Titular: "
                + name
                +", "
                +"Saldo: "
                +"$"
                +getBalance();
    }

}
