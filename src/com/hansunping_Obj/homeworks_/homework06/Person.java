package com.hansunping_Obj.homeworks_.homework06;


public class Person {
    String name;
    Vehicles vehicle;

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }


    public void common() {
        if (vehicle instanceof Horse) {
            vehicle.work();
        } else {
            vehicle = VehiclesFactory.getHorse();
            vehicle.work();
        }
    }

    public void passRiver() {
        if (vehicle instanceof Boat) {
            vehicle.work();
        } else {
            vehicle = VehiclesFactory.getBoat();
            vehicle.work();
        }
    }
}
