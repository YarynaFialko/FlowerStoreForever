package ua.edu.ucu.demo.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.demo.delivery.Delivery;
import ua.edu.ucu.demo.orders.Item;
import ua.edu.ucu.demo.payments.Payment;

import java.util.List;


@Getter @Setter @AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public int calculateTotalPrice(){
        int totalPrice  = 0;
        for(Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
