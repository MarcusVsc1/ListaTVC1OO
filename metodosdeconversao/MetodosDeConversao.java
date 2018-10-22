
package metodosdeconversao;

/**
 *
 * @author Marcus
 */
public class MetodosDeConversao {

   
    public static void main(String[] args) {
        System.out.println("Campo de futebol possui 8250 m².");
        System.out.println("Em pés fica "+ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(8250));
        System.out.println("Em centímetros quadrados fica "+ConversaoDeUnidadesDeArea.PeQuadradoParaCmQuadrado(ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(8250)));
        System.out.println("Em acres fica "+ConversaoDeUnidadesDeArea.peQuadradoParaAcre(ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(8250)));
        
    }
    
}
