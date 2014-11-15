/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import letter.Inhabitant;
import letter.SimpleLetter;

import org.junit.Test;

import content.Text;

/**
 * @author kalifou
 *
 */
public class SimpleLetterTest {

	@Test
	public void getContent() {
	
		Text t = new Text("BLABLA");
		SimpleLetter letter = new SimpleLetter(null,null,t);
		assertEquals(letter.getContent(),t);
		
	}
	@Test
	public void getCost() {
		
		SimpleLetter letter = new SimpleLetter(null,null,null);
		assertEquals(letter.getCost(),1);
		
	}@Test
	public void getReceiver() {
		
		Inhabitant b = new Inhabitant(null,"b",0);
		SimpleLetter letter = new SimpleLetter(null,b,null);
		assertEquals(letter.getReceiver(),b);
		
	}@Test
	public void getSender() {
		
		Inhabitant a = new Inhabitant(null,"a",0);
		SimpleLetter letter = new SimpleLetter(a,null,null);
		assertEquals(letter.getSender(),a);
	}

}
