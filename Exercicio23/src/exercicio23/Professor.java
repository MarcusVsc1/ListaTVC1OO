package exercicio23;

/**
 *
 * @author Marcus
 */
public abstract class Professor extends Pessoa {
    float salario;
    int horas;

    public Professor(int horas, String nome, String telefone, String endereco, String cpf, int identidade, int idade) {
        super(nome, telefone, endereco, cpf, identidade, idade);
        this.horas = horas;
    }
    
    abstract void calculaSalario();
}
