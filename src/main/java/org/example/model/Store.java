package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale product1 = new Chocolate("Food",20,"Test",35);
        ProductForSale product2 = new Bread("Food",10,"Test","Multigrain");
        ProductForSale product3 = new Coke("Food",30,"Test","Pepsi");
        ProductForSale[] products = {product1,product2,product3};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products) {
            product.showDetails();
        }
    }
}