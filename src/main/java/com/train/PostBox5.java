package com.train;

public class PostBox5 extends PostBox {

    float length = 39.5f;
    float width = 27.5f;
    int height = 23;

    @Override
    public boolean vaildate(float length, float width, int height) {
        return length <= this.length && width <= this.width && height <= this.height;
    }

    @Override
    public void getName() {
        if(vaildate(length,width,height)){
            System.out.println("Box5");
        }
    }

}
