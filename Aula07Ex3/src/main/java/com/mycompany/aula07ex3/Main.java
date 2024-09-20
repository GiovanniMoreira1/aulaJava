package com.mycompany.aula07ex3;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Teste");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Sistema deu erro e a exception foi capturada");
        }
    }
}
