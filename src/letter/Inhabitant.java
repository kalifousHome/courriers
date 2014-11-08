package letter;

import java.util.Set;

public class Inhabitant {
	
	protected String name;
	protected City city;
	protected Account account;
	protected Set<Letter> received;

	//ATTRIBUTS
	
	//CONSTRUCTORS
	/**
	 * Constructs a new Inhabitant with the specified City
	 * @param city - the city
	 */
	public Inhabitant(City city){
		this.city = city;
		this.account = new Account();
	}
	
	/**
	 * Constructs a new Inhabitant with the specified City and name 
	 * @param city - the city
	 * @param name - the name 
	 */
	public Inhabitant(City city , String name){
		this.city = city;
		this.name = name;
	}
	
	//GETTERS
	/**
	 * Getter for the name of this Inhabitant 
	 * @return the name of this Inhabitant / null if this Inhabitant hasn't been constructed with the constructer with the name 
	 */
	public String getName() {
		return this.name;
	}

	public City getCity() {
		return this.city;
	}

	//METHODS
	/**
	 * send the specified letter 
	 * @param letter the letter 
	 */
	public void sendLetter(Letter letter) {
		this.city.sendLetter(letter);
	}

	/**
	 * open the specified Letter and add it to this.received
	 * @param received the letter received
	 */
	public void receiveLetter(Letter received) {
		received.open();
		this.received.add(received);
	}



}