package com.mycompany.teoria04exe03;

import java.util.ArrayList;

public class CopyArrayList {
    private ArrayList<String> array1, array2;

    public CopyArrayList(ArrayList<String> array1) {
        this.array1 = array1;
        
        this.array2 = new ArrayList<>(array1);
    }

    public ArrayList<String> getArray1() {
        return array1;
    }

    public ArrayList<String> getArray2() {
        return array2;
    }
}
