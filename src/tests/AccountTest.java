package tests;

import static org.junit.Assert.*;
import letter.Account;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testGetBalance() {
		Account acc = new Account();
		assertNotNull(acc);
		assertEquals(0,acc.getBalance());
		acc = new Account(23);
		assertNotNull(acc);
		assertEquals(23,acc.getBalance());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testDebitException() {
		Account acc = new Account();
		acc.debit(-12);
	}

	@Test
	public void testDebit(){
		Account acc = new Account();	
		acc.debit(23);
		assertEquals(-23, acc.getBalance());
	}

	@Test 
	public void testCredit() {
		Account acc = new Account();
		acc.credit(25);
		assertEquals(25, acc.getBalance());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreditException(){
		Account acc = new Account();
		acc.credit(-52);
	}

}
