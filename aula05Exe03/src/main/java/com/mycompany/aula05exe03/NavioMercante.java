package com.mycompany.aula05exe03;

public class NavioMercante extends Navio {
    protected double capacidadeCarga, carga;

    public NavioMercante(double capacidadeCarga, double carga, String nome, int numTripulantes) {
        super(nome, numTripulantes);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    
    
    public NavioMercante() {
    }
    
    public void carregamento() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de tripulantes: " + numTripulantes);
        System.out.println("Volume: " + (carga/capacidadeCarga)*100 + "%");
    } 
}
