package tests;

import static org.junit.Assert.*;
import letter.SimpleLetter;
import letter.Urgent;

import org.junit.Test;

public class UrgentTest {

	@Test
	public void getCost() {
		
		SimpleLetter s = new SimpleLetter(null,null,null);
		Urgent u = new Urgent( s );
		assertEquals(u.getCost(),s.getCost()*2);
		
	}

}
