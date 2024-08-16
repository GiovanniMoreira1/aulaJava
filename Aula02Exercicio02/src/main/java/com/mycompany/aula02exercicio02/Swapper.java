package com.mycompany.aula02exercicio02;

public class Swapper {
    private float x;
    private float y;
    
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    
    public void swap() {
        float temp = x;
        x = y;
        y = temp;
    }
}
