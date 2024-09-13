package com.mycompany.aula06exe03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Formas f = null;
        String opc;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Digite sua opção:\n"
                    + "1. Circulo \n"
                    + "2. Retangulo \n"
                    + "3. Sair \n");
            opc = input.nextLine();

                if(opc.equals("1")) {
                    System.out.println("Digite o raio: ");
                    f = new Circulo(input.nextDouble());
                    f.print();
                }
                else if(opc.equals("2")) {
                    f = new Retangulo(4, 7);
                    f.print();
                }
                else if (opc.equals("3")){
                    break;
                }
            }
        
    }
}
