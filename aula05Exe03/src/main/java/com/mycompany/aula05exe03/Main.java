package com.mycompany.aula05exe03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Navio navio = new Navio("Titanic", 350);
        NavioDeGuerra navioGuerra = new NavioDeGuerra(150, 500, "navio de guerra", 140);
        NavioMercante navioMercante = new NavioMercante(150, 100, "cargo", 50);
        Cruzador navioCruzador = new Cruzador(12, 500, 160, "navio pirata", 80);
        PortaAvioes portaAvioes = new PortaAvioes(20, 400, 195, "porta aviões", 350);
        
        navio.exibirInfoGeral();
        navioGuerra.exibirArmas();
        navioGuerra.poderDeFogo();
        navioMercante.carregamento();
        navioCruzador.poderDeFogo();
        portaAvioes.poderDeFogo();
    }
}
