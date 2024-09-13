package com.mycompany.aula06exe02;
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        OperacaoMatematica operacao = null;
        
        double resultado;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a operação: ");
        String resp = input.nextLine();
        
        if(resp.equals("soma")) {
            operacao = new Soma();
        } else {
            operacao = new Subtracao();
        }
        resultado = operacao.calcular(9, 4);
        System.out.println("Resultado é " + resultado);
        
        
    }
}
