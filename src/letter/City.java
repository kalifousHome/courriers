package letter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class City {
	
	//ATTRIBUTS
	protected final String name;
	protected ArrayList<Letter> postbox;
	protected StringBuilder currentState;
	

	//CONSTRUCTOR(S)
	/**
	 * Constructs a new city with the specified name 
	 * @param name - the name 
	 */
	public City(String name) {
		this.name = name;
		this.postbox = new ArrayList<Letter>();
		currentState = new StringBuilder();
	}
	
	//GETTER(S)
	/**
	 * Getter 
	 * @return
	 */
	public String getName() {
		return this.name ;
	}

	/**
	 * A method to get current date and time 
	 * @return the actual date and time 
	 */
	public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
	
	//METHODS
	
	/**
	 * Add the specified letter to this city's postbox
	 * @param letter the letter
	 */
	public void sendLetter(Letter letter){
		this.postbox.add(letter);
	}
	
	/**
	 * Distribute the letters in the postbox of this City to the Inhabitants and empty the postbox
	 */
	public void distributeLetters(){
		while(!(this.postbox.isEmpty())){
			
			Letter toDistribute = this.postbox.get(0);
			toDistribute.getReceiver().receiveLetter(toDistribute);
			this.postbox.remove(0);
			currentState.append(toDistribute.toString());
			currentState.append("\n");
		}
		
	}
	public String toString(){
		return currentState.toString();
	}
}
