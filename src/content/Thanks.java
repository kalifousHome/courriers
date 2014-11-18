package content;

/*
  * Class representing the content of a Thank  letter as a text.
  *  it's a text sent back after the reception of a promissory letter.
 */	

import letter.Inhabitant;

public class Thanks extends Text{

	public Thanks(Inhabitant moneyReceiver , Inhabitant moneySender){
		super("");
		/*Building the thanks text. */
		StringBuilder s = new StringBuilder("<< Thanks you very much ");
		s.append(moneySender.getName());
		s.append(", I received the money yesterday. ");
		s.append(moneyReceiver.getName());
		s.append(">>");
		/*Setting the text as a content */
		setText(s.toString());
		
	}

}
