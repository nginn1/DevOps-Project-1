package edu.westga.comp4420.comic_book_collection_app.view.codebehind;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
//import javafx.stage.Modality;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
import javafx.stage.Stage;
//import java.io.IOException;

//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;

//import edu.westga.comp4420.comic_book_collection_app.Main;

import edu.westga.comp4420.comic_book_collection_app.model.Series;
import edu.westga.comp4420.comic_book_collection_app.model.Collection;



public class AddSeriesWindow {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Label artistLabel;

    @FXML
    private TextField artistTextField;

    @FXML
    private Button cancelButton;

    @FXML
    private AnchorPane guiPane;

    @FXML
    private Label publisherLabel;

    @FXML
    private TextField publisherTextField;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField titleTextField;

    @FXML
    private Label writerLabel;

    @FXML
    private TextField writerTextField;
	
	private Collection collection;
	
	public void setCollection(Collection collection) {
		this.collection = collection;
	}

    @FXML
    void addSeries(ActionEvent event) {
		Series newSeries = new Series(this.titleTextField.getText(), this.writerTextField.getText(), this.artistTextField.getText(), this.publisherTextField.getText());
		
		if (this.collection != null) {
			this.collection.addSeries(newSeries);
			System.out.println("series added!");
		} else {
			System.out.println("series not added!");
		}
		
		Stage stage = (Stage) this.addButton.getScene().getWindow();
		stage.close();
    }

    @FXML
    void cancel(ActionEvent event) {
		Stage stage = (Stage) this.cancelButton.getScene().getWindow();
		stage.close();
    }
	
/**@FXML
    void addIssue(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource(Main.ADD_ISSUE_WINDOW_RESOURCE));
			loader.load();
			Parent parent = loader.getRoot();
			Scene scene = new Scene(parent);
			Stage addIssueStage = new Stage();
			addIssueStage.setTitle(Main.WINDOW_TITLE);
			addIssueStage.setScene(scene);
			addIssueStage.initModality(Modality.APPLICATION_MODAL);

			AddIssueWindow controller = (AddIssueWindow) loader.getController();
			
			//controller.setItemList(this.groceryItems.getItems());

			addIssueStage.show();
		} catch (IOException error) {
			Alert errorBox = new Alert(AlertType.ERROR);
			errorBox.setContentText("Unable to open add issue window");
			errorBox.showAndWait();
		}
    }
	*/
    @FXML
    void initialize() {
        assert this.guiPane != null : "fx:id=\"guiPane\" was not injected: check your FXML file 'AddSeriesWindow.fxml'.";
		assert this.cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'AddSeriesWindow.fxml'.";
    }

}