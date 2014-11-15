package letter;

import content.Content;

public class AcknowledgmentLetter extends Letter{

	public AcknowledgmentLetter(Inhabitant sender, Inhabitant receiver,
			Content content) {
		super(sender, receiver, content);
	
	}

	public static final int cost = 0;
	
	@Override
	public int getCost(){
		return cost;
	}

	@Override
	void doAction() {
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
		return "aknowledgment letter ";
	}
	
}
