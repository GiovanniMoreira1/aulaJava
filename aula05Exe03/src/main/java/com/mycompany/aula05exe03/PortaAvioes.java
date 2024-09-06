package com.mycompany.aula05exe03;

public class PortaAvioes extends NavioDeGuerra {
    protected int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, String nome, int numTripulantes) {
        super(blindagem, ataque, nome, numTripulantes);
        this.numAvioes = numAvioes;
    }

    
    
    public PortaAvioes() {
    }
    
    @Override
    public void poderDeFogo() {
        System.out.println("Ataque do Porta-Aviões: " + ataque * (numAvioes*numAvioes));
    }
    
}
