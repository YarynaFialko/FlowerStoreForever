package ua.edu.ucu.demo.delivery;

import ua.edu.ucu.demo.orders.Item;

import java.util.List;

public class DHLDeliverStrategy implements Delivery{
    public void deliver(List<Item> items){
        System.out.println("Delivery type:  DHL. Objects to deliver: "+ items);
    }
}