package com.mycompany.teoria04exe03;

import java.util.ArrayList;

public class TesteCopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        
        lista1.add("Arialberto");
        lista1.add("Ariovaldo");
        lista1.add("Toninho");
        lista1.add("leo");
        lista1.add("Sheriff");
        
        CopyArrayList arrays = new CopyArrayList(lista1);
        
        //arrays.copyArray();
        
        for(String a: arrays.getArray2()){
            System.out.println(a);
        }
    }
}
