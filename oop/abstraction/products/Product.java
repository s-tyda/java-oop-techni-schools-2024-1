package org.example.oop.abstraction.products;

public abstract class Product {
    protected String productName;
    protected float netPrice;
    protected float grossPrice;
    protected float taxRate;
    protected float markup;
    protected int quantity;

    public Product(String productName, float netPrice, int quantity) {
        this.productName = productName;
        this.netPrice = netPrice;
        this.quantity = quantity;
    }

    public abstract String description (int quantity);

    public float value() {
        return grossPrice * quantity;
    }

    public boolean sell(int number){
        if(number <= quantity){
            quantity -= number;
            return true;
        }
        return false;
    }
}
