package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import letter.City;
import letter.Inhabitant;
import letter.Letter;
import letter.SimpleLetter;

import org.junit.Test;

import content.Text;


public class CityTest {

	private class TestCity extends City{
		
		public TestCity(String name){
			super(name);
		}
		
		public ArrayList<Letter> getPostbox(){
			return this.postbox;
		}
	}
	
	@Test
	public void nameTest() {
		City city = new City("city");
		assertEquals("city",city.getName());
	}
	
	@Test
	public void sendLetterTest() {
		TestCity city = new TestCity("city");
		Inhabitant inhabitant1 = new Inhabitant(city);
		Inhabitant inhabitant2 = new Inhabitant(city);
		Letter letter = new SimpleLetter(inhabitant1,inhabitant2,new Text("test"));
		ArrayList<Letter> mypostbox = new ArrayList<Letter>();
		mypostbox.add(letter);
		city.sendLetter(letter);
		assertFalse(city.getPostbox().isEmpty());
		assertEquals(mypostbox,city.getPostbox());
	}

	@Test
	public void distributeLetterTest() {
		TestCity city = new TestCity("city");
		Inhabitant inhabitant1 = new Inhabitant(city);
		Inhabitant inhabitant2 = new Inhabitant(city);
		Letter letter = new SimpleLetter(inhabitant1,inhabitant2,new Text("test"));
		city.sendLetter(letter);
		city.distributeLetters();
		assertTrue(city.getPostbox().isEmpty());
	}
	
	
}
