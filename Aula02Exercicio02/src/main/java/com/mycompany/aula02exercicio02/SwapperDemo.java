package com.mycompany.aula02exercicio02;

import java.util.Scanner;

public class SwapperDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Swapper troca = new Swapper();
        
        System.out.println("Digite um valor para y:");
        float y = input.nextFloat();
        
        input.nextLine();
        
        System.out.println("Digite um valor para x:");
        float x = input.nextFloat();
        
        input.nextLine();
        
        troca.setX(x);
        troca.setY(y);
        
        troca.swap();
        
        System.out.println("Valor de y: " + troca.getY());
        System.out.println("Valor de x: " + troca.getX());
        
    }
}
