package exercicio16;

/**
 *
 * @author Marcus
 */
public class Exercicio16 {

    
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(7);
        Quadrado q3 = new Quadrado(10);
        System.out.println("Area do quadrado 1: "+q1.calcularArea());
        System.out.println("Perimetro do quadrado 1: "+q1.calcularPerimetro());
        System.out.println("Area do quadrado 1: "+q2.calcularArea());
        System.out.println("Perimetro do quadrado 1: "+q2.calcularPerimetro());
        System.out.println("Area do quadrado 1: "+q3.calcularArea());
        System.out.println("Perimetro do quadrado 1: "+q3.calcularPerimetro());
        
        Retangulo r1 = new Retangulo(3,6);
        Retangulo r2 = new Retangulo(3,2);
        r2.getComprimento();
        r1.setComprimento(30);
        r2.setLargura(21);
        
    }
    
}
