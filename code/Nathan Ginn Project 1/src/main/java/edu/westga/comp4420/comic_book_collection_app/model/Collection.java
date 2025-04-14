package edu.westga.comp4420.comic_book_collection_app.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Represents a users collection of comic books
 * 
 * @author Nathan Ginn
 * @version Spring 2025
 */
public class Collection {
	private ObservableList<Series> seriesList;
	private ObservableList<Issue> issueList;
	
	/**
	 * Constructs a new Collection object
	 */
	public Collection() {
		this.seriesList = FXCollections.observableArrayList();
		this.issueList = FXCollections.observableArrayList();
	}
	
	/**
	 * Get the list of series contained in the collection
	 * 
	 * @return the list of comic book series
	 */
	public ObservableList<Series> getSeriesList() {
		return this.seriesList;
	}
	
	/**
	 * Add a Series object to the collection
	 * 
	 * @param newSeries the series to be added
	 * @return true if the series was added otherwise, false
	 */
	public boolean addSeries(Series newSeries) {
		if (newSeries != null && !this.seriesList.contains(newSeries)) {
			this.seriesList.add(newSeries);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Get the list of issues contained in the collection
	 * 
	 * @return the list of comic book issues
	 */
	public ObservableList<Issue> getIssueList() {
		return this.issueList;
	}
	
	/**
	 * Add an Issue object to the collection
	 * 
	 * @param newIssue the issue to be added
	 * @return true if the issue was added otherwise, false
	 */
	public boolean addIssue(Issue newIssue) {
		if (newIssue != null && !this.issueList.contains(newIssue)) {
			this.issueList.add(newIssue);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Remove all Issue objects and Series objects from the collection
	 */
	public void clear() {
		this.issueList.clear();
		this.seriesList.clear();
	}
	
	public String toString() {
		String output = "";
		
		for (Series current: this.seriesList) {
			output += (current.getTitle() + ", ");
		}
		
		return output;
	}
}