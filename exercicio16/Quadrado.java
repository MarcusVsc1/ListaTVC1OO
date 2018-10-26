package exercicio16;

import static java.lang.Math.pow;

/**
 *
 * @author Marcus
 */
public class Quadrado {
    private double lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
    
    public double calcularArea(){
        return pow(lado,2);
    }
    
    public double calcularPerimetro(){
        return lado*4;
    }
}
