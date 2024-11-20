package es.ieslosmontecillos.democontroles;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
        VBox vb = new VBox();
        Scene scene = new Scene(root, 320, 240);

        MiControl miControl = new MiControl();

        Label lbl =new Label("Hello World");
        miControl.setOnAction(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lbl.setText(lbl.getText() + "a");
            }
        });

        vb.getChildren().addAll(miControl, lbl);
        root.getChildren().add(vb);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}