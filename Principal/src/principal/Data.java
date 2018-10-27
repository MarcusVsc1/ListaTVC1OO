/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author John
 */
public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public Data(int dia, int mes, int ano) {
        data = dia+"/"+mes+"/"+ano;
    }

    public Data(int dia, String mes, int ano) {
        data = dia+"-"+mes+"-"+ano;
    }

    public Data(int dia, String mes, String ano) {
        data = dia+" de "+mes+" de "+ano;
    }

    public Data(int dia, int ano) {
        data = dia+"o dia do ano "+ano;
    }

    
    
    public String getData() {
        return data;
    }
    
    
    
    
}
