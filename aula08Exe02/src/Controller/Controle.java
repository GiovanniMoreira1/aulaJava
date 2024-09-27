package Controller;
import View.Janela;
import Model.Soma;

public class Controle {
    private Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    public void controleSomar() {
        Soma s = new Soma();
        
        double n1 = Double.parseDouble(view.getTxtNum1().getText());
        double n2 = Double.parseDouble(view.getTxtNum2().getText());
        double soma = s.calcular(n1, n2);
        view.getTxtResultado().setText(String.valueOf(soma));
    }
    
    public void controleLimpar() {
        view.getTxtNum1().setText("");
        view.getTxtNum2().setText("");
        view.getTxtResultado().setText("");
    }
}
