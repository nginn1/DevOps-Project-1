package edu.westga.comp4420.comic_book_collection_app.model;

public class Issue {
	private String seriesTitle;
	private int issueNumber;
	private String writer;
	private String artist;
	private String publisher;
	
	public Issue(String seriesTitle, int issueNumber, String writer, String artist, String publisher) {
		if (seriesTitle == null) {
			throw new NullPointerException("Series title must not be null.");
		}
		if (seriesTitle.isEmpty()) {
			throw new IllegalArgumentException("Series title must not be empty.");
		}
		if (issueNumber < 0) {
			throw new IllegalArgumentException("Issue Number must be greater than or equal to 0.");
		}
		if (writer == null) {
			throw new NullPointerException("Writer must not be null.");
		}
		if (writer.isEmpty()) {
			throw new IllegalArgumentException("Writer must not be empty.");
		}
		if (artist == null) {
			throw new NullPointerException("Artist must not be null.");
		}
		if (artist.isEmpty()) {
			throw new IllegalArgumentException("Artist must not be empty.");
		}
		if (publisher == null) {
			throw new NullPointerException("Publisher must not be null.");
		}
		if (publisher.isEmpty()) {
			throw new IllegalArgumentException("Publisher must not be empty.");
		}
		
		this.seriesTitle = seriesTitle;
		this.issueNumber = issueNumber;
		this.writer = writer;
		this.artist = artist;
		this.publisher = publisher;
	}
	
	public String getSeriesTitle() {
		return this.seriesTitle;
	}
	
	public int getIssueNumber() {
		return this.issueNumber;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
}