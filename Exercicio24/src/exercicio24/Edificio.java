package exercicio24;

import java.util.ArrayList;

/**
 *
 * @author Marcus
 */
public class Edificio extends Imovel {
    private int totalDeAndares;
    ArrayList<Porta> portas;

    public Edificio(String cor) {
        this.cor = cor;
        totalDeAndares = 0;
        portas = new ArrayList();
    }

    
    
    @Override
    public void pinta(String s) {
        cor = s;
    }

    @Override
    public int totalDePortas() {
        return portas.size();
    }

    @Override
    public int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;
        for(Porta porta : portas){
            portasAbertas = portasAbertas + (porta.estaAberta() ? 1 : 0);
        }
        return portasAbertas;
    }
    
    public void adicionaPorta(Porta porta){
        portas.add(porta);
    }
    
    public void adicionaAndar(){
        totalDeAndares++;
    }
    
    public int totalDeAndares(){
        return totalDeAndares;
    }
}
