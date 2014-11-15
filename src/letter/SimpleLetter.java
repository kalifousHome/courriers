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
	public String toString() {
		

		StringBuilder s = new StringBuilder();
		s.append(getType());
		s.append(content.toString());
		return s.toString();
		
	}

	@Override
	public String getType() {
		
		return "simple letter ";
	}

}
