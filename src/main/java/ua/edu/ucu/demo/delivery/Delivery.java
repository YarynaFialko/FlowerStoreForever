package ua.edu.ucu.demo.delivery;

import ua.edu.ucu.demo.orders.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
