package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import content.Money;

public class MoneyTest {
	@Test
	public void getAmount() {
		
		int i = 10;
		Money money = new Money( i );
		assertEquals(i,money.getAmount());
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void contructeur() {
				
		int i = -10;
		@SuppressWarnings("unused")
		Money money = new Money( i );
			
	}
	
	@Test
	public void toStringBuilder() {
		
		int i = 10000;
		Money money = new Money( i );
		assertEquals("with amount "+i+"$",money.toString());
		
	}

}
