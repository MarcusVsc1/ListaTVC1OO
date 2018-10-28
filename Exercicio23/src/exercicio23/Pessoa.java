package exercicio23;

/**
 *
 * @author Marcus
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    int identidade;
    int idade;

    public Pessoa(String nome, String telefone, String endereco, String cpf, int identidade, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.identidade = identidade;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdentidade() {
        return identidade;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getIdade(int ano_atual, int ano_futuro) {
        return idade + ano_futuro - ano_atual;
    }
}
