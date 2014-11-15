/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import letter.Inhabitant;
import letter.PromissoryLetter;
import letter.Registered;

import org.junit.Test;

import content.Money;

/**
 * @author kalifou
 *
 */
public class RegisteredTest {

	@Test
	public void getCost() { 
		
		Money m = new Money(1000);
		Inhabitant a = new Inhabitant(null,"a",10000);
		Inhabitant b = new Inhabitant(null,"b",10000);
		PromissoryLetter p = new PromissoryLetter(a,b,m);
		Registered l = new Registered( p );
		assertEquals( l.getCost() , p.getCost()+15);
	}

}
