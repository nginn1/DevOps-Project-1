package edu.westga.comp4420.comic_book_collection_app.model;

/**
 * Represents a series of a comic books
 * 
 * @author Nathan Ginn
 * @version Spring 2025
 */
public class Series {
	private String title;
	private String writer;
	private String artist;
	private String publisher;
	
	/**
	* Represents a single issue of a comic book series
	* 
	* @param title the given title
	* @param writer the given writer
	* @param artist the given artist
	* @param publisher the given publisher
	*/
	public Series(String title, String writer, String artist, String publisher) {
		if (title == null) {
			throw new NullPointerException("Title must not be null.");
		}
		if (title.isEmpty()) {
			throw new IllegalArgumentException("Title must not be empty.");
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
		
		this.title = title;
		this.writer = writer;
		this.artist = artist;
		this.publisher = publisher;
	}
	
	/**
	 * Get the series title
	 * 
	 * @return the title of the comic book series
	 */
	public String getTitle() {
		return this.title;
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
	 * Get the artist
	 * 
	 * @return the artist of the comic book series
	 */
	public String getArtist() {
		return this.artist;
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
	 * Set the title of the series
	 *
	 * @param title the given title
	 */
	public void setTitle(String title) {
		if (title == null) {
			throw new NullPointerException("Title can not be null.");
		}
		if (title.isEmpty()) {
			throw new IllegalArgumentException("Title can not be empty.");
		}
		
		this.title = title;
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