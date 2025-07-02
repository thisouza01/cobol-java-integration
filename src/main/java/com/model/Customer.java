package main.java.com.model;

public class Customer {
    private String id;
    private String name;
    private double balance;

    // Constructor
    public Customer(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    // getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
