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

//       String query = "select * from aluno where usuario = '"
//               + aluno.getUsuarios() + "' AND senha = '" 
//               + aluno.getSenha() + "'"; STRING COM SQL IJECTION

//     Query criada para evitar sql injection
       String sql = "select * from aluno where usuario = ? AND senha = ?";
//     criamos e preparamos a query e a conexão
       PreparedStatement statement = conn.prepareStatement(sql);
       
//     Método criado para setar o campo ? dentro da query para evitar sql injection
       statement.setString(1, aluno.getUsuarios());
       statement.setString(2, aluno.getSenha());
       
//     Executamos a query
       statement.execute();
//     Salvamos o resultado dessa query em um objeto ResultSet que 
//     já foi criado para salvar esse tipo de informação
       ResultSet resultado = statement.getResultSet();
       
       return resultado;
   }
// Porém esses métodos são vulneraveis a SQL Injection
   public void inserir(Aluno aluno) throws SQLException {
       String sql = "insert into aluno (nome, usuario, senha) values ('"
               + aluno.getNome() + "', '"
               + aluno.getUsuarios() + "', '"
               + aluno.getSenha() + "')";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.execute();
       conn.close();
   }
   
   public void atualizar(Aluno aluno) throws SQLException{
       String sql = "update aluno set senha = ? where usuario = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setString(1, aluno.getSenha());
       statement.setString(2, aluno.getUsuarios());
       statement.execute();
       conn.close();
       
   }
   
   public void excluir(Aluno aluno) throws SQLException{
       
       String sql = "delete from aluno where usuario = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setString(1, aluno.getUsuarios());
       statement.execute();
       conn.close();
             
   }
}
