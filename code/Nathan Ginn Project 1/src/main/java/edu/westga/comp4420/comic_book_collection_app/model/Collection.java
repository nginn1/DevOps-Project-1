package edu.westga.comp4420.comic_book_collection_app.model;

import java.util.List;
import java.util.ArrayList;

public class Collection {
	private List<Series> seriesList;
	private List<Issue> issueList;
	
	public Collection() {
		this.seriesList = new ArrayList<>();
		this.issueList = new ArrayList<>();
	}
	
	public List<Series> getSeriesList() {
		return this.seriesList;
	}
	
	public boolean addSeries(Series newSeries) {
		if (newSeries != null && !this.seriesList.contains(newSeries)) {
			this.seriesList.add(newSeries);
			return true;
		} else {
			return false;
		}
	}
	
	public List<Issue> getIssueList() {
		return this.issueList;
	}
	
	public boolean addIssue(Issue newIssue) {
		if (newIssue != null && !this.issueList.contains(newIssue)) {
			this.issueList.add(newIssue);
			return true;
		} else {
			return false;
		}
	}
}