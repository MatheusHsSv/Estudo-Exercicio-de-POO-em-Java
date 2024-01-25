package Study;

import entities.Products;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();


        System.out.print("Digite seu valor: ");
        double price = sc.nextDouble();


        Products products = new Products(name, price);



        System.out.println("Product data: " + products);

        System.out.print("Quantos vai inserir no estoque?: ");
        int add = sc.nextInt() ;
        products.AddProductInStock(add);
        System.out.println("Product data: " + products);

        System.out.print("Voce quer remover quantas unidades?");
        int remove = sc.nextInt();
        products.RemoveItem(remove);
        System.out.println("Product data: " + products);

        sc.close();


    }
}
