package app;

import enums.Cargo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import enums.Genero;
import models.Funcionario;
import java.awt.*;


public class ProjetoFarmaciaApp extends Application {

    @Override
    public void start(Stage pStage) throws Exception {
        pStage.setTitle("Projeto Farmacia");
        Button botao = new Button("Ok");
        botao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Teste");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(botao);
        pStage.setScene(new Scene(root,1280,720));
        pStage.show();
    }



    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello, World!");
        Cargo cargo = Cargo.ALMOXARIFE;
        System.out.println("Eu trabalho como: " + cargo); // teste de retorno do ENUM cargo já formatado graças a classe "FormatarTexto".

        Funcionario f1 = new Funcionario("Marcos", 1, 22, Genero.MASCULINO, Cargo.GERENTE, 1400, null);
        System.out.println(f1.toString());
    }
}