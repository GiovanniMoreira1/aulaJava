package com.mycompany.teoria04exe01;

public class Laser {
    private String fab;
    private double alcance, precisao, medida;

    public Laser() {
    }

    public Laser(String fab, double alcance, double precisao, double medida) {
        this.fab = fab;
        this.alcance = alcance;
        this.precisao = precisao;
        this.medida = medida;
    }

    public String getFab() {
        return fab;
    }

    public double getAlcance() {
        return alcance;
    }

    public double getPrecisao() {
        return precisao;
    }

    public double getMedida() {
        return medida;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Laser{" + "fab=" + fab + ", alcance=" + alcance + ", precisao=" + precisao + ", medida=" + medida + '}';
    }
    
    
}
