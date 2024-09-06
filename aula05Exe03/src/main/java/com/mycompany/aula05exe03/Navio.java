package com.mycompany.aula05exe03;

public class Navio {
    protected int numTripulantes;
    protected String nome;
    
    public Navio(String nome, int numTripulantes){
        this.nome = nome;
        this.numTripulantes = numTripulantes;
    } 
    
    public Navio() {
    }
    
    public void exibirInfoGeral() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade tripulants: " + numTripulantes);
    }
}
