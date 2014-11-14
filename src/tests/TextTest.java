package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import content.Text;


public class TextTest {

	@Test
	public void test() {
		String msg = "Coucou";
		Text t = new Text( msg);
		assertEquals(t.toString(),msg);
		String msg2 = "Chocolat";
		t.setText(msg2);
		assertEquals(msg2,t.toString());
	}

}
