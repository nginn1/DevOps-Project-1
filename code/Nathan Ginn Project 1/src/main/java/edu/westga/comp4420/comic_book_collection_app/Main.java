package edu.westga.comp4420.comic_book_collection_app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Entry point for the program
 *
 * @author	Nathan Ginn
 * @version Spring 2025
 */
public class Main extends Application {
	public static final String WINDOW_TITLE = "Comic Book Collection App";
	public static final String GUI_RESOURCE = "view/codebehind/MainWindow.fxml";
	public static final String ADD_SERIES_WINDOW_RESOURCE = "view/codebehind/AddSeriesWindow.fxml";
	public static final String ADD_ISSUE_WINDOW_RESOURCE = "view/codebehind/AddIssueWindow.fxml";
	public static final String VIEW_ISSUE_WINDOW_RESOURCE = "view/codebehind/ViewIssueWindow.fxml";

	/**
	 * JavaFX entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @throws IOException
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Primary Java entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Main.launch(args);
	}
}
