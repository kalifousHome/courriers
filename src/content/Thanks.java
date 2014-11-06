package content;

import letter.Inhabitant;

public class Thanks extends Text{

	public Thanks(Inhabitant moneyReceiver , Inhabitant moneySender){
		super("");
		text =" Thanks you very much "+moneySender.getName()+", I received the money.\n"+moneyReceiver.getName();
		
	}

}
