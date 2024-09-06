package com.mycompany.aula05exe03;

public class NavioDeGuerra extends Navio {
    protected float blindagem;
    protected float ataque;

    public NavioDeGuerra(float blindagem, float ataque, int numTripulante, String nome) {
        super(numTripulante, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }
    
    public void PoderDeFogo(){
        System.out.println("| Ataque : " + ataque + " |");
    }
    
    public void ExibirArmas(){
        ExibirinfoGeral();
        PoderDeFogo();
        System.out.println("| Blindagem : " + blindagem + " |");
    }

    public float getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(float blindagem) {
        this.blindagem = blindagem;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public NavioDeGuerra() {
    }
    
    
}
