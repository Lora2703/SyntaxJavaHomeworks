package com.syntax.homework1707;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {

    /*/*Create a class Insurance that will have an attribute as insuranceName and unimplemented
     behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health.
    Car class has it's own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/
    public static void main(String[] args) {
        Insuranse car = new Car("CarInsurance","Toyota");
        Insuranse pet = new Pet("InsurancePet", "Dog");
        Insuranse health = new Health("HealthInsurance");
        List<Insuranse> insuranses = new ArrayList<>();
        insuranses.add(car);
        insuranses.add(pet);
        insuranses.add(health);

        for(int i=0; i<insuranses.size(); i++){
            insuranses.get(i).getQuote();
            insuranses.get(i).cancelInsurance();
        }
        System.out.println("-------------------------------------");

        for (Insuranse insuranse:insuranses){
            insuranse.getQuote();
            insuranse.cancelInsurance();
        }
        System.out.println("--------------------------------------");

        Iterator<Insuranse> iterator = insuranses.iterator();
        while (iterator.hasNext()){
            Insuranse in = iterator.next();
            in.getQuote();
            in.cancelInsurance();
        }

    }
}

     abstract class Insuranse {

        String insuranceName;

        public Insuranse(String insuranceName){
            this.insuranceName = insuranceName;
        }

         abstract void getQuote();
         abstract void cancelInsurance();
    }

    class Car extends com.syntax.homework1707.Insuranse {
        String carModel;
       public Car(String insuranceName, String carModel){
            super(insuranceName);
            this.carModel = carModel;
        }


        @Override
         void getQuote() {
            System.out.println("2% of your car price for model "+carModel);
        }

        @Override
         void cancelInsurance() {
            System.out.println(insuranceName+" is cancelled");
        }
    }

    class Pet extends com.syntax.homework1707.Insuranse {
        String petType;
        public Pet(String insuranceName, String petType){
            super(insuranceName);
            this.petType = petType;
        }

        @Override
        void getQuote() {
            System.out.println("90$ for the insurance "+petType);
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+" is cancelled");
        }
    }

    class Health extends com.syntax.homework1707.Insuranse {

    public Health(String insuranceName){
        super(insuranceName);
    }

        @Override
        void getQuote() {
            System.out.println("300/Month");
        }

        @Override
        void cancelInsurance() {
            System.out.println(insuranceName+" is cancelled");
        }


    }

