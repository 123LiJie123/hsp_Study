package com.hansunping_Obj.homeworks_.homework06;

public class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
