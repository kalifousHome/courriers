package content;

import letter.Inhabitant;

public class AcknowledgmentReceipt extends Text{

	public AcknowledgmentReceipt(Inhabitant letterReceiver , Inhabitant letterSender) {
		super("");
		StringBuilder s = new StringBuilder("<< ");
		s.append (letterReceiver.getName());
		s.append(" located at ");
		s.append(letterReceiver.getCity().getName());
		s.append(" received the letter from ");
		s.append(letterSender.getName());
		s.append(" located at ");
		s.append(letterSender.getCity().getName());
		s.append("at ");
		s.append(letterSender.getCity().getDateTime());
		s.append(">>");
		setText(s.toString());
		
	}
	
}
