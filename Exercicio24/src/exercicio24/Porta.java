package exercicio24;

/**
 *
 * @author Marcus
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaoX;
    private float domensaoY;
    private float dimensaoZ;

    public Porta(boolean aberta, String cor, float dimensaoX, float domensaoY, float dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.domensaoY = domensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    
    
    
    public boolean estaAberta(){
        return aberta;
    }
    
    public void abre(){
        if(!aberta){
            System.out.println("A porta foi aberta");
            aberta = true;
        }else{
            System.out.println("A porta ja esta aberta!");
        }
    }
    
    public void fecha(){
        if(!aberta){
            System.out.println("A porta foi fechada!");
            aberta = true;
        }else{
            System.out.println("A porta ja esta fechada!");
            aberta = false;
        }
    }
    
    public void pinta(String s){
        cor = s;
    }
}
