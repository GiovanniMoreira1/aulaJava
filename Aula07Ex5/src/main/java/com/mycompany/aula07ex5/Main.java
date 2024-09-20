package com.mycompany.aula07ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int i  = input.nextInt();
        
        try{
           Erro e  = new Erro();
           
           e.erros(i);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
