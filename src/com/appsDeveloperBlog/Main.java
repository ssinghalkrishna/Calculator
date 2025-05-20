package com.appsDeveloperBlog;

public class Main {
    public static void main(String[] args) {
//        SmartAppliance appliance1 = new SmartAppliance("AC1", "Cooling", "On");
//
//        SmartAppliance appliance2 = appliance1.getInstance();
//
//        SmartAppliance appliance3 = appliance1;
//        //method chaining
//        appliance1.setApplianceName("Set Air Con")
//                .setApplianceType("Cooling mooling")
//                .setPowerStatus("Off");
//
//        appliance2.setApplianceName("AC2");
//        appliance2.displayDetails();
//        appliance3.setApplianceName("AC3");
//        appliance3.displayDetails();
//        appliance1.displayDetails();

//        SmartPhone phone1 = new SmartPhone("Magic V3", "Honor", 900);
//        SmartPhone phone2 = new SmartPhone("16 Max", "iPhone", 1000);
//        SmartPhone phone3 = new SmartPhone(phone2);
//
//        phone3.applyDiscount(10);
//        phone2.comparePrice(phone3);

//        phone1.applyDiscount(10);
//        phone1.comparePrice(phone2);
//        phone1.displayDetails();
//        phone2.displayDetails();
//        phone3.displayDetails();
        //calling static method directly using class name
     //   SandwichMaker.displayRecipe();

        //creating an instance(object) of SandwichMaker
        SandwichMaker sandwich = new SandwichMaker();

        //calling non static method using instance
        sandwich.makeSandwich();
    }
}