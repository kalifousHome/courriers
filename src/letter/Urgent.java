package letter;

public class Urgent extends LetterDecorator {

	public Urgent(Letter letter) {
		super(letter);
	}

	@Override
	public int getCost() {
			return decoratedLetter.getCost()*2;
	}

	
	@Override
	public void doAction(){
				decoratedLetter.doAction();
	}

	@Override
	public String getType() {
		
		return "urgent ";
	}
}
