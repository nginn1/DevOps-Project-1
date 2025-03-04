package edu.westga.comp4420.comic_book_collection_app.model;

public class Issue {
	private String seriesTitle;
	private int issueNumber;
	private String writer;
	private String penciler;
	private String inker;
	private String colorist;
	private String publisher;
	
	public Issue(String seriesTitle, int issueNumber, String writer, String penciler, String inker, String colorist, String publisher) {
		this.seriesTitle = seriesTitle;
		this.issueNumber = issueNumber;
		this.writer = writer;
		this.penciler = penciler;
		this.inker = inker;
		this.colorist = colorist;
		this.publisher = publisher;
	}
}