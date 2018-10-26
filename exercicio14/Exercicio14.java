
package exercicio14;

/**
 *
 * @author Marcus
 */
public class Exercicio14 {

    
    public static void main(String[] args) {
        SetorPessoal rh = new SetorPessoal();
        rh.adicionaFuncionario(new Funcionario(201776013,"Joseph Stalin",5,4860,"Comunista"));
        rh.adicionaFuncionario(new Funcionario(201796013,"Mister M",3,20587,"Ilusionista"));
        rh.adicionaFuncionario(new Funcionario(201796913,"Lenny Face",1,15832,"Almoxarife"));
        rh.imprimeFolha();
        rh.imprimeFolhaCrescente();
    }
    
}
