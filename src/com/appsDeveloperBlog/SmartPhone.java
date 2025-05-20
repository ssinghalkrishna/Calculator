package com.appsDeveloperBlog;

public class SmartPhone {
    private String model;
    private String brand;
    private double price;
//parameterized constructor
    public SmartPhone(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    //copy constructor
    public SmartPhone(SmartPhone myPhone){
        this.model = myPhone.model;
        this.price = myPhone.price;
        this.brand = myPhone.brand;
    }

    public void applyDiscount(double discountPercentage) {
        this.price -= this.price * (discountPercentage / 100);
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public void comparePrice(SmartPhone otherPhone){
        if(this.price < otherPhone.price){
            System.out.println(this.model + " is cheaper than " + otherPhone.model);
        }
        else if(this.price > otherPhone.price){
            System.out.println(this.model + " is more expensive than " + otherPhone.model);
        }
        else{
            System.out.println(this.model + " costs same as " + otherPhone.model);
        }
    }
}
