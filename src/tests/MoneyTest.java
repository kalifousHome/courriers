package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import content.Money;

public class MoneyTest {
	@Test
	public void test() {
		int i = 10;
		Money money = new Money( 10 );
		assertEquals(i,money.getAmount());
		try{
			Money m = new Money(-10);
			assertEquals(-10,m.getAmount());
		}
		catch (IllegalArgumentException e){};
	}

}
