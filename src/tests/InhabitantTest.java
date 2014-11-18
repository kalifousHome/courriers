package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import letter.City;
import letter.Inhabitant;

import org.junit.Test;

public class InhabitantTest {

	@Test
	public void testGetName() {
		
		Inhabitant i = new Inhabitant(null,"name", 0);
		assertEquals("name",i.getName());
	}

	@Test
	public void testGetBalance(){
		Inhabitant i = new Inhabitant(null, 0 );
		assertEquals(0,i.getBalance());
	}
	
	
	@Test
	public void testGetCity() {
		Inhabitant i = new Inhabitant(null, 0);
		assertNull(i.getCity());
		City testCity = new City(null);
		i = new Inhabitant(testCity, 0);
		assertEquals(testCity , i.getCity());
	}

	@Test
	public void testCreditDebit(){
		Inhabitant i = new Inhabitant(null, 0);
		assertEquals(0, i.getBalance());
		i.credit(25);
		assertEquals(25, i.getBalance());
		i.debit(25);
		assertEquals(0,i.getBalance());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreditException(){
		Inhabitant i = new Inhabitant(null, 0);
		i.credit(-15);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDebitException(){
		Inhabitant i = new Inhabitant(null, 0);
		i.debit(-15);
	}
}
