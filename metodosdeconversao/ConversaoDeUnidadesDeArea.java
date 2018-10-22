package metodosdeconversao;

import java.text.DecimalFormat;

/**
 *
 * @author Marcus
 */
public class ConversaoDeUnidadesDeArea {
    static DecimalFormat df = new DecimalFormat("0.##");

    
    public static double metroQuadradoParaPeQuadrado(double m2){
        return m2*10.76;
    }
    
    public static double PeQuadradoParaCmQuadrado(double pe2){
        return pe2*929;
    }
    
    public static double milhaQuadradaParaAcre(double mi2){
        return mi2*640;
    }
    
    public static double acreParaPeQuadrado(double ac){
        
        return ac*43560;
    }
    
    public static String peQuadradoParaAcre(double pe){
        String dx = df.format(pe/43560);
        return dx;
    }
}
