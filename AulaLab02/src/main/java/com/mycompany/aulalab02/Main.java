package com.mycompany.aulalab02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo contasRetangulo = new Retangulo();
        
        System.out.println("Digite o valor do lado 1 do retângulo: ");
        int lado1 = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Digite o valor do lado 2 do retângulo: ");
        int lado2 = input.nextInt();
        
        input.nextLine();
        
        contasRetangulo.setLado1(lado1);
        contasRetangulo.setLado2(lado2);
        
        int perimetroRetangulo = contasRetangulo.perimetro();
        System.out.println("Perimetro: " + perimetroRetangulo);
        
        int areaRetangulo = contasRetangulo.area();
        System.out.println("Area: " + areaRetangulo);
        
    }
}
