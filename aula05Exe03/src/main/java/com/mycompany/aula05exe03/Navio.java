package com.mycompany.aula05exe03;

public class Navio {
    protected int numTripulantes;
    protected String nome;
    
    public Navio(int numTripulante, String nome){
        this.nome = nome;
        this.numTripulantes = numTripulante;
    }
    
    public void ExibirinfoGeral(){
        System.out.println("|Navio : " + nome + " | Quantidade de Tripulantes: " 
                           + numTripulantes +" |");
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Navio() {
    }
    
    
    
}
