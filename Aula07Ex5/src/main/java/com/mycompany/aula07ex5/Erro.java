package com.mycompany.aula07ex5;

class IntErro extends RuntimeException{

    public IntErro(String message) {
        super(message);
    }
    
}

class StringErro extends RuntimeException{

    public StringErro(String message) {
        super(message);
    }
    
}

class FloatErro extends RuntimeException{

    public FloatErro(String message) {
        super(message);
    }
    
}

public class Erro {

    public void erros(int i) {
        if(i == 1){
            throw new IntErro("Erro de inteiro");
        }
        else if(i == 2){
            throw new StringErro("Erro de string");
        }else{
            throw new FloatErro("Erro de float");
        }
    }
}
