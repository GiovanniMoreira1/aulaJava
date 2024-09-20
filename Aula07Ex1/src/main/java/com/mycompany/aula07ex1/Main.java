package com.mycompany.aula07ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {   
            
            int numerador = 1;
            
            System.out.println("Digite o divisor: ");
            int divisor = input.nextInt();
            input.nextLine();
            
            try{
                System.out.println("Resultado = " + numerador/divisor);
                break;
            }
            catch (Exception exception){
                System.out.println("Digite novamente o numero - divisao invalida");
                System.out.println(exception);
            }
        }
    }
}
