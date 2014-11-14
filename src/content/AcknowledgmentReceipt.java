package content;

import letter.Inhabitant;

public class AcknowledgmentReceipt extends Text{

	public AcknowledgmentReceipt(Inhabitant letterReceiver , Inhabitant letterSender) {
		super("");
		text =letterReceiver.getName()+" located at "+letterReceiver.getCity().getName()+" received the letter from "+letterSender.getName()+" located at "+letterSender.getCity().getName()+ "at "+letterSender.getCity().getDateTime();
	}

}
