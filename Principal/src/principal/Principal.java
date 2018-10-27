package principal;

/**
 *
 * @author Marcus
 */
public class Principal {

    
    public static void main(String[] args) {
        Data d1 = new Data(14,9,1991);
        Data d2 = new Data(26,"out",1992);
        Prontuario p1 = new Prontuario("Marcus",d1,77, (float) 1.9);
        Prontuario p2 = new Prontuario("Raphael",d2,56, (float) 1.8);
        Prontuario p3 = new Prontuario("Gabriel",d2,65, (float) 1.8);
        Prontuario p4 = new Prontuario("Maria",new Data(1,"Junho","Mil Novecentos e Sessenta e Cinco"),52, (float) 1.75);
        p1.imprimeProntuario();
        p2.imprimeProntuario();
        p3.imprimeProntuario();
        p4.imprimeProntuario();
        p1.preDiagnosticar();
        p2.preDiagnosticar();
        p3.preDiagnosticar();
        p4.preDiagnosticar();
    }
    
}
