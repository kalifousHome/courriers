package letter;
 
import content.Money;
import content.Thanks;
/**
 * Class representing Letter used to send money
**/

public class PromissoryLetter extends Letter{
	/*
	 * Amount of money to send
	 */
	protected final int amount ;
	/*
	 * Letter send back by the receiver to thank the sender
	 */
	private Letter thanksLetter;
	/**
	 * @param sender the sender of the money
	 * @param receiver the receiver of the money
	 * @param money the money sent
	 **/
	public PromissoryLetter(Inhabitant sender, Inhabitant receiver, Money money) {
		
		super(sender, receiver,money);
		amount = ((Money)content).getAmount();
		
		// Initializing the thank letter with a thank text		
		Thanks thanksText = new Thanks(receiver , sender); 
		thanksLetter = new SimpleLetter(receiver, sender, thanksText) ;
	}
	/**
	 * @return cost of the letter :1+1% of the amount sent
	 **/
	@Override
	int getCost() {
		return 1+(int)(0.01*amount);
	}
	/**
	 * When the letter is received, the receiver sends a thanks letter to the sender
	 **/
	@Override
	void doAction() {
		sender.sendLetter(thanksLetter);
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

}
