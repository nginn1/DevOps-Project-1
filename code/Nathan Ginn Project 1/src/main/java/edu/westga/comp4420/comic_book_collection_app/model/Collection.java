package edu.westga.comp4420.comic_book_collection_app.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a users collection of comic books
 * 
 * @author Nathan Ginn
 * @version Spring 2025
 */
public class Collection {
	private List<Series> seriesList;
	private List<Issue> issueList;
	
	/**
	 * Constructs a new Collection object
	 */
	public Collection() {
		this.seriesList = new ArrayList<>();
		this.issueList = new ArrayList<>();
	}
	
	/**
	 * Get the list of series contained in the collection
	 * 
	 * @return the list of comic book series
	 */
	public List<Series> getSeriesList() {
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
	public List<Issue> getIssueList() {
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
}