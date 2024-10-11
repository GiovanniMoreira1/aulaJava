package controller;

import DAO.AlunoDAO;
import DAO.Conexao;
import model.Aluno;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerLogin {
    private LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }
    
    public void loginAluno(){
//      Criamos o objeto aluno
        Aluno aluno = new Aluno(null, view.getTxtUsuario().getText(), 
                                view.getTxtSenha().getText());

//      Criamos o Objeto de conexao
        Conexao c = new Conexao();
        
        try{
//          Fazemos a conexao
            Connection conn = c.getConnection();

//          Criamos o objeto para executar a query em alunos passando a conexão
            AlunoDAO dao = new AlunoDAO(conn);
//          Executamos a consulta
            ResultSet res = dao.consultar(aluno);
//          Dando certo exibimos um modal de Login Efetuado
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Login efetuado!", 
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
//          Dando errado modal de Login não efetuado
            } else{
                JOptionPane.showMessageDialog(view, "Login não efetuado!", 
                        "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        
//      Em casos de exceptions fazemos o tratamento com catch e modais
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão!!", 
                        "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
