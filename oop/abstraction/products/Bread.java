package org.example.oop.abstraction.products;

public class Bread extends Product{

    public Bread(String productName, float netPrice, int quantity) {
        super(productName, netPrice, quantity);
        this.markup = 0.1f;
        this.taxRate = 0.05f;
    }

    @Override
    public String description(int quantity) {
        if(this.quantity<quantity){
            return "Piekarnia: 30 chlebow";
        }
        return "";
    }
}
