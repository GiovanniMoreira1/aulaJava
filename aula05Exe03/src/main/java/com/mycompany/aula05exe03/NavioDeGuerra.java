package com.mycompany.aula05exe03;

public class NavioDeGuerra extends Navio{
    protected double blindagem, ataque;

    public NavioDeGuerra(double blindagem, double ataque, String nome, int numTripulantes) {
        super(nome, numTripulantes);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    
    public NavioDeGuerra() {
        
    }
    
    public void poderDeFogo() {
        System.out.println("Ataque: " + ataque);
    }
    public  void exibirArmas() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de tripulantes: " + numTripulantes);
        System.out.println("Blindagem: " + blindagem);
        poderDeFogo();
    }
    
}
