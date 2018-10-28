package exercicio23;

/**
 *
 * @author Marcus
 */
public class ProfessorEfetivo extends Professor{
    private int horas_pesquisa;

    public ProfessorEfetivo(int horas_pesquisa, int horas, String nome, String telefone, String endereco, String cpf, int identidade, int idade) {
        super(horas, nome, telefone, endereco, cpf, identidade, idade);
        this.horas_pesquisa = horas_pesquisa;
    }

    @Override
    public void calculaSalario() {

    }

    
    
}
