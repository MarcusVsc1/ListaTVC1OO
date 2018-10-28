
package exercicio23;

/**
 *
 * @author 
 */
public class Aluno extends Pessoa{
    private int matricula;
    public Notas notaAluno;
    
    public Aluno(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int matricula, float n1, float n2, float n3) {
        super(nome, telefone, endereco, cpf, identidade, idade);
        notaAluno = new Notas(n1, n2, n3);
        this. matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getMedia() {
        return notaAluno.getMedia();
    }
    
    public void alunoaAprovado(){
        if(getMedia()>=60){
            System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Aluno reprovado.");
        }
    }
}
