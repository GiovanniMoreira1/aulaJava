/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AlunoDAO;
import DAO.Conexao;
import model.Aluno;
import view.UsuarioFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author uniflcastro
 */
public class ControllerUsuario {
    
    private UsuarioFrame view;
    private Aluno aluno;

    public ControllerUsuario(UsuarioFrame view, Aluno aluno) {
        this.view = view;
        this.aluno = aluno;
    }
    
    public void atualizarAluno(){
        String usuario = view.getTxtUsuario().getText();
        String novaSenha = view.getTxtSenha().getText();
        Aluno aluno = new Aluno("", usuario, novaSenha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.atualizar(aluno);
            JOptionPane.showMessageDialog(view, "Senha alterada!",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Senha não alterada", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public void excluirAluno(){
        int opcao = JOptionPane.showConfirmDialog(view,
                "Deseja realmente excluir?",
                "Aviso", 
                JOptionPane.YES_NO_OPTION);
        if(opcao != 1){
            Conexao conexao = new Conexao();
            try{
                Connection conn = conexao.getConnection();
                AlunoDAO dao = new AlunoDAO(conn);
                dao.excluir(aluno);
                JOptionPane.showMessageDialog(view, "Aluno excluido!",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }catch(SQLException e){
                JOptionPane.showMessageDialog(view,
                        "Aluno não excluido", "Erro",
                        JOptionPane.ERROR_MESSAGE);            
                }
        }
    }
    
}
