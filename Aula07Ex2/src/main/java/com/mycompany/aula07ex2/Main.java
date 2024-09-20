package com.mycompany.aula07ex2;

public class Main {
    public static void main(String[] args) {
        Quadrado q = null;
        //Quadrado q = new Quadrado();
        //q.largura = 5;
        //q.comprimento = 5;
        
        try{
            int resultado = q.area();
            System.out.println(resultado);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
