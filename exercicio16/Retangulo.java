package exercicio16;

/**
 *
 * @author Marcus
 */
public class Retangulo {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        if(largura>0 && largura <20){
            System.out.println("Largura dentro dos parâmetros.");
        }else{
            System.out.println("Largura fora dos parâmetros.");
        }
        return largura;
    }

    public double getComprimento() {
        if(comprimento>0 && comprimento <20){
            System.out.println("Comprimento dentro dos parâmetros.");
        }else{
            System.out.println("Comprimento fora dos parâmetros.");
        }
        return comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
        if(largura>0 && largura <20){
            System.out.println("Largura dentro dos parâmetros.");
        }else{
            System.out.println("Largura fora dos parâmetros.");
        }
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
        if(comprimento>0 && comprimento <20){
            System.out.println("Comprimento dentro dos parâmetros.");
        }else{
            System.out.println("Comprimento fora dos parâmetros.");
        }
    }
    
    
}
