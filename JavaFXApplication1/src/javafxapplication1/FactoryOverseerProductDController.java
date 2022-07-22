/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class FactoryOverseerProductDController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private VBox vBox;
    @FXML
    private ImageView imagePlaceholder;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selectImageOnClick(ActionEvent event) throws MalformedURLException {
    FileChooser chooser = new FileChooser();
    chooser.setTitle("Open File");
    chooser.getExtensionFilters().addAll(
    new FileChooser.ExtensionFilter("Image Files", "*.png","*.jpeg","*.jpg"  ));
    File file = chooser.showOpenDialog(new Stage());
    if(file != null) {
        String imagepath = file.toURI().toURL().toString();
        System.out.println("file:"+imagepath);
        Image image = new Image(imagepath);
        imagePlaceholder.setImage(image);
    }
    else
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Please Select a File");
        /*alert.setContentText("You didn't select a file!");*/
        alert.showAndWait();
    }
}


    @FXML
    private void save(ActionEvent event) {
    }
    
}
