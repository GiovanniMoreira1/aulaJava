package com.mycompany.aula07ex04;

class Erro extends RuntimeException{

    public Erro(String message) {
        super(message);
    }
    
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new Erro("Funciona");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
