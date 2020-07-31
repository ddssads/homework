package com.train;

public class PostBox3 extends PostBox {


    public PostBox3(float length, float width, int height) {
        super(length, width, height);
    }


    @Override
    public void getName() {
            System.out.println("Box3");
    }
}
