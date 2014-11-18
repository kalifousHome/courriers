package letter;

import java.util.ArrayList;

public class Inhabitant {
	
	//ATTRIBUTS
	protected String name;
	protected City city;
	protected Account account;
	protected ArrayList<Letter> received;

	
	//CONSTRUCTORS
	/**
	 * Constructs a new Inhabitant with the specified City
	 * @param city - the city
	 */
	public Inhabitant(City city,int account){
		
		this.city = city;
		this.account = new Account(account);
		this.received = new ArrayList<Letter>();
	}
	
	/**
	 * Constructs a new Inhabitant with the specified City and name 
	 * @param city - the city
	 * @param name - the name 
	 */
	public Inhabitant(City city , String name,int account){
		this.city = city;
		this.name = name;
		this.account = new Account(account);
		this.received = new ArrayList<Letter>();
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
		received.doAction();
		this.received.add(received);
	}

	/**
	 * credit the account of this Inhabitant of the specified amount of money
	 * @param amount the amount that will be credited 
	 */
	public void credit(int amount){
		this.account.credit(amount);
	}
	
	/**
	 * debit the specified amount of money from this Inhabitant's account 
	 * @param amount - the amount that will be debited
	 */
	public void debit(int amount){
		this.account.debit(amount);
	}
	
	/**
	 * getter for the balance of this inhabitant's account 
	 * @return the balance of this Inhabitant's Account 
	 */
	public int getBalance(){
		return this.account.getBalance();
	}
	
	
}
