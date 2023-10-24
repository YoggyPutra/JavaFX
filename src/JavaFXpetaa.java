/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.shape.*;
/**
 *
 * @author ASUS
 */
public class JavaFXpetaa extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
        Pane root = new Pane();
        primaryStage.setTitle("PETA ITS");
        primaryStage.setWidth(750);
        primaryStage.setHeight(575);
        Scene scene = new Scene(new Group());

        
        final ImageView selectedImage = new ImageView();
        Image backgroundImage = new Image(new FileInputStream("D:\\AlunJember.PNG"));
        selectedImage.setImage(backgroundImage);
        
        Rectangle hover = creaRectangle (270, 250, 100, 100, Color.TRANSPARENT, true);
        Rectangle content = creaRectangle(401, 225, 150, 30, Color.TRANSPARENT, true);
        
        Label label = new Label("Alun-Alun Kota Jember");
        label.setLayoutX(415);
        label.setLayoutY(230);
        label.setId("myLabel");
        label.setVisible(false);

        Line slopedLine = new Line(350, 300, 400, 240);
        slopedLine.setStroke(Color.WHITE);
        slopedLine.setStrokeWidth(2.0);
        slopedLine.setVisible(false);

        Circle solidCircle = new Circle(350, 300, 3);
        solidCircle.setFill(Color.RED);
        solidCircle.setVisible(false);
        
        Rectangle hover1 = creaRectangle (270, 440, 100, 100, Color.TRANSPARENT, true);
        Rectangle content1 = creaRectangle(401, 415, 160, 30, Color.TRANSPARENT, true);
        
        Label label1 = new Label("Kantor Pemerintah Jember");
        label1.setLayoutX(412);
        label1.setLayoutY(420);
        label1.setId("myLabel");
        label1.setVisible(false);
        
        Line slopedLine1 = new Line(350, 490, 400, 430);
        slopedLine1.setStroke(Color.WHITE);
        slopedLine1.setStrokeWidth(2.0);
        slopedLine1.setVisible(false);

        Circle solidCircle1 = new Circle(350, 490, 3);
        solidCircle1.setFill(Color.RED);
        solidCircle1.setVisible(false);
        
        root.getChildren().addAll(selectedImage, hover,content, label,slopedLine,solidCircle, hover1, content1, label1, slopedLine1, solidCircle1);
        
        hover.setOnMouseEntered(event -> {
            content.setFill(Color.LIGHTGREY);
            label.setVisible(true);
            slopedLine.setVisible(true);
            solidCircle.setVisible(true);
        });

        hover1.setOnMouseEntered(event -> {
            content1.setFill(Color.LIGHTGREY);
            label1.setVisible(true);
            slopedLine1.setVisible(true);
            solidCircle1.setVisible(true);
        });
        
        hover.setOnMouseExited(event -> {
            content.setFill(Color.TRANSPARENT);
            label.setVisible(false);
            slopedLine.setVisible(false);
            solidCircle.setVisible(false);
        });
        
        hover1.setOnMouseExited(event -> {
            content1.setFill(Color.TRANSPARENT);
            label1.setVisible(false);
            slopedLine1.setVisible(false);
            solidCircle1.setVisible(false);
        });
        
        scene.setRoot(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    Circle createCircle(double x, double y, double r, Paint color, boolean visibility) {
        Circle circle = new Circle(x, y, r);
        circle.setFill(color);
        circle.setVisible(visibility);
        return circle;
    }
    
    Rectangle creaRectangle(double x, double y, double w, double h, Paint color, boolean visibilty) {
        Rectangle rectangle = new Rectangle(x, y, w, h);
        rectangle.setFill(color);
        rectangle.setVisible(visibilty);
        return rectangle;
    }
    
//    Group createLabelGroup(){
//        return new Group();
//    }

    
}
