package com.mycompany.aulalab02ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Televisao funcoesTelevisao = new Televisao();
        
        System.out.println("Digite o modelo da primeira TV: ");
        String modelo = input.nextLine();
        System.out.println("Digite o preço da primeira TV: ");
        float preco = input.nextFloat();
        System.out.println("Digite o tamanho da primeira TV: ");
        float tamanho = input.nextFloat();
        System.out.println("Digite o volume da primeira TV: ");
        int volume = input.nextInt();
        input.nextLine();
        System.out.println("Digite o canal da primeira TV: ");
        int canal = input.nextInt();
        input.nextLine();
        System.out.println("A primeira TV está ligada? (true/false)");
        boolean ligada = input.nextBoolean();
        
        funcoesTelevisao.setModelo(modelo);
        funcoesTelevisao.setPreco(preco);
        funcoesTelevisao.setTamanho(tamanho);
        funcoesTelevisao.setVolume(volume);
        funcoesTelevisao.setCanal(canal);
        funcoesTelevisao.setLigada(ligada);
        
        System.out.println("Digite o valor do volume novo: ");
        int volumeNovo = input.nextInt();
        funcoesTelevisao.alteraVolume(volumeNovo);
        input.nextLine();
        
        System.out.println("Deseja mudar de canal? S/N");
        String canalNovo = input.nextLine();
        if("S".equals(canalNovo)) {
            canal = funcoesTelevisao.alteraCanal();
        }
        System.out.println("Modelo TV 1: " + modelo + " | Preço TV 1: " + preco + " | Tamanho TV 1: " + tamanho + " | Volume TV 1: " + volumeNovo + " | Canal TV 1: " + canal + " | Está ligada? " + ligada);
        
        System.out.println("Digite o modelo da segunda TV: ");
        String modelo2 = input.nextLine();
        System.out.println("Digite o preço da segunda TV: ");
        float preco2 = input.nextFloat();
        System.out.println("Digite o tamanho da segunda TV: ");
        float tamanho2 = input.nextFloat();
        System.out.println("Digite o volume da segunda TV: ");
        int volume2 = input.nextInt();
        input.nextLine();
        System.out.println("Digite o canal da segunda TV: ");
        int canal2 = input.nextInt();
        input.nextLine();
        System.out.println("A segunda TV está ligada? (true/false)");
        boolean ligada2 = input.nextBoolean();
        
        funcoesTelevisao.setModelo(modelo2);
        funcoesTelevisao.setPreco(preco2);
        funcoesTelevisao.setTamanho(tamanho2);
        funcoesTelevisao.setVolume(volume2);
        funcoesTelevisao.setCanal(canal2);
        funcoesTelevisao.setLigada(ligada2);
        
        System.out.println("Digite o valor do volume novo: ");
        int volumeNovo2 = input.nextInt();
        funcoesTelevisao.alteraVolume(volumeNovo2);
        input.nextLine();
        
        System.out.println("Deseja mudar de canal? S/N");
        String canalNovo2 = input.nextLine();
        if("S".equals(canalNovo2)) {
            canal2 = funcoesTelevisao.alteraCanal();
        }
        System.out.println("Modelo TV 2: " + modelo2 + " | Preço TV 2: " + preco2 + " | Tamanho TV 2: " + tamanho2 + " | Volume TV 2: " + volumeNovo2 + " | Canal TV 2: " + canal2 + " | Está ligada? " + ligada);
    }
}
