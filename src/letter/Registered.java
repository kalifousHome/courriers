package letter;

import content.AcknowledgmentReceipt;

public class Registered extends LetterDecorator{

	public Registered(Letter letter) {
		super(letter);
	}

	@Override
	public int getCost() {
		return decoratedLetter.getCost()*1+15; //surcout de 15 ou 15%
	}
	@Override
	public void doAction(){
		
		decoratedLetter.doAction();
		AcknowledgmentReceipt a = new AcknowledgmentReceipt(receiver, sender);
		AcknowledgmentLetter letter = new AcknowledgmentLetter(receiver, sender,a);
		receiver.sendLetter(letter);
		
	}

	@Override
	public String getType() {
		return "registered ";
	}


}
