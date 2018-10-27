package exercicio18;

import java.util.Scanner;

/**
 *
 * @author Marcus
 */
public class JogoDaVelha {
    private char matrizJogo[][];
    private Jogador j1;
    private Jogador j2;

    public JogoDaVelha() {
        System.out.println("Jogador 1 - Digite seu nome.");
        Scanner n1 = new Scanner(System.in);
        System.out.println("Jogador 2 - Digite seu nome.");
        Scanner n2 = new Scanner(System.in);
        j1 = new Jogador(n1.nextLine(),'O');
        j2 = new Jogador(n2.nextLine(),'X');
        matrizJogo = new char[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matrizJogo[i][j] = '-';
            }
        }
    }
    
    public void mostrarJogo(){
        for(int i = 0; i<3; i++){
            System.out.println("["+matrizJogo[i][0]+"]["+matrizJogo[i][1]+"]["+matrizJogo[i][2]+"]");
        }
    }
    
    public void fazerJogada(Jogador j){
        System.out.println(j.getNome()+" : informe a sua jogada. Digite a linha e depois a coluna.");
        Scanner p1 = new Scanner(System.in);
        int posX = p1.nextInt();
        Scanner p2 = new Scanner(System.in);
        int posY = p1.nextInt();
        while(!verificaPosicao(posX, posY)){
            System.out.println("Posicao invalida ou ocupada! Digite novmente.");
            p1 = new Scanner(System.in);
            posX = p1.nextInt();
            p2 = new Scanner(System.in);
            posY = p1.nextInt();
        }
        matrizJogo[posX][posY]=j.getCarac();
    }
    
    public boolean verificaPosicao(int x, int y){
        return ((x>=0 && x<3) && (y>=0 && y<3) && matrizJogo[x][y]=='-');
    }
    
    public boolean verificaVencedor(char z){
        for(int i = 0; i<3;i++){
            if(matrizJogo[i][0]==z && matrizJogo[i][1]==z && matrizJogo[i][2]==z){
                return true;
            }
            if(matrizJogo[0][i]==z && matrizJogo[1][i]==z && matrizJogo[2][i]==z){
                return true;
            }     
        }
        if(matrizJogo[0][0]==z && matrizJogo[2][2]==z && matrizJogo[1][1]==z){
            return true;
        }
        if(matrizJogo[2][0]==z && matrizJogo[1][1]==z && matrizJogo[0][2]==z){
            return true;
        }
        return false;
    }
    
    public void iniciarJogo(){
        int i;
        for(i = 0; i<9; i++){
            fazerJogada(j1);
            mostrarJogo();
            if(verificaVencedor(j1.getCarac())){
                System.out.println("Fim de jogo! Jogador vencedor: "+j1.getNome());
                break;
            }
            i++;
            if(i==9){
            break;
            }
            fazerJogada(j2);
            mostrarJogo();
            if(verificaVencedor(j2.getCarac())){
                System.out.println("Fim de jogo! Jogador vencedor: "+j2.getNome());
                break;
            }
            
        }
        
        if(i==9){
            System.out.println("Fim de jogo! Empate!");
        }
        
        
        
        
    }
    
}
