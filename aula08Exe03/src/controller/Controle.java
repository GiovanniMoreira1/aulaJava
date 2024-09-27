package controller;

import view.Janela;
import model.Div;
import model.Mult;
import model.OperacaoMatematica;
import model.Soma;
import model.Sub;

public class Controle {
    
    private Janela view;
    private OperacaoMatematica calc;
    private String n1, n2;
    
    
    
    public Controle(Janela view) {
        this.view = view;
    }
    
    
    public void controleZero(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "0");
        
    }
    public void controleUm(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "1");
        
    }
    public void controleDois(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "2");
        
    }
    public void controleTres(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "3");
        
    }
    public void controleQuatro(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "4");
        
    }
    public void controleCinco(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "5");
        
    }
    public void controleSeis(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "6");
        
    }
    public void controleSete(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "7");
        
    }
    public void controleOito(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "8");
        
    }
    public void controleNove(){
        String texto = view.getTxtDisplay().getText();
        view.getTxtDisplay().setText(texto + "9");
        
    }
    
    public void controleSoma() {
        n1 = view.getTxtDisplay().getText();
        calc = new Soma();
        view.getTxtDisplay().setText("");
    }
    
    public void controleSub() {
        n1 = view.getTxtDisplay().getText();
        calc = new Sub();
        view.getTxtDisplay().setText("");
    }
    
    public void controleMult() {
        n1 = view.getTxtDisplay().getText();
        calc = new Mult();
        view.getTxtDisplay().setText("");
    }
    
    public void controleDiv() {
        n1 = view.getTxtDisplay().getText();
        calc = new Div();
        view.getTxtDisplay().setText("");
    }
    
    public void controleClear() {
        view.getTxtDisplay().setText("");
    }
    
    public void controleIgual() {
        n2 = view.getTxtDisplay().getText();
        
        double r = calc.calcula(Double.parseDouble(n1),Double.parseDouble(n2));
        view.getTxtDisplay().setText(String.valueOf(r));
        
    }
    
}
