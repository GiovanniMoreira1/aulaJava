package controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Funcionario;
import view.Janela;

public class Controle {
    Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
    
    public void cadastrarFunc() {
        String nome = view.getTxtNome().getText();
        String cargo = view.getTxtCargo().getText();
        String matricula = view.getTxtMatricula().getText();
        double salario = Double.parseDouble(view.getTxtSalario().getText());
        
        Funcionario f = new Funcionario(nome, cargo, matricula, salario);
        listaDeFuncionarios.add(f);
        
        JOptionPane.showMessageDialog(view, "Usuário cadastrado!");
    }
    
    public void buscarFunc() {
        boolean funcEncontrado = false;
        for(Funcionario f : listaDeFuncionarios) {
            if(f.getMatricula().equals(view.getTxtBusca().getText())) {
                view.getTxtDados().setText(f.toString());
                funcEncontrado = true;
                break;
            }
            if(!funcEncontrado) {
                view.getTxtDados().setText("Não foi possível encontrar o Funcionário.");
            }
        }
    }
    
}
