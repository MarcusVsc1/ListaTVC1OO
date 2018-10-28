package exercicio23;

/**
 *
 * @author Marcus
 */
public class Notas {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;

    public Notas(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public void cal_media(){
        media = (nota1 + nota2 + nota3)/3;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public float getMedia() {
        return media;
    }
    
    
}
