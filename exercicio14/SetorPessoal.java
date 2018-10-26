package exercicio14;

import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class SetorPessoal {
    private ArrayList<Funcionario> funcionarios;

    public SetorPessoal() {
        funcionarios = new ArrayList();
    }
    
    
    
    public void adicionaFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void imprimeFolha(){
        System.out.println("Segue folha de pagamento:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome()+": "+funcionario.getSalario());
        }   
        
    }
    
    public float totalFolha(){
        float folha = 0;
        for (Funcionario funcionario : funcionarios){
            folha+=funcionario.getSalario();
        }
        return folha;
    }
    
    public String maiorSalario(){
        int maior = 0;
        float salarioMaior = 0;
        for(int i = 0; i< funcionarios.size(); i++){
            if(funcionarios.get(i).getSalario()>salarioMaior){
                maior = i;
                salarioMaior = funcionarios.get(i).getSalario();
            }
        }
        return funcionarios.get(maior).getNome();
    }
    
    public void imprimeDepto(int depto){
        System.out.println("Segue os funcionarios do departamento "+depto);
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getDepartamento()==depto){
                System.out.println(funcionario.getNome()+": Salario de"+funcionario.getSalario());
            }
        }
    }
    
    public void imprimeFuncao(String funcao){
        System.out.println("Segue a lista de funcionarios cuja função é "+funcao);
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getFuncao().equals(funcao)){
                System.out.println(funcionario.getNome());
            }
        }
    }
    
    public void imprimeFolhaCrescente(){
        ArrayList<Funcionario> aux = new ArrayList();
        
        for (Funcionario funcionario : funcionarios) {
            for (int i = 0; i<aux.size();i++) {
                 if(funcionario.getSalario()>aux.get(i).getSalario()){
                     aux.add(i, funcionario);
                     break;
                 }
            }
            if(!aux.contains(funcionario)){
                aux.add(funcionario);
            }
        }
        
        System.out.println("Segue a lista de funcionarios por ordem crescente de salario.");
        for(Funcionario funcionario : aux){
            System.out.println(funcionario.getNome()+" - Salario: "+funcionario.getSalario());
        }
    }
}
