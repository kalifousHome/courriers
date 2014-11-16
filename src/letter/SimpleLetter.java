package letter;

import content.Text;

public class SimpleLetter extends Letter {
	protected static final int cost = 1;	
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
		
	}
	/*
	 *@return returns the cost of the letter 
	 */
	@Override
	public int getCost() {
		return cost;
	}
	/**
	 * No action expected.
	 */
	@Override
	public void doAction() {}

	@Override
	public String getType() {
		
		return "simple letter ";
	}

}
