package com.train;

public class PostBox3 extends PostBox {

    float length = 23f;
    float width = 14f;
    int height = 13;

    @Override
    public boolean vaildate(float length, float width, int height) {
        return length <= this.length && width <= this.width && height <= this.height;
    }

    @Override
    public void getName() {
        if(vaildate(length,width,height)){
            System.out.println("Box3");
        }
    }

}
