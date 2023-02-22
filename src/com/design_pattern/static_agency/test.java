package com.design_pattern.static_agency;

public class test {
    public static void main(String[] args) {
        Host host = new Host();
        HouseProxy houseProxy = new HouseProxy(host);
        houseProxy.rentHouse();
        houseProxy.getbackHouse();
    }
}
