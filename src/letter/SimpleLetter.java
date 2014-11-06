package letter;

import content.Text;

public class SimpleLetter extends Letter {
	protected static final int cost = 1;	
	
	public SimpleLetter(Inhabitant sender, Inhabitant receiver, Text content) {
		super(sender, receiver, content);
		
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public void doAction() {
				//affichage
	}

}
