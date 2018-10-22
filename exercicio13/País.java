/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class País {
    private String nome;
    private String capital;
    private int km2;
    private ArrayList<País> fronteira;

    public País(String nome, String capital, int km2) {
        this.nome = nome;
        this.capital = capital;
        this.km2 = km2;
        fronteira = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public int getKm2() {
        return km2;
    }

    public ArrayList<País> getFronteira() {
        return fronteira;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setKm2(int km2) {
        this.km2 = km2;
    }

    public void setPaisFronteira(País país) {
       if(!this.equals(país)){
           fronteira.add(país);
       }
    }
    
    @Override
    public boolean equals(Object outro){
        if(outro instanceof País){
            País país = (País) outro;
            return(this.getNome().equals(país.nome) || this.getCapital().equals(país.getCapital()));
        }else{
            return false;
        }
    }
    
    public ArrayList<País> vizinhosComuns(País país){
        ArrayList vizinhos = new ArrayList();
        for(int i = 0; i<this.fronteira.size(); i++){ 
            for(int j = 0; j<país.fronteira.size(); j++){
                if(this.fronteira.get(i).equals(país.fronteira.get(i))){
                    vizinhos.add(this.fronteira.get(i));
                }
            }      
        }
        return vizinhos;
    }
    
}
