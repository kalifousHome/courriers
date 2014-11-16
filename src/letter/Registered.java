package letter;

import content.AcknowledgmentReceipt;

public class Registered extends LetterDecorator{

	public Registered(Letter letter) {
		super(letter);
	}
	/*
	 *@return returns the cost of the letter 
	 */
	@Override
	public int getCost() {
		return decoratedLetter.getCost()*1+15; //surcout de 15 ou 15%
	}
	/**
	 * Executes the different actions to do on the receipt of the letter (depends on the type of the letter) 
	 */
	@Override
	public void doAction(){
		
		decoratedLetter.doAction();
		AcknowledgmentReceipt a = new AcknowledgmentReceipt(receiver, sender);
		AcknowledgmentLetter letter = new AcknowledgmentLetter(receiver, sender,a);
		Usual usualWayToSendALetter = new Usual(letter);
		receiver.sendLetter( usualWayToSendALetter );
		
	}
	/* 
	 *@return returns the type of the letter as a readable text: "simple letter" , "promissory letter " etc
	 */
	@Override
	public String getType() {
		return "registered ";
	}


}
