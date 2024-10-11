package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Aluno;

public class AlunoDAO {
//  Criamos essa classe com o objeto conn que vai cuidar da nossa conexão
    private Connection conn; 
//  O contrutor parametrizado para sempre criar a conexão ao chamar a classe
    public AlunoDAO(Connection conn) {
        this.conn = conn;
    }
   
//Esse método cuida da criação da query (comando) de consulta do SQL
   public ResultSet consultar(Aluno aluno) throws SQLException{
//     Criamos a string da query onde selecionamos todas as 
//     linhas da tabela aluno onde usuario seja igual ao usuario digitado 
//     e senha igual a senha digitada
       String query = "select * from aluno where usuario = '"
               + aluno.getUsuarios() + "' AND senha = '" 
               + aluno.getSenha() + "'";
//     criamos e preparamos a query e a conexão
       PreparedStatement statement = conn.prepareStatement(query);
//     Executamos a query
       statement.execute();
//     Salvamos o resultado dessa query em um objeto ResultSet que 
//     já foi criado para salvar esse tipo de informação
       ResultSet resultado = statement.getResultSet();
       
       return resultado;
   }
}
