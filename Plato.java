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
public class Plato {
    private String nombre;
    
    private ArrayList<Ingrediente> IngredientesEnPlato;
    
    public Plato(String nombre, ArrayList<Ingrediente> IngredientesEnPlato){
        this.nombre=nombre;
        this.IngredientesEnPlato = IngredientesEnPlato;
    }
    
    public Plato(String nombre){
        this.nombre=nombre;
        IngredientesEnPlato = new ArrayList<>(1000);
    }
    
    public Plato(){
        IngredientesEnPlato = new ArrayList<>(1000);
        nombre = "Plato sin nombre";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getIngredientesEnPlato() {
        return IngredientesEnPlato;
    }

    public void setIngredientesEnPlato(ArrayList<Ingrediente> IngredientesEnPlato) {
        this.IngredientesEnPlato = IngredientesEnPlato;
    }
    
    public void AddIngrediente(String Pingrediente){
        IngredientesEnPlato.add(new Ingrediente(Pingrediente));
    }
   
   
}
