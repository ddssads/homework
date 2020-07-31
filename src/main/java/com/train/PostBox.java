package com.train;

public abstract class PostBox {

    float length = 0.0f;
    float width = 0.0f;
    int height = 0;

    public PostBox(float length, float width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    protected boolean vaildate(float length,float width,int height){
        return length<this.length && width<this.width && height < this.height;
    }
    protected abstract void getName();
}
