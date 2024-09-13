package com.mycompany.aula06exe03;

public class Retangulo extends Formas{
    private double comprimento, largura;
    
    public Retangulo(double comprimento, double largura) {
        setTipo("Retangulo");
    }
    
    @Override
    public double perimetro(){
        return (2 *comprimento) *(2* largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    @Override
    public void print() {
        System.out.println("Forma: " + getTipo());
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
        System.out.println("Perímetro: " + perimetro());
    }
    
}
