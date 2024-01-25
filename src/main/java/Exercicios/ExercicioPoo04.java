package Exercicios;

import entities.BankSystem;

import java.util.Scanner;

public class ExercicioPoo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem bankSystem;

        System.out.print("Digite o número da conta: ");
        int bankAccount = sc.nextInt();

        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Deseja fazer depósito inicial (y/n) ? ");
        char yOrN = sc.next().charAt(0);
        if (yOrN == 'y'){
            System.out.print("Digite o valor do depósito: ");
            double deposit = sc.nextDouble();
            bankSystem = new BankSystem(bankAccount, name, deposit);
            System.out.println("Conta criada com sucesso! "+ bankSystem.getName() +" seu saldo é de: $" + bankSystem.getBalance());
        }else{
            bankSystem = new BankSystem(bankAccount, name);
            System.out.println("Conta criada com sucesso! " + bankSystem.getName());
        }

        System.out.println("Qual a quantidade de dinheiro que você deseja depositar?: ");
        double deposit = sc.nextDouble();
        bankSystem.BalanceAfterDeposit(deposit);
        System.out.println(bankSystem.showBankAccountData());

        System.out.println("Quanto voçê quer sacar?: ");
        double withDraw = sc.nextDouble();
        bankSystem.BalanceAfterWithDraw(withDraw);
        if (bankSystem.getBalance() < 0){
            System.out.println("VOÇÊ ESTÁ NO VERMELHO!!");
            System.out.println(bankSystem.showBankAccountData());
        }else {
            System.out.println(bankSystem.showBankAccountData());
        }
        sc.close();



    }
}
