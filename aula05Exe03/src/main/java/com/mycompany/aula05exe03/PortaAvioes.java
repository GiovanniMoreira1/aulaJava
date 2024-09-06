/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exe03;

/**
 *
 * @author uniflcastro
 */
public class PortaAvioes extends NavioDeGuerra{
    protected int numAvioes;

    public PortaAvioes(int numAvioes, float blindagem, float ataque, int numTripulante, String nome) {
        super(blindagem, ataque, numTripulante, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    @Override
    public void ExibirArmas(){
        ExibirinfoGeral();
        System.out.println("| Blindagem : " + blindagem + " |");
    }
    
    @Override
    public void PoderDeFogo(){
        this.ExibirArmas();
        System.out.println("| Poder de Fogo: " + ataque * (numAvioes*numAvioes) + " |");
    }
}
