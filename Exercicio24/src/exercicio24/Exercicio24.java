package exercicio24;

/**
 *
 * @author Marcus
 */
public class Exercicio24 {


    public static void main(String[] args) {
        Porta p1 = new Porta(false,"Fucsia",30,40,15);
        Porta p2 = new Porta(true,"Azul Meia Noite",20,10,45);
        Porta p3 = new Porta(false,"Amarelo Gema",60,10,15);
        Casa casa = new Casa(p1,p2,p3);
        casa.porta1.abre();
        casa.pinta("Azul Turquesa");
        System.out.println("A casa tem a cor "+casa.cor);
        Edificio edificio = new Edificio("Roxo");
        edificio.adicionaAndar();
        edificio.adicionaAndar();
        edificio.adicionaAndar();
        System.out.println("O eidificio tem "+edificio.totalDeAndares()+" andares");
        edificio.adicionaPorta(p3);
        System.out.println("O eidificio tem "+edificio.portas.size()+" portas");
        System.out.println("O eidificio tem "+edificio.quantasPortasEstaoAbertas()+" portas abertas");
        edificio.portas.get(0).fecha();
        System.out.println("O eidificio tem "+edificio.quantasPortasEstaoAbertas()+" portas abertas");
    }
    
    
}
