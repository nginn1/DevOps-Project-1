package edu.westga.comp4420.comic_book_collection_app.test.model.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import edu.westga.comp4420.comic_book_collection_app.model.Issue;

class TestConstructor {
	
	@Test
	public void testConstructorWithValidInput() {
		Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", "DC");
		
		assertEquals(issue1.getSeriesTitle(), "Batman");
		assertEquals(issue1.getIssueNumber(), 1);
		assertEquals(issue1.getWriter(), "Scott Snyder");
		assertEquals(issue1.getArtist(), "Greg Capullo");
		assertEquals(issue1.getPublisher(), "DC");
	}
	
	@Test
	public void testConstructorWithInvalidSeriesTitle() {
		assertThrows(NullPointerException.class, () -> {
			Issue issue1 = new Issue(null, 1, "Scott Snyder", "Greg Capullo", "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Issue issue1 = new Issue("", 1, "Scott Snyder", "Greg Capullo", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidIssueNumber() {
		assertThrows(IllegalArgumentException.class, () -> {
			Issue issue1 = new Issue("Batman", -1, "Scott Snyder", "Greg Capullo","DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidWriter() {
		assertThrows(NullPointerException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, null, "Greg Capullo", "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, "", "Greg Capullo", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidArtist() {
		assertThrows(NullPointerException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, "Scott Snyder", null, "DC");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "", "DC");
		});
	}
	
	@Test
	public void testConstructorWithInvalidPublisher() {
		assertThrows(NullPointerException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", null);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", "");
		});
	}
}