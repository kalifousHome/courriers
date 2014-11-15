package content;

import letter.Inhabitant;

public class Thanks extends Text{

	public Thanks(Inhabitant moneyReceiver , Inhabitant moneySender){
		super("");
		StringBuilder s = new StringBuilder("<< Thanks you very much ");
		s.append(moneySender.getName());
		s.append(", I received the money. ");
		s.append(moneyReceiver.getName());
		s.append(">>");
		setText(s.toString());
		
	}

}
