package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.PAPAYAWHIP);
        gc.fillRect(0, 0, 300, 300);
        root.getChildren().addAll(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
