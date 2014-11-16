package letter;
/* 
 * 
 * Class to decorate letters : it's needed to add features on top of the different types of letter.
 * For instance every type of letter can be features of registered letters, or an urgent letters ,or both a the same time etc.
 * 
 */

public abstract class LetterDecorator extends Letter {
	
	protected Letter decoratedLetter ;
	/*
	 * Initialization
	 */
	public LetterDecorator(Letter letter) {
		
		super(letter.sender,letter.receiver,letter); //content= Letter???
		decoratedLetter = letter;
	
	} 
	/*
	 *No action expected :  No instance of an abstract class can be created and initialized
	 */
	@Override
	void doAction() {}	
	/*
	 *@return returns the content of the letter as a readable text telling the content, the type and the features of the letter.	
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(sender.getName());
		s.append(" sends to ");
		s.append(receiver.getName());
		s.append(" the following ");
		s.append(getType());
		s.append(content.toString());
		return s.toString();
	}
	/*
	 *@ return returns the cost of the letter. 
	 */
	public abstract int getCost();
}
	

	

	

