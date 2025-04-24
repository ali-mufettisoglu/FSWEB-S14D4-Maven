package org.example.model;

public class Coke extends ProductForSale {
    private String brand;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description,String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: "+getType()+" Price: "+getPrice()+"-TL Desc: "+getDescription()+" Brand: "+this.brand);
    }
}
