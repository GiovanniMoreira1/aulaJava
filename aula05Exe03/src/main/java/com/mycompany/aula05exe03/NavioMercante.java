
package com.mycompany.aula05exe03;

public class NavioMercante extends Navio{
    protected float capacidadeCarga;
    protected float carga;

    public NavioMercante(float capacidadeCarga, float carga, int numTripulante, String nome) {
        super(numTripulante, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }
    
    public void Carregamento(){
        ExibirinfoGeral();
        System.out.println("| Capacidade : " + carga/capacidadeCarga + " |");
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public NavioMercante() {
    }
    
    
}
