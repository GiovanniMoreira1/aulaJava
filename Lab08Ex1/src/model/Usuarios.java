package model;

public class Usuarios {
    private String nome, sobrenome, cpf, sexo;
    private int idade;

    public Usuarios(String nome, String sobrenome, String cpf, String sexo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nome=" + nome + ", sobrenome=" + sobrenome + 
                ", cpf=" + cpf + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    
}
