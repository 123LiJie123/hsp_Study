package com.hansunping_secondstage.enum_.homeworks_.homework08_;

public enum Color implements Show {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    int redValue;
    int greenValue;
    int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show() {
        System.out.println(
                "redValue=" + redValue + " greenValue=" + greenValue + " blueValue" + blueValue
        );
    }
}
