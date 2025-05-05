package edu.westga.comp4420.comic_book_collection_app.test.model.series;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import edu.westga.comp4420.comic_book_collection_app.model.Series;
import edu.westga.comp4420.comic_book_collection_app.model.Issue;

class TestSeriesConstructor {
	
	@Test
	public void testConstructorWithValidInput() {
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		
		assertEquals(series1.getTitle(), "Batman");
		assertEquals(series1.getWriter(), "Scott Snyder");
		assertEquals(series1.getArtist(), "Greg Capullo");
		assertEquals(series1.getPublisher(), "DC");
	}
	
	@Test
	public void testConstructorWithInvalidTitle() {
		assertThrows(NullPointerException.class, () -> {
			Series series1 = new Series(null, "Scott Snyder", "Greg Capullo", "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Series series1 = new Series("", "Scott Snyder", "Greg Capullo", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidWriter() {
		assertThrows(NullPointerException.class, () -> {
			Series series1 = new Series("Batman", null, "Greg Capullo", "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Series series1 = new Series("Batman", "", "Greg Capullo", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidArtist() {
		assertThrows(NullPointerException.class, () -> {
			Series series1 = new Series("Batman", "Scott Snyder", null, "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Series series1 = new Series("Batman", "Scott Snyder", "", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidPublisher() {
		assertThrows(NullPointerException.class, () -> {
			Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "");
		});
	}
	
	@Test
	public void testSettersWithValidInput() {
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		
		series1.setTitle("X-Men");
		series1.setWriter("Chris Claremont");
		series1.setArtist("Jim Lee");
		series1.setPublisher("Marvel");
		
		assertEquals(series1.getTitle(), "X-Men");
		assertEquals(series1.getWriter(), "Chris Claremont");
		assertEquals(series1.getArtist(), "Jim Lee");
		assertEquals(series1.getPublisher(), "Marvel");
	}
	
	@Test
	public void testSettersWithNullInput() {
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		
		assertThrows(NullPointerException.class, () -> {
			series1.setTitle(null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			series1.setWriter(null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			series1.setArtist(null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			series1.setPublisher(null);
		});
	}
	
	@Test
	public void testSettersWithEmptyInput() {
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		
		assertThrows(IllegalArgumentException.class, () -> {
			series1.setTitle("");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			series1.setWriter("");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			series1.setArtist("");
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			series1.setPublisher("");
		});
	}
}