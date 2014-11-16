/**
 * 
 */
package letter;

/**
 * Class for the decorator setting features for usual way to send letters.
 *
 */
public class Usual extends LetterDecorator {

	public Usual(Letter letter) {
		super(letter);
		
	}
	/*
	 *@return returns the cost of the letter 
	 */
	@Override
	public int getCost() {
		// TODO Auto-genercated method stub
		return decoratedLetter.getCost();
	}
	/* 
	 *@return returns the type of the letter as a readable text: "simple letter" , "promissory letter " etc
	 */
	@Override
	public String getType() {
		
		return "";
	}

}
