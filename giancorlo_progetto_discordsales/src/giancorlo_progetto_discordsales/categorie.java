/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giancorlo_progetto_discordsales;

import java.util.ArrayList;

/**
 *
 * @author super
 */
public class categorie {
    private String nome;
    private ArrayList<chat>chat;
    
    public categorie(String nome){
     this.nome=nome;
    }
     public String getNome(){
        return nome;
     }
     public void setNome(String nome){
         this.nome=nome;
    }
     public void aggiungi_chat(String nome){
         chat a=new chat(nome);
         
     }
    
}
