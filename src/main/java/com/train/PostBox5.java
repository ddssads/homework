package com.train;

public class PostBox5 extends PostBox {
    float length;
    float width;
    int height;

    public PostBox5(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean vaildate(float length, float width, int height) {
        if(length <= 39.5 && width <= 27.5 && height <=23) {
            System.out.println("You must use Box5");
            return true;
        } else {
            return false;
        }
    }
}
