package entities;

public class Products {

        private String name;
        private double price;
        public int quantity;




    public Products(String name, double price){
            this.name = name;
            this.price = price;
        }

    public double TotalValueInStock(){
             return  price * quantity;
        }
        public void AddProductInStock(int quantity){
             this.quantity += quantity;

    }

        public void RemoveItem(int removed){
             this.quantity -= removed;
        }

        public String toString(){
             return name
             + ", price: $"
             + String.format("%.2f", price)
             + ", "
             + quantity
             + " units, total: $"
             + String.format("%.2f", TotalValueInStock()) ;
        }



}


