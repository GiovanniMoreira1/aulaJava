package controller;
import model.Pessoa;
import view.Janela;
import java.util.ArrayList;
import view.JanelaUsuarios;

public class Controle {
    private Janela view;
    private JanelaUsuarios janela;
    
    public Controle(Janela view) {
        this.view = view;
    }
    
    public Controle(JanelaUsuarios janela) {
        this.janela = janela;
    }
    
    static ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

    
    public void cadastraPessoa() {
        String nome = view.getTxtNome().getText();
        String sobrenome = view.getTxtSobrenome().getText();
        String cpf = view.getTxtCpf().getText();
        String idade = view.getTxtIdade().getText();
        String sexo;
        if(view.getBtnMasc().isSelected()) {
            sexo = "Masculino";
        } else if(view.getBtnFem().isSelected()) {
            sexo = "Feminino";
        } else {
            sexo = "Indefinido";
        }
        
        Pessoa p = new Pessoa(nome, sobrenome, idade, cpf, sexo);
        listaDePessoas.add(p);
    }
    
    public void limpaCampos() {
        view.getTxtNome().setText("");
        view.getTxtSobrenome().setText("");
        view.getTxtCpf().setText("");
        view.getTxtIdade().setText("");
        view.getBtnSexo().clearSelection();
    }
    
    public void buscaPessoas() {
        boolean cpfEncontrado = false;
        for(Pessoa p : listaDePessoas) {
            if(p.getCpf().equals(janela.getTxtBusca().getText())) {
                janela.getTxtResultado().setText(p.toString());
                cpfEncontrado = true;
            } 
            
            if(!cpfEncontrado) {
                janela.getTxtResultado().setText("CPF não encontrado!");
            }
        }
    }
}
