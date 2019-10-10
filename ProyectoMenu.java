package menu;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 *
 * @author estudiante
 */
public class ProyectoMenu extends Application {
    
//    ArrayList<Menu> menu= new ArrayList();
    
    @Override
    public void start(Stage primaryStage) {
        
        ArrayList<Ingrediente> Plato1Ing = new ArrayList<>();
        Plato1Ing.add(new Ingrediente("Yuca"));
        Plato1Ing.add(new Ingrediente("Ajo"));
        Plato1Ing.add(new Ingrediente("Cebolla"));
        Plato1Ing.add(new Ingrediente("Perejil"));
        Plato1Ing.add(new Ingrediente("Zumo de limon"));
        Plato Plato1 = new Plato("Yuca con Mojo",Plato1Ing);
        
        ArrayList<Ingrediente> Plato2Ing = new ArrayList<>();
        Plato2Ing.add(new Ingrediente("Vianda"));
        Plato2Ing.add(new Ingrediente("Carne"));
        Plato2Ing.add(new Ingrediente("Vegetales"));
        Plato2Ing.add(new Ingrediente("Especias"));
        Plato Plato2 = new Plato("Caldosa",Plato2Ing);
        
        ArrayList<Ingrediente> Plato3Ing = new ArrayList<>();
        Plato3Ing.add(new Ingrediente("Rabo de buey."));
        Plato3Ing.add(new Ingrediente("Cebolla"));
        Plato3Ing.add(new Ingrediente("Perejil"));
        Plato3Ing.add(new Ingrediente("Oregano"));
        Plato3Ing.add(new Ingrediente("Salsa de Tomate"));
        Plato3Ing.add(new Ingrediente("Aji"));
        Plato Plato3 = new Plato("Rabo Encendido",Plato3Ing);
        
        ArrayList<Ingrediente> Plato4Ing = new ArrayList<>();
        Plato4Ing.add(new Ingrediente("Frijoles negros"));
        Plato4Ing.add(new Ingrediente("Cebolla"));
        Plato4Ing.add(new Ingrediente("Ajo"));
        Plato4Ing.add(new Ingrediente("Pimiento"));
        Plato4Ing.add(new Ingrediente("Laurel"));
        Plato4Ing.add(new Ingrediente("Caldo"));
        Plato Plato4 = new Plato("Congri",Plato4Ing);
        
        ArrayList<Ingrediente> Plato5Ing = new ArrayList<>();
        Plato5Ing.add(new Ingrediente("Tomate"));
        Plato5Ing.add(new Ingrediente("Lechuga"));
        Plato5Ing.add(new Ingrediente("Zanahoria"));
        Plato5Ing.add(new Ingrediente("Mayonesa"));
        Plato5Ing.add(new Ingrediente("Carne de cerdo"));
        Plato5Ing.add(new Ingrediente("Jamon de pierna"));
        Plato5Ing.add(new Ingrediente("Pan tostado"));
        Plato5Ing.add(new Ingrediente("Queso"));
        Plato Plato5 = new Plato("Sandwich",Plato5Ing);
        
        ArrayList<Ingrediente> Plato6Ing = new ArrayList<>();
        Plato6Ing.add(new Ingrediente("Pollo"));
        Plato6Ing.add(new Ingrediente("Arroz"));
        Plato6Ing.add(new Ingrediente("Papa"));
        Plato6Ing.add(new Ingrediente("Tomate"));
        Plato6Ing.add(new Ingrediente("Pimiento"));
        Plato6Ing.add(new Ingrediente("Zanahoria"));
        Plato Plato6 = new Plato("Aguado de Gallina",Plato6Ing);
                
        ArrayList<Ingrediente> Plato7Ing = new ArrayList<>();
        Plato7Ing.add(new Ingrediente("Arroz"));
        Plato7Ing.add(new Ingrediente("Cebolla"));
        Plato7Ing.add(new Ingrediente("Pimiento"));
        Plato7Ing.add(new Ingrediente("Ajo"));
        Plato7Ing.add(new Ingrediente("Carne asada"));
        Plato Plato7 = new Plato("Arroz con Menestra",Plato7Ing);
        
        ArrayList<Ingrediente> Plato8Ing = new ArrayList<>();
        Plato8Ing.add(new Ingrediente("Camaron"));
        Plato8Ing.add(new Ingrediente("Arroz"));
        Plato Plato8 = new Plato("Arroz con Camarones",Plato8Ing);
        
        ArrayList<Ingrediente> Plato9Ing = new ArrayList<>();
        Plato9Ing.add(new Ingrediente("Ajo"));
        Plato9Ing.add(new Ingrediente("Cebolla"));
        Plato9Ing.add(new Ingrediente("Achiote"));
        Plato9Ing.add(new Ingrediente("Carne"));
        Plato Plato9 = new Plato("Carne Colorada",Plato9Ing);
        
        ArrayList<Ingrediente> Plato10Ing = new ArrayList<>();
        Plato10Ing.add(new Ingrediente("Ajo"));
        Plato10Ing.add(new Ingrediente("Comino"));
        Plato10Ing.add(new Ingrediente("Cebolla"));
        Plato10Ing.add(new Ingrediente("Chalote"));
        Plato10Ing.add(new Ingrediente("Carne de cerdo"));
        Plato Plato10 = new Plato("Fritada",Plato10Ing);

        ArrayList<Plato> platos = new ArrayList<>();
        platos.add(Plato1);
        platos.add(Plato2);
        platos.add(Plato3);
        platos.add(Plato4);
        platos.add(Plato5);
        platos.add(Plato6);
        platos.add(Plato7);
        platos.add(Plato8);
        platos.add(Plato9);
        platos.add(Plato10);    
        
        Menu menu = new Menu(platos);
        
        //System.out.println(menu.ImprimirMenosIngredientesUsados());
        //System.out.println(menu.ImprimirPlatoConMasIngredientes());
        //System.out.println(menu.ImprimirReporteMenu());
        
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setMinSize(300, 300);
        
        ObservableList<String> listaPlatos = FXCollections.observableArrayList();
        for(int i=0; i<menu.getPlatos().size();i++)
            listaPlatos.add(menu.getPlatos().get(i).getNombre());
        
        ObservableList<String> listaIngredientes = FXCollections.observableArrayList();
        ArrayList <Ingrediente> ing= menu.IngredientesArray();
        for(int i=0; i<ing.size();i++)
            listaIngredientes.add(ing.get(i).getIngrediente());
        
        ComboBox cPlatos= new ComboBox(listaPlatos);
        ComboBox cIngredientes = new ComboBox(listaIngredientes);
        Button bConfirmarPlato = new Button("Confirmar Plato");
        Button bConfirmarIngrediente = new Button("Confirmar Ingrediente");
        Button bImprimirMenosUsado = new Button("Imprimir Ingrediente Menos Usado");
        Button bImprimirPlatoMas = new Button("Imprimir Plato Con Mas Ingredientes");
        Button bReporteOrdenado = new Button("Reporte Ordenado Platos");
        
        bConfirmarPlato.disableProperty().set(true);
        bConfirmarIngrediente.disableProperty().set(true);
        
 
        grid.add(new Label("Seleccione un plato para obtener sus ingredientes"),0,0);
        grid.add(cPlatos, 0, 1);
        grid.add(new Label("Seleccione un ingrediente para obtener los platos que lo contienen:"),0,2);
        grid.add(cIngredientes, 0, 3);
        grid.add(bConfirmarPlato,1,1);
        grid.add(bConfirmarIngrediente,1,3);
        grid.add(bImprimirMenosUsado, 0,4);
        grid.add(bImprimirPlatoMas,1,4);
        grid.add(bReporteOrdenado,0,5);
        
        cPlatos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                bConfirmarPlato.disableProperty().set(false);
            }
            
        }  );
        
        cIngredientes.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                bConfirmarIngrediente.disableProperty().set(false);
            }
            
        });
        
        bConfirmarPlato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                GridPane gridIngredientes = new GridPane();
                gridIngredientes.getChildren().add(new Text("Ingredientes del Plato"));
                TextArea taingredientes = new TextArea();
                taingredientes.setText(menu.ImprimirIngredientes(cPlatos.getValue().toString()));
                gridIngredientes.add(taingredientes, 0,1);
                
                Scene dialogScene = new Scene(gridIngredientes);
                dialog.setScene(dialogScene);
                dialog.show();
                //System.out.println(menu.ImprimirIngredientes(cPlatos.getValue().toString()));
                
            }
        });
        
        bConfirmarIngrediente.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                GridPane gridPlatos = new GridPane();
                gridPlatos.getChildren().add(new Text("Los platos que contienen este ingrediente:"));
                TextArea taPlatos = new TextArea();
//                TextArea taMenosUsados = new TextArea();
                taPlatos.setText(menu.ImprimirPlatos(cIngredientes.getValue().toString()));
//                taMenosUsados.setText(menu.ImprimirMenosIngredientesUsados());
                
                gridPlatos.add(taPlatos, 0,1);
//                gridPlatos.add(taMenosUsados, 1,1);
                
                Scene dialogScene = new Scene(gridPlatos);
                dialog.setScene(dialogScene);
                dialog.show();
               // System.out.println(menu.ImprimirIngredientes(cPlatos.getValue().toString()));
                
            }
        });
        
        bImprimirMenosUsado.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                GridPane gridMenosUsados = new GridPane();
                gridMenosUsados.getChildren().add(new Text("Ingredientes Menos Usados"));
                TextArea taMenosUsados = new TextArea();
                taMenosUsados.setPrefSize(900, 200);
                taMenosUsados.setText(menu.ImprimirMenosIngredientesUsados());
                gridMenosUsados.add(taMenosUsados, 0,1);
                
                Scene dialogScene = new Scene(gridMenosUsados);
                dialog.setScene(dialogScene);
                dialog.show();
                //System.out.println(menu.ImprimirIngredientes(cPlatos.getValue().toString()));
                
            }
        });
        
            bImprimirPlatoMas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                GridPane gridPlatoMas = new GridPane();
                gridPlatoMas.setPrefSize(500, 100);
                gridPlatoMas.getChildren().add(new Text("Plato con Ingredientes"));
                TextArea taPlatoMas = new TextArea();
                taPlatoMas.setText(menu.ImprimirPlatoConMasIngredientes());
                gridPlatoMas.add(taPlatoMas, 0,1);
                
                Scene dialogScene = new Scene(gridPlatoMas);
                dialog.setScene(dialogScene);
                dialog.show();
                //System.out.println(menu.ImprimirIngredientes(cPlatos.getValue().toString()));
                
            }
        });
            
            bReporteOrdenado.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                GridPane gridReporte = new GridPane();
                gridReporte.getChildren().add(new Text("Platos en Orden"));
                TextArea taReporte = new TextArea();
                taReporte.setPrefSize(900, 400);
                taReporte.setText(menu.ImprimirReporteMenu());
                gridReporte.add(taReporte, 0,1);
                
                Scene dialogScene = new Scene(gridReporte);
                dialog.setScene(dialogScene);
                dialog.show();
                
            }
        });
        
        Scene scene = new Scene(grid, 600, 300);
        
        primaryStage.setTitle("Bienvenido al Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
