package entities;

public class Products {

        public String name;
        public double price;
        public int quantity;


        public double TotalValueInStock(){
             return  price * quantity;
        }
        public void AddProductInStock(int quantity){
             this.quantity += quantity;

    }

        public void RemoveItem(int removed){
             this.quantity -= removed;
        }

}
