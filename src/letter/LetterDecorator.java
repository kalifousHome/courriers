package letter;

public abstract class LetterDecorator extends Letter {

	protected Letter decoratedLetter ;
	
	public LetterDecorator(Letter letter) {
		
		super(letter.sender,letter.receiver,letter); //content= Letter???
		decoratedLetter = letter;
	
	}
	
	@Override
	void doAction() {}		
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
	
	public abstract int getCost();
}
	

	

	

