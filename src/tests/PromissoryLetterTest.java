/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import letter.Inhabitant;
import letter.PromissoryLetter;

import org.junit.Test;

import content.Money;

/**
 *
 *
 */
public class PromissoryLetterTest {

	@Test
	public void getCost() {
		
		Inhabitant a =  new Inhabitant(null,"a",10000);
		Inhabitant b =  new Inhabitant(null,"b",10000);
		int amount = 1000;
		Money m  = new Money (amount);
		PromissoryLetter p = new PromissoryLetter(a,b,m);
		assertEquals(1+(int)(0.01*amount),p.getCost());
		
	}

}
