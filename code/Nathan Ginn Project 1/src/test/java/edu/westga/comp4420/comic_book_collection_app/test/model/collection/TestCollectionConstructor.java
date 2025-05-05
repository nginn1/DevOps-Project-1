package edu.westga.comp4420.comic_book_collection_app.test.model.collection;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.List;

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
		
		List<Series> collection1SeriesList = collection1.getSeriesList();
		List<Issue> collection1IssueList = collection1.getIssueList();
		
		assertEquals(collection1SeriesList.size(), 1);
		assertEquals(collection1IssueList.size(), 1);
	}
	
	@Test
	public void testSettersWithNullInput() {
		Collection collection1 = new Collection();
		
		assertFalse(collection1.addSeries(null));
		assertFalse(collection1.addIssue(null));
	}
	
	@Test
	public void testSettersWithAlreadyContainedInput() {
		Collection collection1 = new Collection();
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", "DC");
		
		collection1.addSeries(series1);
		collection1.addIssue(issue1);
		
		assertFalse(collection1.addSeries(series1));
		assertFalse(collection1.addIssue(issue1));
	}
	
	@Test
	public void testClearingTheCollection() {
		Collection collection1 = new Collection();
		Series series1 = new Series("Batman", "Scott Snyder", "Greg Capullo", "DC");
		Issue issue1 = new Issue("Batman", 1, "Scott Snyder", "Greg Capullo", "DC");
		
		collection1.addSeries(series1);
		collection1.addIssue(issue1);
		
		collection1.clear();
		
		List<Series> collection1SeriesList = collection1.getSeriesList();
		List<Issue> collection1IssueList = collection1.getIssueList();
		
		assertEquals(collection1SeriesList.size(), 0);
		assertEquals(collection1IssueList.size(), 0);
	}
}