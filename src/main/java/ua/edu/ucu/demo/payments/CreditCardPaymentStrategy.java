package ua.edu.ucu.demo.payments;

public class CreditCardPaymentStrategy implements Payment{

    public void pay(double price){

        System.out.println("You paid"+ price +"with credit card.");
    }
}
