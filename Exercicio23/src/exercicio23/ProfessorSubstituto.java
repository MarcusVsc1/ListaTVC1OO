package exercicio23;

/**
 *
 * @author Marcus
 */
public class ProfessorSubstituto extends Professor {
    private int horas_atendimento;

    public ProfessorSubstituto(int horas_atendimento, int horas, String nome, String telefone, String endereco, String cpf, int identidade, int idade) {
        super(horas, nome, telefone, endereco, cpf, identidade, idade);
        this.horas_atendimento = horas_atendimento;
    }

    @Override
    public void calculaSalario() {

    }
    
    
}
