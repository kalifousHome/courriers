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
	public void open() {
		// TODO Auto-generated method stub
		
	}
	
}
