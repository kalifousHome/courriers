package letter;

public abstract class LetterDecorator extends Letter {

	protected Letter decoratedLetter ;
	
	public LetterDecorator(Letter letter) {
		super(letter.sender,letter.receiver,letter.content ); //content= Letter???
		decoratedLetter = letter;
	}
	
	@Override
	void doAction() {
	// à garder??
	}		
	
	public abstract int getCost();
}
	

	

	

