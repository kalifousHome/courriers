package letter;

public class Inhabitant {
	
	protected String name;
	protected City city;

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



}