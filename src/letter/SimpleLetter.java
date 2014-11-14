package letter;

import content.Text;

public class SimpleLetter extends Letter {
	protected static final int cost = 1;	
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text text) {
		super(sender, receiver, text);
		
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public void doAction() {
				//affichage
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

}
