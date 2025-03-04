package edu.westga.comp4420.comic_book_collection_app.test.model.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import edu.westga.comp4420.comic_book_collection_app.model.Collection;
import edu.westga.comp4420.comic_book_collection_app.model.Series;
import edu.westga.comp4420.comic_book_collection_app.model.Issue;

class TestCollectionConstructor {
	
	@Test
	public void testConstructor() {
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", "DC");
		Collection collection1 = new Collection();
		
		assertTrue(collection1.addSeries(series1));
		assertTrue(collection1.addIssue(issue1));
	}
}