/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AlunoDAO;
import DAO.Conexao;
import model.Aluno;
import view.CadastroFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ControllerCadastro {
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    
    public void salvarAluno() {
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Aluno aluno = new Aluno(nome, usuario, senha);
        
        Conexao conexao = new Conexao();
        
        try {
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Aluno cadastrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(view, "Aluno não cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
