package org.example.model;

public class Bread extends ProductForSale {
    private String wheatType;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }
    public Bread(String type, int price, String description,String wheatType) {
        super(type, price, description);
        this.wheatType = wheatType;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: "+getType()+" Price: "+getPrice()+"-TL Desc: "+getDescription()+" Wheat: "+this.wheatType);
    }
}
