/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;

/**
 *
 * @author Tin Leon
 */
public class Ingrediente {
    private String ingrediente;
    
    public Ingrediente(String ingrediente){
        this.ingrediente=ingrediente;
    }
    public Ingrediente(){}
    
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }   
    
}
