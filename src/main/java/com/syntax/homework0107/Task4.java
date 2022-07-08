package com.syntax.homework0107;

/*Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
 which should be returning a price of the Vehicle.
 Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
   calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned
   price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */

abstract class Vehicle{
    double vehiclePrice;

    abstract double calculateSalePrice();
}

class Sedan extends Vehicle{
    double length;

    Sedan(double vehiclePrice, double length){
        this.vehiclePrice = vehiclePrice;
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return vehiclePrice/100*95;
        } else{
            return vehiclePrice/100*90;
        }
    }
}
class Truck extends Vehicle{
    double weight;

    Truck(double vehiclePrice, double weight){
        this.vehiclePrice = vehiclePrice;
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return vehiclePrice/100*90;
        } else {
            return vehiclePrice/100*80;
        }
    }
}

class Task4{
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Sedan(50000, 18.5), new Truck(100000, 1800)};
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle.calculateSalePrice());
        }
    }
}
