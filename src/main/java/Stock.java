import entities.Products;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        Products x;
        x = new Products();
        x.name = sc.nextLine();

        System.out.println("Digite seu valor: ");
        x.price = sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        x.quantity = sc.nextInt();

        System.out.printf("Product data: %s, units: %d, price: R$%.2f%n ", x.name, x.quantity, x.TotalValueInStock() );

        System.out.println("Quantos vai inserir no estoque?: ");
        int add = sc.nextInt() ;
        x.AddProductInStock(add);
        System.out.printf("Product data: %s, units: %d, price: R$%.2f%n ", x.name, x.quantity, x.TotalValueInStock() );

        System.out.println("Voce quer remover quantas unidades?");
        int remove = sc.nextInt();
        x.RemoveItem(remove);
        System.out.printf("Product data: %s, units: %d, price: R$%.2f%n ", x.name, x.quantity, x.TotalValueInStock() );
        sc.close();


    }
}
