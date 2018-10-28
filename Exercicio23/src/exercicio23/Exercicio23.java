package exercicio23;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Exercicio23 {

    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joseph","(32)99118-5000","Rua dos bobos, 0","12345678922",9513578,25,201778963,90,90,80);
        ArrayList<Aluno> alunos = new ArrayList();
        alunos.add(a1);
        System.out.println(alunos.get(0).getNome());
        System.out.println(alunos.get(0).getIdade());
        System.out.println(alunos.get(0).getEndereco());
        System.out.println(alunos.get(0).getCpf());
        System.out.println(alunos.get(0).getMatricula());
        alunos.get(0).notaAluno.cal_media();
        System.out.println(alunos.get(0).notaAluno.getMedia());
        alunos.get(0).alunoaAprovado();
        
    }
    
    
}
