package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import content.Text;


public class TextTest {

	@Test
	public void toStringBuilder() {
		
		String msg = "Coucou";
		Text t = new Text( msg);
		assertEquals(t.toString(),msg);
		String msg2 = "Chocolat";
		t.setText(msg2);
		assertEquals(msg2,t.toString());
		
	}
	@Test
	public void setText() {
		
		String msg = "Coucou";
		Text t = new Text( msg );
		String msg2 = "Chocolat";
		t.setText(msg2);
		assertEquals(msg2,t.toString());
		
	}

}
