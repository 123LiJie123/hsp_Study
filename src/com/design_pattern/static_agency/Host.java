package com.design_pattern.static_agency;

public class Host implements RentHouse {
    @Override
    public void rentHouse() {
        System.out.println("房东把房子租子租了出去");
    }

    public void getbackHouse() {
        System.out.println("房东收回房子");
    }
}
