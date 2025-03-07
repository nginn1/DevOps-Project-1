package edu.westga.comp4420.comic_book_collection_app.model;

/**
 * Represents a single issue of a comic book series
 * 
 * @author Nathan Ginn
 * @version Spring 2025
 */
public class Issue {
	private String seriesTitle;
	private int issueNumber;
	private String writer;
	private String artist;
	private String publisher;

	/**
	 * Constructs a new Issue object
	 *
	 * @param seriesTitle the given title
	 * @param issueNumber the given issue number
	 * @param writer the given writer
	 * @param artist the given artist
	 * @param publisher the given publisher
	 */
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
	
	/**
	 * Get the series title
	 * 
	 * @return the title of the comic book series
	 */
	public String getSeriesTitle() {
		return this.seriesTitle;
	}
	
	/**
	 * Set the series title
	 * 
	 * @param title the given title
	 */
	public void setSeriesTitle(String title) {
		if (title == null) {
			throw new NullPointerException("Series title can not be null.");
		}
		if (title.isEmpty()) {
			throw new IllegalArgumentException("Series title can not be empty.");
		}
		
		this.seriesTitle = title;
	}
	
	/**
	 * Get the issue number
	 * 
	 * @return the issue number
	 */
	public int getIssueNumber() {
		return this.issueNumber;
	}
	
	/**
	 * Set the issue number
	 * 
	 * @param issueNumber the given issue number
	 */
	public void setIssueNumber(int issueNumber) {
		if (issueNumber < 0) {
			throw new IllegalArgumentException("Issue Number has to be greater than or equal to 0.");
		}
		
		this.issueNumber = issueNumber;
	}
	
	/**
	 * Get the writer
	 * 
	 * @return the writer of the comic book series
	 */
	public String getWriter() {
		return this.writer;
	}
	
	/**
	 * Set the writer
	 * 
	 * @param writer the given writer
	 */
	public void setWriter(String writer) {
		if (writer == null) {
			throw new NullPointerException("Writer can not be null.");
		}
		if (writer.isEmpty()) {
			throw new IllegalArgumentException("Writer can not be empty.");
		}
		
		this.writer = writer;
	}
	
	/**
	 * Get the artist
	 * 
	 * @return the artist of the comic book series
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * Set the artist
	 * 
	 * @param artist the given artist
	 */
	public void setArtist(String artist) {
		if (artist == null) {
			throw new NullPointerException("Artist can not be null.");
		}
		if (artist.isEmpty()) {
			throw new IllegalArgumentException("Artist can not be empty.");
		}
		
		this.artist = artist;
	}
	
	/**
	 * Get the publisher
	 * 
	 * @return the publisher of the comic book series
	 */
	public String getPublisher() {
		return this.publisher;
	}
	
	/**
	 * Set the publisher
	 * 
	 * @param publisher the given publisher
	 */
	public void setPublisher(String publisher) {
		if (publisher == null) {
			throw new NullPointerException("Publisher can not be null.");
		}
		if (publisher.isEmpty()) {
			throw new IllegalArgumentException("Publisher can not be empty.");
		}

		this.publisher = publisher;
	}
}