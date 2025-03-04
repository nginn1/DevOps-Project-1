package edu.westga.comp4420.comic_book_collection_app.view.codebehind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import edu.westga.comp4420.comic_book_collection_app.model.Series;

public class MainWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addIssueButton;

    @FXML
    private Button addSeriesButton;

    @FXML
    private ListView<Series> collectionListView;

    @FXML
    private Menu collectionMenuButton;

    @FXML
    private Label coloristLabel;

    @FXML
    private Label inkerLabel;

    @FXML
    private Label issueNumberLabel;

    @FXML
    private AnchorPane mainWindowPane;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Label pencilerLabel;

    @FXML
    private Label publisherLabel;

    @FXML
    private Label seriesLabel;

    @FXML
    private Button sortAscendingButton;

    @FXML
    private Button sortDescendingButton;

    @FXML
    private Label writerLabel;

    @FXML
    void initialize() {
        assert this.addIssueButton != null : "fx:id=\"addIssueButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.addSeriesButton != null : "fx:id=\"addSeriesButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.collectionListView != null : "fx:id=\"collectionListView\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.collectionMenuButton != null : "fx:id=\"collectionMenuButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.coloristLabel != null : "fx:id=\"coloristLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.inkerLabel != null : "fx:id=\"inkerLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.issueNumberLabel != null : "fx:id=\"issueNumberLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.mainWindowPane != null : "fx:id=\"mainWindowPane\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.menuBar != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.pencilerLabel != null : "fx:id=\"pencilerLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.publisherLabel != null : "fx:id=\"publisherLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.seriesLabel != null : "fx:id=\"seriesLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.sortAscendingButton != null : "fx:id=\"sortAscendingButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.sortDescendingButton != null : "fx:id=\"sortDescendingButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.writerLabel != null : "fx:id=\"writerLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";

    }

}
