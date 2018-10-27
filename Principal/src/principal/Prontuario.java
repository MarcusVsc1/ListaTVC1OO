package principal;

import java.text.DecimalFormat;


/**
 *
 * @author Marcus
 */
public class Prontuario {
    private String nome;
    private Data nascimento;
    private float peso;
    private float altura;

    public Prontuario(String nome, Data nascimento, float peso, float altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.peso = peso;
        this.altura = altura;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void imprimeProntuario(){
        System.out.println("Segue dados do prontuario");
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+nascimento.getData());
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
    
    public void preDiagnosticar(){
        DecimalFormat df = new DecimalFormat("0.#");
        float imc = peso / (altura*altura);
        String imcConvertido = df.format(imc);
        System.out.println("Seu IMC e "+imcConvertido);
        if(imc<18.5){
            System.out.println("Voce esta abaixo do peso ideal");
        }else{
            if(imc<=24.9){
                System.out.println("Voce esta no seu peso ideal");
            }else{
                if(imc<=29.9){
                    System.out.println("Voce esta abaixo com sobrepeso");
                }else{
                    if(imc<=34){
                        System.out.println("Obesidade Grau I");
                    }else{
                        if(imc<=39.9){
                            System.out.println("Obesidade Grau II");
                        }else{
                            System.out.println("Obesidade Morbida");
                        }
                    }
                }
            }
        }
    }
    
}
