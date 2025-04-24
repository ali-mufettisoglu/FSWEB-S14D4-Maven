package org.example.model;

public class Chocolate extends ProductForSale{
    private int nutRate;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description,int nutRate) {
        super(type, price, description);
        this.nutRate = nutRate;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: "+getType()+" Price: "+getPrice()+"-TL Desc: "+getDescription()+" Nut-Rate: %"+this.nutRate);
    }
}
