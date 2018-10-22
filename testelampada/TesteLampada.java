package testelampada;

/**
 *
 * @author Marcus
 */
public class TesteLampada {

    
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("Ligado");
        Lampada lampada2 = new Lampada("Meia-luz");
        lampada1.desligarLampada();
        lampada2.ligarLampada();
        if(lampada1.estaLigado()){
            System.out.println("Esta Lâmpada está ligada ou a meia luz");
        }else{
            System.out.println("Esta Lâmpada está desligada");
        }
        if(lampada2.estaLigado()){
            System.out.println("Esta Lâmpada está ligada ou a meia luz");
        }else{
            System.out.println("Esta Lâmpada está desligada");
        }
    }
    
}
