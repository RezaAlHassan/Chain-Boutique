/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import com.sun.javaws.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Reza
 */
public class StartScreenController implements Initializable {

    @FXML
    private AnchorPane content;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adminLinkOnClick(ActionEvent event) throws IOException {
            Parent window1;
    try {
        window1 = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
        Stage window1Stage;
        Scene window1Scene = new Scene(window1, 600, 500);
        window1Stage = NewFXMain.parentWindow;
        window1Stage.setScene(window1Scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void rmLinkOnClick(ActionEvent event) {
                    Parent window1;
    try {
        window1 = FXMLLoader.load(getClass().getResource("RMDashboard.fxml"));
        Stage window1Stage;
        Scene window1Scene = new Scene(window1, 600, 500);
        window1Stage = NewFXMain.parentWindow;
        window1Stage.setScene(window1Scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void raLinkOnClick(ActionEvent event) {
                            Parent window1;
    try {
        window1 = FXMLLoader.load(getClass().getResource("RADashboard.fxml"));
        Stage window1Stage;
        Scene window1Scene = new Scene(window1, 600, 500);
        window1Stage = NewFXMain.parentWindow;
        window1Stage.setScene(window1Scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void foLinkOnClick(ActionEvent event) {
          
        Parent window1;
    try {
        window1 = FXMLLoader.load(getClass().getResource("FactoryOverseerDashboard.fxml"));
        Stage window1Stage;
        Scene window1Scene = new Scene(window1, 600, 500);
        window1Stage = NewFXMain.parentWindow;
        window1Stage.setScene(window1Scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @FXML
    private void shareholderLinkOnClick(ActionEvent event) {
    }
    
}
