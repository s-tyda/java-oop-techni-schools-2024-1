package org.example.oop.datastructures.warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Warehouse {
    Map<UUID, Item> storage = new HashMap<>();

    public void display(){
        for(Item item : storage.values()){
            System.out.println("name: " + item.name + " | price: " + item.price + " | quantity" + item.quantity);
        }
    }

    public void updateItem(String uuidString, int newQuantity){
        UUID uuid = UUID.fromString(uuidString);
        storage.get(uuid).quantity = newQuantity;
    }

    public void deleteItem(String uuidString){
        UUID uuid = UUID.fromString(uuidString);
        storage.remove(uuid);
    }

    public void addItem(Item newItem){
        storage.put(UUID.randomUUID(), newItem);
    }

    public void init(){
        Item item1 = new Item("milk", 9.99, 3);
        Item item2 = new Item("lorem", 92.99, 7);
        Item item3 = new Item("ipsum", 9.59, 8);
        storage.put(UUID.randomUUID(), item1);
        storage.put(UUID.randomUUID(), item2);
        storage.put(UUID.randomUUID(), item3);
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.init();
        Item item4 = new Item("ipsumdsadas", 9.59, 8);
        warehouse.addItem(item4);

        warehouse.display();
    }
}
