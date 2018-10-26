package exercicio18;

/**
 *
 * @author Marcus
 */
public class JogoDaVelha {
    private int matrizJogo[][];

    public JogoDaVelha() {
        matrizJogo = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matrizJogo[i][j] = 0;
            }
        }
    }

    
    
}
