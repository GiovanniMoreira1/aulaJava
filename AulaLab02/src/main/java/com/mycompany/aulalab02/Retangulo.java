package com.mycompany.aulalab02;


public class Retangulo {

    private int lado1;
    private int lado2;
    
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int area() {
        int area = lado1 * lado2;
        return area;
    }
    public int perimetro() {
        int perimetro = (2 * lado1) + (2 * lado2);
        return perimetro;
    }
}
