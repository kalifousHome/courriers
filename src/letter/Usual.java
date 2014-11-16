/**
 * 
 */
package letter;

/**
 * @author kalifou
 *
 */
public class Usual extends LetterDecorator {

	public Usual(Letter letter) {
		super(letter);
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		
		return "";
	}

}
