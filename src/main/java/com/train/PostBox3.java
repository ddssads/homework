package com.train;

public class PostBox3 extends PostBox {

    float length;
    float width;
    int height;

    public PostBox3(float length, float width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public  boolean vaildate(float length, float width, int height) {
        if(length <= 23 && width <= 14 && height <=13) {
            System.out.println("You must use Box3");
            return true;
        } else {
            return false;
        }
    }
}
