package letter;

import java.util.ArrayList;

public class City {
	
	//ATTRIBUTS
	protected final String name;
	protected ArrayList<Letter> postbox;
	protected StringBuilder currentState;
	protected int date;
	

	//CONSTRUCTOR(S)
	/**
	 * Constructs a new city with the specified name 
	 * @param name - the name 
	 */
	public City(String name) {
		
		this.name = name;
		this.postbox = new ArrayList<Letter>();
		currentState = new StringBuilder();
		date =1;
		
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
	 * Getter
	 * @return the current date of this city
	 */
	public int getDate(){
		return this.date;
	}
	
	//METHODS
	
	/**
	 * Add the specified letter to this city's postbox
	 * @param letter the letter
	 */
	public void sendLetter(Letter letter){
		
		this.postbox.add(letter);
		currentState= new StringBuilder("=> "+ letter.getSender().getName()+" sends to "+letter.getReceiver().getName()+" the "+letter.toString());
		currentState.append("\n");
		
	}
	
	/**
	 * Distribute the letters in the postbox of this City to the Inhabitants and empty the postbox
	 */
	public void distributeLetters(){
		date++;
		currentState = new StringBuilder();
		currentState.append("\n----------DAY ");
		currentState.append(date);
		currentState.append("---------\n\n");
		
		while(!(this.postbox.isEmpty())){
			
			Letter toDistribute = this.postbox.get(0);
			toDistribute.getReceiver().receiveLetter(toDistribute);
			postbox.remove(0);
			currentState.append("<= "+ toDistribute.getReceiver().getName()+ " receives from "+toDistribute.getSender().getName()+" the "+toDistribute.toString());
			currentState.append("\n");
			
		}
		
	}
	public String toString(){
		
		
		return currentState.toString();
	}
	
}
