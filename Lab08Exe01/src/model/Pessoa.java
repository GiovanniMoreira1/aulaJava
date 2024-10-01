package model;


public class Pessoa {
    private String nome, sobrenome, cpf, idade, sexo;
    
    
    public Pessoa(String nome, String sobrenome, String idade, String cpf, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return (" Nome: " + nome + " " + sobrenome + "\n Idade: " + idade + 
    "\n Sexo: " + sexo + "\n CPF: " + cpf); 
    }
    
    

    
    
}
