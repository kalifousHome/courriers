package content;
import letter.Inhabitant;

/*
 * Class representing the content of Aknowledgment Letter as a Text .
 * It's a text aknowledging the receipt of a registered letter.
 */
public class AcknowledgmentReceipt extends Text{

	public AcknowledgmentReceipt(Inhabitant letterReceiver , Inhabitant letterSender) {
		super("");
		
		/*Building the aknowledgment text. */
		StringBuilder s = new StringBuilder("<< ");
		s.append (letterReceiver.getName());
		s.append(" located at ");
		s.append(letterReceiver.getCity().getName());
		s.append(" received the letter from ");
		s.append(letterSender.getName());
		s.append(" located at ");
		s.append(letterSender.getCity().getName());
		s.append("at ");
		s.append(letterSender.getCity().getDate());
		s.append(">>"); 
		/*Setting the text as a content */
		setText(s.toString());
		
	}
	
}
