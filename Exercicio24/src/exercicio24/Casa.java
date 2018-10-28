package exercicio24;

/**
 *
 * @author Marcus
 */
public class Casa extends Imovel {
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;

    public Casa(Porta porta1, Porta porta2, Porta porta3) {
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    
    

    @Override
    public void pinta(String s) {
        cor = s;
    }

    @Override
    public int totalDePortas() {
        return 3;
    }

    @Override
    public int quantasPortasEstaoAbertas() {
        return (porta1.estaAberta() ? 1 : 0) + (porta2.estaAberta() ? 1 : 0) + (porta3.estaAberta() ? 1 : 0);
    }
    
}
