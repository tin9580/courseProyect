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
public class Menu {

    private ArrayList<Plato> platos;

    public Menu(ArrayList<Plato> platos) {
        Plato platoTemp;
            for(int i=0; i<platos.size()-1;i++){//bubble sort
                for(int j=platos.size()-1; j>i ;j--){
                    if(platos.get(j).getNombre().compareTo(platos.get(j-1).getNombre()) < 0){
                      platoTemp = platos.get(j);
                      platos.set(j, platos.get(j-1));
                      platos.set(j-1, platoTemp);
                    }
                }
            }
        this.platos = platos;
    }
    
    public Menu(){
        platos = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
       Plato platoTemp;
            for(int i=0; i<platos.size()-1;i++){//bubble sort
                for(int j=platos.size()-1; j>i ;j--){
                    if(platos.get(j).getNombre().compareTo(platos.get(j-1).getNombre()) < 0){
                      platoTemp = platos.get(j);
                      platos.set(j, platos.get(j-1));
                      platos.set(j-1, platoTemp);
                    }
                }
            }
        this.platos = platos;
    }
    

    /***
     * Dado el nombre de un plato conocer sus ingredientes. 
     * @param Nplato, nombre a buscar
     * @return ArrayList de Ingredientes
     */
    private ArrayList<Ingrediente> Ingredientes(String Nplato){
        int index = BuscarPlatoPos(Nplato); 
        if(index != -1){
            return platos.get(index).getIngredientesEnPlato();
        }
        return null;
    }
    
    /**
     * Dado el nombre de un plato conocer sus ingredientes. a)
     * @param Nplato
     * @return String de ingredientes
     */
    public String ImprimirIngredientes(String Nplato){
        String str ="";
        ArrayList<Ingrediente> Pingredientes = Ingredientes(Nplato);
        if(!Pingredientes.isEmpty()){
            str = str+"Plato : "+Nplato +" - tiene: ";
            for(int i =0; i<Pingredientes.size() ; i++){
                str = str + Pingredientes.get(i).getIngrediente()+" ";
            }
        }
        return str;
    }
    
    /***
     * Dado un ingrediente conocer en cuáles platos él forma parte
     * @param ingrediente, nombre a buscar
     * @return ArrayList de Platos
     */
    private ArrayList<Plato> Platos(String ingrediente){
        ArrayList <Integer> posiciones = BuscarIngredientePos(ingrediente);//posiciones en las que se encuentra el plato
        ArrayList <Plato> PlatosConIngrediente = new ArrayList<>();
        
        for(int i =0; i < posiciones.size();i++)//añade el objeto ingrediente encontrado
            PlatosConIngrediente.add(platos.get(posiciones.get(i)));
        
        return PlatosConIngrediente;
    }
    
    /**
     * Dado un ingrediente conocer en cuáles platos él forma parte b)
     * @param ingrediente, nombre a buscar
     * @return de platos
     */
    public String ImprimirPlatos(String ingrediente){
        String str = "";
        ArrayList <Plato> Pplatos = Platos(ingrediente);
        if(!Pplatos.isEmpty()){
            str= str+"El ingrediente: "+ ingrediente+ " - se encuentra en : ";
            for(int i =0; i< Pplatos.size() ; i++){
                str = str + Pplatos.get(i).getNombre()+" ";
            }
        }
        return str;
    }
    
    /***
     * Busca la posicion del plato dentro del menu
     * @param NombrePlato
     * @return posicion
     */
    private int BuscarPlatoPos(String NombrePlato){
        int pos=-1;
        for(int i =0; i< platos.size();i++){
            if(NombrePlato.equals(platos.get(i).getNombre()))
                pos=i;
        }
        return pos;
    }
    
    /***
     * Busca la posicion del ingrediente dentro del menu
     * Se lo puede entender como un arreglo de posiciones 
     * que se encuentra en una matriz plato vs ingrediente.
     * @param NombreIngrediente
     * @return posicion ArrayList
     */
    private ArrayList<Integer> BuscarIngredientePos(String NombreIngrediente){
        ArrayList<Integer> posiciones= new ArrayList<>();
        ArrayList<Ingrediente> pingredientes = new ArrayList<>();
        for(int i =0; i< platos.size();i++){
            pingredientes = platos.get(i).getIngredientesEnPlato();
            for(int j=0; j <pingredientes.size();j++)
                if(NombreIngrediente.equals(pingredientes.get(j).getIngrediente())){
                    posiciones.add(i);
                }
        }
        return posiciones;
    }
    
    /***
     * El (los) ingrediente que menos se usa.
     * @return ArrayList de Ingrediente(s)
     */
    private ArrayList<Ingrediente> MenosIngredientesUsados(){
        ArrayList<Ingrediente> totalIngredientes = IngredientesArray();//ver definicion de funcion
        ArrayList<Integer> cantidadIngredientes = CantidadIngredientes(totalIngredientes);
        ArrayList<Ingrediente> menorIngrediente = new ArrayList<>();
        int menor=Integer.MAX_VALUE;
        for(int i =0; i< cantidadIngredientes.size();i++){
            if(menor> cantidadIngredientes.get(i)){
                menor = cantidadIngredientes.get(i);
            }
        }
        for(int i =0; i< cantidadIngredientes.size();i++){
            if(menor == cantidadIngredientes.get(i)){//por arreglos paralelos
                menorIngrediente.add(totalIngredientes.get(i));
            }
        }
        return menorIngrediente;
    }
    
    /**
     * El (los) ingrediente que menos se usa. c)
     * @return String
     */
    public String ImprimirMenosIngredientesUsados(){
        String str ="";
        ArrayList<Ingrediente> menosIngredientes = MenosIngredientesUsados();
        if(!menosIngredientes.isEmpty()){
            str = str + "El (los) ingrediente que menos se usa : -";
                for(int i =0; i<menosIngredientes.size();i++){
                    str = str+ menosIngredientes.get(i).getIngrediente()+" -";
                }
        }
        return str;
    }
    
    /***
     * El total de ingredientes que hay en el menu, sin repeticion
     * @return ArrayList de ingredientes
     */
    public ArrayList<Ingrediente> IngredientesArray(){
        ArrayList<Ingrediente> ingredientesTotal = new ArrayList<>();
        for(int i =0; i< platos.size();i++){//por cada plato
            for(int j=0; j < platos.get(i).getIngredientesEnPlato().size();j++){//por cada ingrediente en el plato
                ingredientesTotal.add(platos.get(i).getIngredientesEnPlato().get(j));                
                if(ingredientesTotal.size()==0)//para primer elemento
                    ingredientesTotal.add(platos.get(i).getIngredientesEnPlato().get(j));
            }
        }
        

        for(int j=ingredientesTotal.size()-1; j>0 ; j--){//borra repetidos
            
            for(int i =0; i<ingredientesTotal.size(); i++)
                if(j!=i)
                    if(ingredientesTotal.get(i).getIngrediente().equals(ingredientesTotal.get(j).getIngrediente())){
                        ingredientesTotal.remove(j);
                    }
        }
        return ingredientesTotal;
    }
    
    /***
     * Devuelve un arreglo de la cantidad de ingredientes que hay en el menu
     * en paralelo con IngredientesArray().
     * @param ingredientesTotal ArrayList de todos los ingredientes sin repetir
     * Ejemplo, IngredientesArray() es {IngredienteA, B, C, ...}
     * CantidadIngredientes() es {10, 3, 5, ...}
     * hay 10 A, 3 B, 5 C, etc.
     * @return 
     */
    private ArrayList<Integer> CantidadIngredientes(ArrayList<Ingrediente> ingredientesTotal){
        ArrayList<Integer> cantidadIngredientes = new ArrayList<>();
        String ingredienteTotalSTR;
        ArrayList<Ingrediente> IngredientesEnPlatoArray = new ArrayList<>();
        int count;
        for(int i =0; i < ingredientesTotal.size();i++){//para cada ingrediente de mi ingredientestotal
            ingredienteTotalSTR = ingredientesTotal.get(i).getIngrediente();//guarda nombre del ingrediente
            count=0;//inicializo contador
            for(int j =0; j < platos.size();j++){//busco en cada plato
                IngredientesEnPlatoArray = platos.get(j).getIngredientesEnPlato();
                for(int k=0; k<platos.get(j).getIngredientesEnPlato().size();k++){//en cada ingrediente del plato en el menu
                    if(ingredienteTotalSTR.equals(IngredientesEnPlatoArray.get(k).getIngrediente())){//si es el mismo
                        count++;
                    }
                }
            }
            cantidadIngredientes.add(count);//para cada ingrediente a buscar
        }
        return cantidadIngredientes;
    }
    
    /**
     * El (los) nombre del plato que más ingredientes lleva d)
     * @return String
     */
    public String ImprimirPlatoConMasIngredientes(){
        String str = "";
        int mayorTemp;
        int mayor= Integer.MIN_VALUE;
        for(int i =0; i< platos.size();i++){
            mayorTemp=platos.get(i).getIngredientesEnPlato().size(); 
            if(mayorTemp > mayor)
                mayor = mayorTemp;
        }
        str=str+"El/Los plato con mas ingredientes : -";
        for(int i =0; i< platos.size();i++){
            if(platos.get(i).getIngredientesEnPlato().size()== mayor)
                str = str+ platos.get(i).getNombre()+" -";
        }
        return str;
    }
    
    /**
     * Reporte ordenado de los ingredientes que lleva cada plato y su nombre e)
     * @return String
     */
    public String ImprimirReporteMenu(){
        String str = "";
        ArrayList<Ingrediente> ingredientesEnPlatoArray;
        for(int i =0; i< platos.size();i++){
            str=str+"Plato : "+platos.get(i).getNombre()+" tiene los ingredientes: ";
            ingredientesEnPlatoArray=platos.get(i).getIngredientesEnPlato();
            for(int j =0; j<ingredientesEnPlatoArray.size();j++)
                str = str + ingredientesEnPlatoArray.get(j).getIngrediente()+ ", ";
            str= str+"\n";
        }
        return str;
    }
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
                Plato Plato3 = new Plato("Cafe");//cafe
                        Plato Plato5 = new Plato("Fanesca");//Fanesca
                       Plato Plato4 = new Plato("Lasagna");//lasgna
        Plato Plato1 = new Plato("Locro");//locro
        Plato Plato2 = new Plato("Sanduche");//sanduche


        
        Plato1.AddIngrediente("Papa");
        Plato1.AddIngrediente("Queso");
        Plato1.AddIngrediente("Leche");
        
        Plato2.AddIngrediente("Queso");
        Plato2.AddIngrediente("Aguacate");
        Plato2.AddIngrediente("Pan");
        Plato2.AddIngrediente("Lechuga");
        
        Plato3.AddIngrediente("Agua");
        Plato3.AddIngrediente("Cafe");
        Plato3.AddIngrediente("Azucar");
        
        Plato4.AddIngrediente("Queso");
        Plato4.AddIngrediente("Carne");
        Plato4.AddIngrediente("Fideo");
        Plato4.AddIngrediente("Pasta");
        
        Plato5.AddIngrediente("Leche");
        Plato5.AddIngrediente("Choclo");
        Plato5.AddIngrediente("Mani");
        
        ArrayList<Plato> platos = new ArrayList<>();
        platos.add(Plato3);
        platos.add(Plato5);
        platos.add(Plato4);
        platos.add(Plato1);
        platos.add(Plato2);
        
        Menu menu = new Menu(platos);
        
        //System.out.println(menu.ImprimirIngredientes("Cafe"));
        //System.out.println(menu.ImprimirPlatos("Queso"));
        //System.out.println(menu.ImprimirMenosIngredientesUsados());
        //System.out.println(menu.ImprimirPlatoConMasIngredientes());
        System.out.println(menu.ImprimirReporteMenu());
    }*/
    
}
