package com.mycompany.aula05exe03;

public class Cruzador extends NavioDeGuerra {
    protected int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, String nome, int numTripulantes) {
        super(blindagem, ataque, nome, numTripulantes);
        this.numCanhoes = numCanhoes;
    }

    
    
    public Cruzador() {
        
    }

    @Override
    public void poderDeFogo(){
        double ataqueLocal = ataque * Math.sqrt(numCanhoes);
        System.out.println("Poder de fogo do Navio Cruzador: " + ataqueLocal);
    }
    
}
