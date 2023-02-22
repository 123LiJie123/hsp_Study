package com.design_pattern.static_agency;

public class HouseProxy implements RentHouse {
    public Host host;

    public HouseProxy() {
    }

    public HouseProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rentHouse() {
        System.out.println("今天天气真不错");
        host.rentHouse();
    }

    public void getbackHouse() {
        System.out.println("今天天气真不错");
        host.getbackHouse();
    }
}
