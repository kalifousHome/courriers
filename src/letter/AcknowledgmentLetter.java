package letter;

import content.Content;

/*
 * Class representing aknowledgment letter.
 * They are send to aknowledge the receipt of a registered letter.
 * They contain an aknowledgment receipt which one is a text .
 */

public class AcknowledgmentLetter extends Letter{

	public AcknowledgmentLetter(Inhabitant sender, Inhabitant receiver,
			Content content) {
		super(sender, receiver, content);
	
	}
	/* They are sent for free */
	public static final int cost = 0;
	
	
	@Override
	public int getCost(){
		return cost;
	}
	/*
	 *No action expected 
	 *
	 */
	@Override
	void doAction() {
			
	}
	/* 
	 *@return returns the type of the letter as a readable text: "simple letter" , "promissory letter " etc
	 */
	@Override
	public String getType() {
		return "aknowledgment letter ";
	}
	
}
