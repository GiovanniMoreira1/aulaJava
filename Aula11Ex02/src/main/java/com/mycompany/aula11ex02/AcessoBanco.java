package com.mycompany.aula11ex02;

public class AcessoBanco {
    //atributo do tipo static é unico e é compartilhado entre 
    //todos os objetos desta classe
    private static AcessoBanco objetoUnico;
    
    private int a;

    public AcessoBanco() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    //Metodos static conseguem ser invocados mesmo que não
    //tenhamos objetos da classe instanciados
    
    public static AcessoBanco getAcessoBanco(){
        if (objetoUnico == null) {
            objetoUnico = new AcessoBanco();
        }
        return objetoUnico;
    }
}
