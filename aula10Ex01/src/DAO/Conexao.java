package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
//    A ideia dessa classe é criar conexão entre a nossa aplicação e o banco de dados
    public Connection getConnection() throws SQLException{
//  Método responsavel por criar uma com o nosso banco de dados alunos
//  Ele pode retornar uma SQl Exception que deve ser tratado
        Connection conexao = DriverManager.getConnection(
//              Aqui definimos a string de conexao ao banco
//              Indicamos a biblioteca, o tipo de banco (postgresql)
//              Indicamos o local que o banco esta rodando (localhost)
//              Indicamos o nome do database que queremos conectar (alunos)
                "jdbc:postgresql://localhost:5432/alunos",
                
//              Indicamos o usuario do banco
                "postgres",
//              Indicamos tambem a senha do pgAdmin
                "fei");
        return conexao;
    }
}

//  vai tomar no cu coxa, com amor leal <3