package exercicio22;

/**
 *
 * @author Marcus
 */
public class Funcionario {
    private String matricula;
    private String nome;
    private int idade;
    private String cargo;
    private double salario;

    public Funcionario() {
        salario = 1500;
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimeInfo(){
        System.out.println("Segue dados do funcionario.");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
        System.out.println("Matricula: "+matricula);
    }
    
}
