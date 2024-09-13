package com.mycompany.aula06exe03;

public abstract class Formas {
    String tipo;
    
    public abstract double perimetro();
    public abstract void print();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
