package com.hansunping_Obj.homeworks_.homework07;

/*
有一个Car类，有属性temperature(温度)，车内有Air(空调）类，有吹风的功能flow,Air会监视车内的温度，
如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之间则关掉空调。
实例化具有不同温度的Car对象，调用空调的flow方法，测试空调吹的风是否正确.
 */
public class Car {
    private int temperature;
    private final Air air = new Air();

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹热风");

            } else if (temperature > 0) {
                System.out.println("空调关");
            } else {
                System.out.println("吹冷风");
            }

        }
    }


    public Car(int temperature) {
        this.temperature = temperature;
    }


    public Air getAir() {
        return air;
    }

}
