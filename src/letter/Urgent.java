package letter;
/*
 * Class for the decorator adding features of a Urgent letter .
 * It's only specification is to cost more.
 *  
 */
public class Urgent extends LetterDecorator {

	public Urgent(Letter letter) {
		super(letter);
	}
	/*
	 *@return returns the cost of the letter 
	 */
	@Override
	public int getCost() {
			return decoratedLetter.getCost()*2;
	}

	/**
	 * Executes the different actions to do on the receipt of the letter (depends on the type of the letter) 
	 */
	@Override
	public void doAction(){
				decoratedLetter.doAction();
	}
	/* 
	 *@return returns the type of the letter as a readable text: "simple letter" , "promissory letter " etc
	 */
	@Override
	public String getType() {
		
		return "urgent ";
	}
}
