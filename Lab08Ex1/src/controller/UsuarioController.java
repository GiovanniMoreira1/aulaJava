package controller;

import java.util.ArrayList;
import model.Usuarios;
import view.BuscarUsuario;
import view.Janela;

public class UsuarioController {
    private Janela j;
    private BuscarUsuario b;
    private Usuarios u;
    
    
    ArrayList<Usuarios> funcionarios = new ArrayList();

    public UsuarioController(Janela j, BuscarUsuario b) {
        this.j = j;
        this.b = b;
    }

    public UsuarioController() {
    }

    public void CadastrarUsuario(){
        String nome = j.getInputNome().getText();
        String sobrenome = j.getInputSobrenome().getText();
        String cpf = j.getInputCPF().getText();
        String sexo = null;
        if(j.getBtnFeminino().isSelected()){
            sexo = "Feminino";
        }else{
            sexo = "Masculino";
        }
        
        int idade = Integer.parseInt(j.getInputIdade().getText());
        
        u = new Usuarios(nome, sobrenome, cpf, sexo, idade);
        
        System.out.println(u.toString());
        
        funcionarios.add(u);
        
        j.getInputNome().setText("");
        j.getInputSobrenome().setText("");
        j.getInputCPF().setText("");
        j.getInputIdade().setText("");
        j.getBtnSexo().clearSelection();
        
        System.out.println(funcionarios);
    }
    
    public void BuscarUsuario(){
        
        String cpf = b.getInputCPF().getText();
        
        System.out.println(cpf);
        
        System.out.println(funcionarios);
        for(Usuarios user : funcionarios){
            System.out.println(user.getCpf());
            if(user.getCpf().equals(cpf)){
                b.getTxtInfos().setText("Nome Completo: " + user.getNome() 
    +" "+ user.getSobrenome() +"\n" + "Idade: "+user.getIdade() +"\n" + "CPF: " 
    + user.getCpf() + "\n" + "Sexo: " + user.getSexo());
            }
        }
    }
    
    public void Trocar(){
        if(j.isVisible()){
            j.setVisible(false);
            b.setVisible(true);
        }
        else{
            j.setVisible(true);
            b.setVisible(false);
        }
    }
}
