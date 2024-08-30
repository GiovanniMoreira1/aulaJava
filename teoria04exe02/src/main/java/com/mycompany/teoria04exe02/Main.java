package com.mycompany.teoria04exe02;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cores1 = new ArrayList<>();
        ArrayList<String> cores2 = new ArrayList<>();
        cores1.add("Azul");
        cores1.add("Roxo");
        cores1.add("Verde");
        
        cores2.add("Azul");
        cores2.add("Rosa");
        cores2.add("Verde");
        
        for (int i = 0; i < cores1.size(); i++) {
            if(cores1.get(i).equals(cores2.get(i))) {
                System.out.println("cores iguais na posicao " + i);
            } else {
                System.out.println("posicoes nao iguais na posicao " + i);
            }
        }
    }
}
