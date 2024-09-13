package com.mycompany.aula06exe03;

public class Circulo extends Formas{
    private double raio = 0;
    double pi = 3.141592;

    public Circulo(double raio) {
        this.raio = raio;
        setTipo("Círculo");
    }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double area() {
       return pi * (raio * raio);
      
    }
    @Override
    public double perimetro() {
        return 2 * pi * raio;
    }
    
    @Override
    public void print() {
        System.out.println("Forma: " + getTipo());
        System.out.println("Raio do círculo: " + raio);
        System.out.println("Área do círculo: " + area());
        System.out.println("Perímetro do círculo: " + perimetro());
        System.out.println("-------------------------------------------");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
