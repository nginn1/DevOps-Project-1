package edu.westga.comp4420.comic_book_collection_app.view.codebehind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.stage.Modality;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import edu.westga.comp4420.comic_book_collection_app.model.Series;
import edu.westga.comp4420.comic_book_collection_app.Main;

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
    private Button viewSeriesButton;

    @FXML
    private ListView<Series> collectionListView;

    @FXML
    private Menu collectionMenuButton;
	
	@FXML
    private MenuItem deleteCollectionMenuItem;

    @FXML
    private AnchorPane mainWindowPane;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Label artistLabel;

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
    void addSeries(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(Main.ADD_SERIES_WINDOW_RESOURCE));
			loader.load();
			Parent parent = loader.getRoot();
			Scene scene = new Scene(parent);
			Stage addSeriesStage = new Stage();
			addSeriesStage.setTitle(Main.WINDOW_TITLE);
			addSeriesStage.setScene(scene);
			addSeriesStage.initModality(Modality.APPLICATION_MODAL);

			AddSeriesWindow controller = (AddSeriesWindow) loader.getController();
			
			//controller.setItemList(this.groceryItems.getItems());

			addSeriesStage.show();
		} catch (IOException error) {
			Alert errorBox = new Alert(AlertType.ERROR);
			errorBox.setContentText("Unable to open add series window");
			errorBox.showAndWait();
		}
    }

    @FXML
    void deleteCollection(ActionEvent event) {
		
    }

    @FXML
    void sortAToZ(ActionEvent event) {
		
    }

    @FXML
    void sortZToA(ActionEvent event) {
		
    }
	
	@FXML
    void viewSeries(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert this.addIssueButton != null : "fx:id=\"addIssueButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.addSeriesButton != null : "fx:id=\"addSeriesButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.collectionListView != null : "fx:id=\"collectionListView\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.collectionMenuButton != null : "fx:id=\"collectionMenuButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.mainWindowPane != null : "fx:id=\"mainWindowPane\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.menuBar != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.artistLabel != null : "fx:id=\"artistLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.publisherLabel != null : "fx:id=\"publisherLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.seriesLabel != null : "fx:id=\"seriesLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.sortAscendingButton != null : "fx:id=\"sortAscendingButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.sortDescendingButton != null : "fx:id=\"sortDescendingButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
		assert this.viewSeriesButton != null : "fx:id=\"viewSeriesButton\" was not injected: check your FXML file 'MainWindow.fxml'.";
        assert this.writerLabel != null : "fx:id=\"writerLabel\" was not injected: check your FXML file 'MainWindow.fxml'.";
    }
}
