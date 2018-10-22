package testelampada;

/**
 *
 * @author Marcus
 */
public class Lampada {
    private String estado;

    public Lampada(String estado) {
        this.estado = estado;
    }
    
    
    public boolean estaLigado(){
        return estado.equals("Ligado") || estado.equals("Meia-luz");
    }
    
    
    public void ligarLampada(){
        if(estado.equals("Desligado")){
            System.out.println("Lâmpada está em meia-luz agora.");
            estado = "Meia-luz";
        }else{
        if(estado.equals("Meia-luz")){
            System.out.println("Lâmpada foi ligada agora.");
            estado = "Ligado";
        }else{
        if(estado.equals("Ligado")){
            System.out.println("Lâmpada já está ligada!");
            }
        }
        }
    }
    
    public void desligarLampada(){
        if(estado.equals("Desligado")){
            System.out.println("Lâmpada já está desligada!");
        }
        if(estado.equals("Meia-luz")){
            System.out.println("Lâmpada foi desligada agora.");
            estado = "Desligado";
        }
        if(estado.equals("Ligado")){
            System.out.println("Lâmpada está em meia-luz agora.");
            estado = "Meia-luz";
        }
    }
}
