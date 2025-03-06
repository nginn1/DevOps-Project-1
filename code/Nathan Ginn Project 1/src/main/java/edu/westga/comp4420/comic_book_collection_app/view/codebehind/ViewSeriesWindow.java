package edu.westga.comp4420.comic_book_collection_app.view.codebehind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ViewSeriesWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane guiPane;

    @FXML
    void initialize() {
        assert this.guiPane != null : "fx:id=\"guiPane\" was not injected: check your FXML file 'ViewSeriesWindow.fxml'.";

    }

}
